package com.epam.site.forms;

import com.epam.entities.MetalsColorsData;
import com.epam.enums.Nature;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.complex.CheckList;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JDropdown;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import org.openqa.selenium.support.FindBy;

import static com.epam.enums.Vegetables.DEFAULT_VEGETABLE;


public class MetalsColorsForm extends Form {

    public SummaryForm summaryForm;

    @Css(".vertical-group label")
    private CheckList<Nature> elements;

    @JDropdown(jroot = @JFindBy(css = ".colors"),
            jlist = @JFindBy(css = "li"),
            jvalue = @JFindBy(css = ".filter-option")
    )
    private Dropdown color;

    @FindBy(css = "[type='text']")
    private TextField metals;

    @FindBy(css = ".salad button")
    private Button vegetablesButton;

    @FindBy(css = ".salad label")
    private CheckList vegetables;

    @FindBy(css = "#submit-button")
    private Button submit;

    public void submit(MetalsColorsData data) {
        summaryForm.calculate(data);
        elements.check(data.getElements());
        color.select(data.getColor());
        metals.setValue(data.getMetal());
        vegetablesButton.click();
        vegetables.select(DEFAULT_VEGETABLE.value);
        for (String vegetable : data.getVegetables()) {
            vegetables.check(vegetable);
        }
        submit.click();
    }
}
