package pages;

import com.basetest.BaseTest;
import interfaces.HomePageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseTest implements HomePageMethods {

    private By Header = By.xpath("//a[normalize-space()='ProtoCommerce']");
    private By Checkout = By.xpath("//a[@class='nav-link btn btn-primary']");
    private By IphoneX = By.xpath("//body[1]/app-root[1]/app-shop[1]/div[1]/div[1]/div[2]/app-card-list[1]/app-card[1]/div[1]/div[2]/button[1]");

    public WebElement getWebElement(By Locator) {
        return getDriver().findElement(Locator);
    }
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
    public boolean header_displayed() {
        return getWebElement(Header).isDisplayed();
    }

    @Override
    public void click_checkout() {
        getWebElement(Checkout).click();
    }

    @Override
    public String get_checkoutText() {
        return getWebElement(Checkout).getText();
    }

}
