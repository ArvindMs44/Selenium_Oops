package pages;

import com.basetest.BaseTest;
import interfaces.CheckoutPageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BaseTest implements CheckoutPageMethods{

    private By Purchase = By.xpath("//input[@value='Purchase']");
    private By CheckoutBtn = By.xpath("//a[@class='nav-link btn btn-primary']");
    private By IphoneX = By.xpath("//body[1]/app-root[1]/app-shop[1]/div[1]/div[1]/div[2]/app-card-list[1]/app-card[1]/div[1]/div[2]/button[1]");
    private By Checkout = By.xpath("//button[normalize-space()='Checkout']");
    private By TC = By.xpath("//a[normalize-space()='term & Conditions']");
    private By Close = By.xpath("//button[normalize-space()='Close']");
    private By Success = By.xpath("//div[@class='alert alert-success alert-dismissible']");

    public WebElement getWebElement(By Locator) {return getDriver().findElement(Locator);}
    public String getPageTitle() {
        return getDriver().getTitle();
    }
    public String getPageUrl() {
        return getDriver().getCurrentUrl();
    }
    @Override
    public void click_iphoneX() {
        getWebElement(IphoneX).click();
    }
    @Override
    public boolean success_displayed() {
        return getWebElement(Success).isDisplayed();
    }
    @Override
    public void click_checkout() {
        getWebElement(Checkout).click();
    }
    @Override
    public void click_checkoutBtn() {
        getWebElement(CheckoutBtn).click();
    }

    @Override
    public void click_tc() {
        getWebElement(TC).click();
        getWebElement(Close).click();
    }

    @Override
    public void click_purchase() {
        getWebElement(Purchase).click();
    }

    @Override
    public String get_successMsg() {
        return getWebElement(Success).getText();
    }

}
