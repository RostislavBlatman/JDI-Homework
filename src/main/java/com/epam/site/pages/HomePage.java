package com.epam.site.pages;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.site.sections.HeaderSection;

@JPage(url = "index.html", title = "Home Page")
public class HomePage extends WebPage {
    public HeaderSection headerSection;
}
