package interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface CheckoutPageMethods {

    public abstract WebElement getWebElement(By Locator);
    public String getPageTitle();
    public String getPageUrl();
    public boolean success_displayed();
    public void click_checkout();
    public void click_tc();
    public void click_purchase();
    public String get_successMsg();
    public void click_checkoutBtn();
    public void click_iphoneX();

}
