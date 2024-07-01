package com.basetest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;
import utils.ScreenRecorderClass;
import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    public WebDriver getDriver() { return driver; }

    @BeforeClass(alwaysRun = true)
    @Parameters("browser")
    public void setUp(@Optional("edge") String browser) throws Exception {
        switch (browser.toLowerCase()) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                WebDriverManager.chromedriver().setup();
                chromeOptions.addArguments("--remote-allow-origins=*");
                chromeOptions.setHeadless(true);
//                ScreenRecorderClass.startRecord("ScreenRecordingChrome");
                driver = new ChromeDriver(chromeOptions);
                break;
            case "edge":
                EdgeOptions edgeOptions = new EdgeOptions();
                WebDriverManager.edgedriver().setup();
                edgeOptions.addArguments("--remote-allow-origins=*");
                edgeOptions.setHeadless(true);
//                ScreenRecorderClass.startRecord("ScreenRecordingEdge");
                driver = new EdgeDriver(edgeOptions);
                break;
            case "firefox":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                WebDriverManager.firefoxdriver().setup();
                firefoxOptions.addArguments("--remote-allow-origins=*");
                firefoxOptions.setHeadless(true);
//                ScreenRecorderClass.startRecord("ScreenRecordingFirefox");
                driver = new FirefoxDriver(firefoxOptions);
                break;
            default:
                throw new IllegalArgumentException("Browser not supported: " + browser);
        }
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
//        ScreenRecorderClass.stopRecord();
        driver.quit();
    }

    @AfterMethod(alwaysRun = true)
    public void sleep() throws InterruptedException { Thread.sleep(5000); }

}
