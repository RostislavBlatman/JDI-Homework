package com.epam.site.forms;

import com.epam.entities.MetalsColorsData;
import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.web.selenium.elements.complex.RadioButtons;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import org.openqa.selenium.support.FindBy;

public class SummaryForm extends Form {
    @FindBy(css = "#odds-selector p")
    private RadioButtons odds;

    @FindBy(css = "#even-selector p")
    private RadioButtons even;

    @FindBy(css = "#calculate-button")
    private IButton calculate;


    public void calculate(MetalsColorsData data) {
        odds.select(data.getOdds());
        even.select(data.getEven());
        calculate.click();
    }
}
