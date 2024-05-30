package com.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.*;

@Listeners(ListenerClass.class)

public class HomePageTest extends HomePage {

    @Test(priority = 0)
    public void verifyNavigate(){
        driver.get(ConstantsClass.baseUrl_HomePage);
    }

    @Test(priority = 1)
    public void verifyUrl(){
        assert getPageUrl().equals(ConstantsClass.baseUrl_HomePage);
    }

    @Test(priority = 2)
    public void verifyTitle(){
        assert getPageTitle().equals(ConstantsClass.expectedTitle_HomePage);
    }

    @Test(priority = 3)
    public void verifyHeader(){
      Assert.assertTrue(header_displayed());
    }

    @Test(priority = 4)
    public void verifyProduct() {
        click_iphoneX();
        assert (get_checkoutText().trim().contains(ConstantsClass.expectedText_HomePage));
        click_checkout();
    }

}
