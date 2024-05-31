package selenium_automation;

import org.openqa.selenium.WebDriver;

public class Main {
    public static void main(String[] args) {
        // Initialize WebDriver (assuming WebDrivers class provides this functionality)
        WebDriver driver = WebDrivers.getDriver(); // or however you initialize the driver

        // Pass WebDriver instance to TestLogin constructor
        TestLogin testLogin = new TestLogin(driver);
        try {
            testLogin.login();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
