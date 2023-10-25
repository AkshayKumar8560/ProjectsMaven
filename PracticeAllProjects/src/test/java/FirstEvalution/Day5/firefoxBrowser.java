package FirstEvalution.Day5;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class firefoxBrowser {
    @Test
    void test1(){
       // System.setProperty("webdriver.gecko.driver","C:\\Users\\Akshay Kumar Doodwal\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://google.com");
    }

}
