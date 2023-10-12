package SecondEvalution.Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class VerifyTestCase_POM {
    WebDriver driver;
    @Test
    void setupPOM(){

        driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        POM_WithoutPagefacory pomWithoutPagefacory=new POM_WithoutPagefacory(driver);
        pomWithoutPagefacory.getLoginverify("doodwalakshay122@gmail.com","Akshay@123");
    }

    @AfterMethod
    void teardown(){
        driver.quit();
    }
}
