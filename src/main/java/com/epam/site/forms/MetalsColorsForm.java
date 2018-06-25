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

    @Css(".vertical-group label")
    private CheckList<Nature> elements;

    @JDropdown(jroot = @JFindBy(css = ".colors"),
            jlist = @JFindBy(css = "li"),
            jvalue = @JFindBy(css = ".filter-option")
    )
    private Dropdown color;

    @FindBy(css = "[type='text']")
    private TextField metals;

    // TODO try to combine this elements.
    // TODO you can override some methods, create your own element, etc.
    @FindBy(css = ".salad button")
    private Button vegetablesButton;

    @FindBy(css = ".salad label")
    private CheckList vegetables;
    // !TODO

    @FindBy(css = "#submit-button")
    private Button submit;

    public void submit(MetalsColorsData data) {
        elements.check(data.getElements());
        color.select(data.getColor().value);
        metals.setValue(data.getMetal().value);
        vegetablesButton.click();
        vegetables.select(DEFAULT_VEGETABLE.value);
        // TODO why don't you parametrize field with class ? Generics and so on...
        vegetables.check(data.getVegetables());
        submit.click();
    }
}
