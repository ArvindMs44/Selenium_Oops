package com.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import pages.CheckoutPage;
import utils.*;

@Listeners(ListenerClass.class)

public class CheckoutPageTest extends CheckoutPage {

    @Test(priority = 0)
    public void verifyNavigate(){
        driver.get(ConstantsClass.baseUrl_HomePage);
    }

    @Test(priority = 1)
    public void verifyProduct() {
        click_iphoneX();
        click_checkoutBtn();
    }

    @Test(priority = 2)
    public void verifyCheckout() throws InterruptedException {
        click_checkout();
        click_tc();
        Thread.sleep(3000);
        click_purchase();
        Assert.assertTrue(success_displayed());
        assert get_successMsg().contains(ConstantsClass.expectedSuccessMsg_CheckoutPage);
    }

}
