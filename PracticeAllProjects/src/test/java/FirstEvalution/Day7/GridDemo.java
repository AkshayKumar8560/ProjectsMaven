package FirstEvalution.Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GridDemo {
    WebDriver driver;
    @Test(priority = 1)
    void setup() throws MalformedURLException, InterruptedException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WIN11);

        driver=new RemoteWebDriver(new URL("http://localhost:4444"),cap);
        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("Meaning of AKshay Kumar");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();

        Thread.sleep(3000);
        driver.close();
    }
    @Test(priority = 1)
    void setup2() throws MalformedURLException, InterruptedException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("firefox");
        cap.setPlatform(Platform.WIN11);

        driver=new RemoteWebDriver(new URL("http://localhost:4444"),cap);
        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("Meaning of vikas Kumar");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();

        Thread.sleep(3000);
        driver.close();
    }
}
