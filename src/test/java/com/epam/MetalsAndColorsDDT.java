package com.epam;

import com.epam.entities.MetalsColorsData;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import com.epam.site.JdiSite;
import com.epam.utils.Reader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Map;

import static com.epam.entities.User.PITER_CHAILOVSKI;
import static com.epam.enums.MenuButtons.METALS_AND_COLORS;
import static com.epam.jdi.uitests.core.settings.JDISettings.logger;
import static com.epam.site.JdiSite.*;

public class MetalsAndColorsDDT extends TestNGBase {


    @DataProvider(name = "provider")
    public Object[] getDataFromJsonFile() {
        Map<String, MetalsColorsData> dataMap = Reader.readFile();
        return dataMap.values().toArray();
    }

    @BeforeClass(alwaysRun = true)
    public void setup() {
        WebSite.init(JdiSite.class);
        logger.info("Run Tests");
        homePage.open();
    }

    @AfterMethod(alwaysRun = true)
    public void refreshPage() {
        JdiSite.metalsColorsPage.headerSection.logout();
    }


    @Test(dataProvider = "provider")
    public void checkPageFunctionality(MetalsColorsData newData) {
        //1. Login on JDI site as Piter Chailovski
        login(PITER_CHAILOVSKI);

        //2. Open Metals & Colors page by Header menu
        homePage.headerSection.selectHeaderMenu(METALS_AND_COLORS);

        //3. Fill form Metals & Colors by data.
        metalsColorsPage.submitForms(newData);

        //4. Result section contains certain data
        metalsColorsPage.resultSection.checkResults(newData);
    }
}
