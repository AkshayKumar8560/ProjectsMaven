package SecondEvalution.Day4.Parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterPassDemo {
  WebDriver driver;
   @BeforeMethod
   void setup(){
       driver=new ChromeDriver();
       driver.get("https://facebook.com");
       driver.manage().window().maximize();
   }

    @Test()
    @Parameters({"email","pass"})
    void veifytest(String email,String pass){
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
    driver.findElement(By.xpath("//button[@name='login']")).click();
    }

}
