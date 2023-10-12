package FirstEvalution.Day3_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class paramiterPassing {
    WebDriver driver;
    @BeforeMethod
    public  void setup(){

        driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().deleteAllCookies();
    }
    @Test
    @Parameters({"email","password"})
    public void loginVerify(String gmail,String password){
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(gmail);
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@name='login']")).click();
        System.out.println(gmail);
        System.out.println(password);
    }
    @AfterMethod
   public void tearDown(){
        driver.quit();
    }

}
