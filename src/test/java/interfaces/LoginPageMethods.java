package interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface LoginPageMethods {

    public abstract WebElement getWebElement(By Locator);
    public String getPageTitle();
    public String getPageUrl();
    public void enter_username(String username);
    public void enter_password(String password);
    public void click_admin();
    public void click_tccheckbox();
    public void click_sign_in();
    public void clear_username();
    public void clear_password();

}
