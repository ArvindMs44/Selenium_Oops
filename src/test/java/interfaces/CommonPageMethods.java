package interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface CommonPageMethods {

    public abstract WebElement getWebElement(By Locator);
    public void enter_username(String username);
    public void enter_password(String password);
    public void click_admin();
    public void click_tc();
    public void click_sign_in();
    public void click_iphoneX();
    public void click_checkout();
    public String get_checkoutText();
    public boolean success_displayed();
    public void click_purchase();
    public String get_successMsg();
    public void click_checkoutBtn();
    public void click_tccheckbox();
}
