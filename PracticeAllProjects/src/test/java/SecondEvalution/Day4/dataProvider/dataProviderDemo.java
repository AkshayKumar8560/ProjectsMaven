package SecondEvalution.Day4.dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderDemo {
    WebDriver driver;
    @BeforeMethod
    void setup(){
        driver=new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();
    }
    @Test(dataProvider = "logindata")
    void Verifydata(String email,String pass){
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
        driver.findElement(By.xpath("//button[@name='login']")).click();

    }
    @DataProvider
    Object[][] logindata(){
        Object[][] data=new Object[2][2];
        data[0][0]="Akshay@Gmail.com";
        data[0][1]="Akshay@122";
        data[1][0]="Akshaydoodwal@Gmail.com";
        data[1][1]="Akshay@12342";

        return data;
    }

}
