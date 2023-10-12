package SecondEvalution.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.Key;

public class GridDemo {
   @Test
    void setupChrome() throws MalformedURLException {

       DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
       desiredCapabilities.setBrowserName("chrome");
       desiredCapabilities.setPlatform(Platform.WIN11);
       RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.189:4444"),desiredCapabilities);
       driver.get("https://google.com");
       driver.findElement(By.name("q")).sendKeys("Akshay Kumar"+ Keys.ENTER);
       driver.close();
   }
    @Test
    void setupfirefox() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setBrowserName("firefox");
        desiredCapabilities.setPlatform(Platform.WIN11);
        RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.189:4444"),desiredCapabilities);
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Akshay Kumar"+ Keys.ENTER);
        driver.close();
    }

}
