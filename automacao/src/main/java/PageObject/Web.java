package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Web {
    private static final String CHROME_DRIVER_PATH = "C:\\Users\\emilly\\drivers\\chromedriver.exe";
    private static final String DEMO_URL = "https://www.grocerycrud.com/v1.x/demo/bootstrap_theme";

    public static WebDriver openChrome() {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
        ChromeOptions options = new ChromeOptions();
        // Add any desired Chrome options here

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Navigate to the demo URL
        driver.get(DEMO_URL);

        return driver;
    }
}
