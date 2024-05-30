package interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface HomePageMethods {

    public abstract WebElement getWebElement(By Locator);
    public String getPageTitle();
    public String getPageUrl();
    public void click_iphoneX();
    public boolean header_displayed();
    public void click_checkout();
    public String get_checkoutText();

}
