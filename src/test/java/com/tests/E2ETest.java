package com.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.CommonPage;
import utils.*;

@Listeners(ListenerClass.class)

public class E2ETest extends CommonPage {

    @Test(priority = 0)
    public void verifyNavigate(){
        driver.get(ConstantsClass.baseUrl_LoginPage);
    }

    @Test(priority = 1)
    public void verifyLogin(){
        enter_username("rahulshettyacademy");
        enter_password("learning");
        click_admin();
        click_tccheckbox();
        click_sign_in();
    }

    @Test(priority = 2)
    public void verifyAddToCart() {
        click_iphoneX();
        assert (get_checkoutText().trim().contains(ConstantsClass.expectedText_HomePage));
        click_checkout();
    }

    @Test(priority = 3)
    public void verifyCheckout() throws InterruptedException {
        click_checkoutBtn();
        click_tc();
        Thread.sleep(3000);
        click_purchase();
        Assert.assertTrue(success_displayed());
        assert get_successMsg().contains(ConstantsClass.expectedSuccessMsg_CheckoutPage);
    }

}
