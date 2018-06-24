package com.epam.site;

import com.epam.entities.User;
import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import com.epam.site.forms.LoginForm;
import com.epam.site.pages.HomePage;
import com.epam.site.pages.MetalsColorsPage;
import org.openqa.selenium.support.FindBy;

@JSite("https://epam.github.io/JDI/")
public class JdiSite extends WebSite {
    @JPage(url = "index.html", title = "Home Page")
    public static HomePage homePage;

    @JPage(url = "metals-colors.html", title = "Metal and Colors")
    public static MetalsColorsPage metalsColorsPage;
    @FindBy(css = ".profile-photo")
    public static Label profilePhoto;
    private static LoginForm loginForm;

    public static void login(User user) {
        profilePhoto.click();
        loginForm.loginAs(user);
    }
}
