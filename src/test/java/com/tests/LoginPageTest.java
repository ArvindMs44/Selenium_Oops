package com.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.*;

@Listeners(ListenerClass.class)

public class LoginPageTest extends LoginPage {

    @Test(priority = 0)
    public void verifyNavigate(){
        driver.get(ConstantsClass.baseUrl_LoginPage);
    }

    @Test(priority = 1)
    public void verifyUrl(){
        assert getPageUrl().equals(ConstantsClass.baseUrl_LoginPage);
    }

    @Test(priority = 2)
    public void verifyTitle(){
        assert getPageTitle().equals(ConstantsClass.expectedTitle_LoginPage);
    }

    @Test(priority = 3 , dataProvider = "LoginData", dataProviderClass = DataProviderClass.class)
    public void verifyInvalidLogin(String username, String password){
        enter_username(username);
        enter_password(password);
        click_admin();
        click_tccheckbox();
        click_sign_in();
        clear_username();
        clear_password();
    }

    @Test(priority = 4)
    public void verifyValidLogin(){
        enter_username("rahulshettyacademy");
        enter_password("learning");
        click_admin();
        click_tccheckbox();
        click_sign_in();
    }

}
