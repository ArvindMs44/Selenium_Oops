package pages;

import com.basetest.BaseTest;
import interfaces.LoginPageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseTest implements LoginPageMethods {

    private By Username = By.xpath("//input[@id='username']");
    private By Password = By.xpath("//input[@id='password']");
    private By Admin = By.xpath("//div[@class='form-check-inline']//label[1]//span[2]");
    private By TC = By.xpath("//input[@id='terms']");
    private By SignIn = By.xpath("//input[@id='signInBtn']");
    @Override
    public WebElement getWebElement(By Locator) {
        return getDriver().findElement(Locator);
    }

    @Override
    public String getPageTitle() {
        return getDriver().getTitle();
    }

    @Override
    public String getPageUrl() {
        return getDriver().getCurrentUrl();
    }

    @Override
    public void enter_username(String username) {getWebElement(Username).sendKeys(username);}

    @Override
    public void enter_password(String password) {
        getWebElement(Password).sendKeys(password);
    }

    @Override
    public void click_admin() {
        getWebElement(Admin).click();
    }

    @Override
    public void click_tccheckbox() {
        getWebElement(TC).click();
    }

    @Override
    public void click_sign_in() {
        getWebElement(SignIn).click();
    }

    @Override
    public void clear_username() {getWebElement(Username).clear();}

    @Override
    public void clear_password() {getWebElement(Password).clear();}

}
