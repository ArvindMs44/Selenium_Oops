package utils;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider(name = "LoginData")
    public Object[][] LoginData() {
        return new Object[][]{
                {"rahulshettyacademy","Automation"},
                {"Automation","learning"},
                {"Automation","Automation"},
        };
    }
}
