package com.epam.site.sections;

import com.epam.entities.User;
import com.epam.enums.MenuButtons;
import com.epam.enums.ServiceButtons;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.site.forms.LoginForm;
import org.openqa.selenium.support.FindBy;


public class HeaderSection extends Section {

    @FindBy(css = ".form-horizontal")
    private LoginForm loginForm;

    @FindBy(css = ".profile-photo")
    private Button profilePhoto;

    @FindBy(css = ".dark-gray [href='metals-colors.html']")
    private Button metalsColors;

    @FindBy(css = ".m-l8>li")
    private Menu<MenuButtons> headerMenu;

    @FindBy(css = ".m-l8 .dropdown-menu a")
    private Menu<ServiceButtons> serviceHeaderMenu;


    public void login(User data) {
        profilePhoto.click();
        loginForm.loginAs(data);
    }

    public void goToMetalsColors() {
        metalsColors.click();
    }

    public void selectHeaderMenu(MenuButtons menuButtons) {
        headerMenu.select(menuButtons.value);
    }

    public void selectServiceHeaderMenu(ServiceButtons serviceButtons) {
        if (headerMenu.isDisplayed(MenuButtons.SERVICE.value)) {
            serviceHeaderMenu.select(serviceButtons.value);
        }
    }
}
