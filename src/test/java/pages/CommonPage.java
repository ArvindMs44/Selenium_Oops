package pages;

import com.basetest.BaseTest;
import interfaces.CommonPageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CommonPage extends BaseTest implements CommonPageMethods {

    private By Username = By.xpath("//input[@id='username']");
    private By Password = By.xpath("//input[@id='password']");
    private By Admin = By.xpath("//div[@class='form-check-inline']//label[1]//span[2]");
    private By TCcheckbox = By.xpath("//input[@id='terms']");
    private By SignIn = By.xpath("//input[@id='signInBtn']");
    private By Purchase = By.xpath("//input[@value='Purchase']");
    private By IphoneX = By.xpath("//body[1]/app-root[1]/app-shop[1]/div[1]/div[1]/div[2]/app-card-list[1]/app-card[1]/div[1]/div[2]/button[1]");
    private By Header = By.xpath("//a[normalize-space()='ProtoCommerce']");
    private By Checkout = By.xpath("//a[@class='nav-link btn btn-primary']");
    private By CheckoutBtn = By.xpath("//button[normalize-space()='Checkout']");
    private By TC = By.xpath("//a[normalize-space()='term & Conditions']");
    private By Close = By.xpath("//button[normalize-space()='Close']");
    private By Success = By.xpath("//div[@class='alert alert-success alert-dismissible']");

    @Override
    public WebElement getWebElement(By Locator) {
        return getDriver().findElement(Locator);
    }
    @Override
    public void enter_username(String username) {
        getWebElement(Username).sendKeys(username);
    }
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
        getWebElement(TCcheckbox).click();
    }
    @Override
    public void click_sign_in() {
        getWebElement(SignIn).click();
    }
    @Override
    public void click_purchase() {
        getWebElement(Purchase).click();
    }
    @Override
    public String get_successMsg() {
        return getWebElement(Success).getText();
    }
    @Override
    public void click_checkoutBtn() {
        getWebElement(CheckoutBtn).click();
    }
    @Override
    public void click_iphoneX() {
        getWebElement(IphoneX).click();
    }
    @Override
    public void click_checkout() {
        getWebElement(Checkout).click();
    }
    @Override
    public String get_checkoutText() {
        return getWebElement(Checkout).getText();
    }

    @Override
    public boolean success_displayed() {
        return getWebElement(Success).isDisplayed();
    }

    @Override
    public void click_tc() {
        getWebElement(TC).click();
        getWebElement(Close).click();
    }

}
