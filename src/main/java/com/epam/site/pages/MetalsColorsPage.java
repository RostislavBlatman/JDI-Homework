package com.epam.site.pages;

import com.epam.entities.MetalsColorsData;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.site.forms.MetalsColorsForm;
import com.epam.site.forms.SummaryForm;
import com.epam.site.sections.HeaderSection;
import com.epam.site.sections.ResultSection;


@JPage(url = "metals-colors.html", title = "Metal and Colors")
public class MetalsColorsPage extends WebPage {
    public HeaderSection headerSection;
    public SummaryForm summaryForm;
    public MetalsColorsForm metalsColorsForm;
    public ResultSection resultSection;

    public void submitForms(MetalsColorsData data) {
        // TODO read test scenario carefully, please
        summaryForm.calculate(data);
        metalsColorsForm.submit(data);
    }
}
