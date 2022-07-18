package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;


    @BeforeSuite
    public void initialize(){


        WebDriver driver = new ChromeDriver();
        System.setProperty("WebDriver.Chrome.driver", "chromedriver.exe");

        // To maximize browser
        driver.manage().window().maximize();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // To open Gmail site
        driver.get("https://www.allianz.at/de_AT/beratung.html");
    }

    @AfterSuite
    // Test cleanup
    public static void TeardownTest() {
        driver.quit();
    }
}
