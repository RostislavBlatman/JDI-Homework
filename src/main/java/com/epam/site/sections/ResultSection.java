package com.epam.site.sections;

import com.codeborne.selenide.Condition;
import com.epam.entities.MetalsColorsData;
import com.epam.entities.MetalsColorsResult;
import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.complex.TextList;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class ResultSection extends Section {

    @FindBy(css = ".results li")
    private TextList resultList;

    @FindBy(css = ".summ-res")
    private Text summaryResult;

    @FindBy(css = ".elem-res")
    private Text elementsResult;

    @FindBy(css = ".col-res")
    private Text colorResult;

    @FindBy(css = ".met-res")
    private Text metalResult;

    @FindBy(css = ".sal-res")
    private Text vegetablesResult;

    public void checkResultLines(MetalsColorsResult resultData) {
        summaryResult.shouldHave(Condition.text("Summary: " + resultData.getSummary()));
        elementsResult.shouldHave(Condition.text("Elements: " + resultData.getElements()[0] + ", "
                + resultData.getElements()[1]));
        colorResult.shouldHave(Condition.text("Color: " + resultData.getColor().value));
        metalResult.shouldHave(Condition.text("Metal: " + resultData.getMetal().value));
        vegetablesResult.shouldHave(Condition.text("Vegetables: " + resultData.getVegetables()[0] + ", "
                + resultData.getVegetables()[1]));
    }

    public void checkResults(MetalsColorsData resultData) {
        String[] expectedResult = new MetalsColorsResult().getResult(resultData);
        String logOfSection = resultList.getValue();
        for (String line : expectedResult) {
            System.out.println(line);
            Assert.assertTrue(logOfSection.contains(line), "Wrong value of line for the result section: \n"
                    + line);
        }
    }

}
