package com.epam;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import com.epam.site.JdiSite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.epam.entities.MetalsColorsData.INITIAL_DATA;
import static com.epam.entities.MetalsColorsResult.RESULT_DATA;
import static com.epam.entities.User.PITER_CHAILOVSKI;
import static com.epam.enums.MenuButtons.METALS_AND_COLORS;
import static com.epam.jdi.uitests.core.settings.JDISettings.logger;
import static com.epam.site.JdiSite.*;


public class MetalsAndColorsPageTest extends TestNGBase {

    @BeforeClass(alwaysRun = true)
    public static void setUp() {
        WebSite.init(JdiSite.class);
        logger.info("Run Tests");
        homePage.open();
    }

    @AfterMethod(alwaysRun = true)
    public void refreshPage() {
        JdiSite.metalsColorsPage.headerSection.logout();
    }

    @Test
    public void loginTest() {
        //1. Login on JDI site as Piter Chailovski
        login(PITER_CHAILOVSKI);

        //2. Open Metals & Colors page by Header menu
        homePage.headerSection.selectHeaderMenu(METALS_AND_COLORS);

        //3. Fill form Metals & Colors by data.
        metalsColorsPage.submitForms(INITIAL_DATA);

        //4. Result section contains certain data
        metalsColorsPage.resultSection.checkResultLines(RESULT_DATA);
    }
}
