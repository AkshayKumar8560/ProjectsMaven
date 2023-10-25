package setup;


import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import pages.DashboardPage;

import java.net.URL;
import java.time.Duration;

public class Setup {
    public WebDriver driver;
    @BeforeTest
    @Parameters("browser")
    public void setup(String browser) throws Exception {
        if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }

        else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }
        else if (browser.equalsIgnoreCase("grid_chrome")) {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setBrowserName("chrome");
            cap.setPlatform(Platform.WIN11);
            driver=new RemoteWebDriver(new URL("http://localhost:4444"),cap);

        }
        else if (browser.equalsIgnoreCase("grid_firefox")) {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setBrowserName("firefox");
            cap.setPlatform(Platform.WIN11);
            driver=new RemoteWebDriver(new URL("http://localhost:4444"),cap);

        }

        else {
            throw new Exception("Incorrect Browser");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

   @AfterTest
   public void closeDriver() {
       try {
           if (driver != null) {
               DashboardPage dashboardPage = new DashboardPage(driver);
               dashboardPage.doLogout();
               driver.quit();
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
}

