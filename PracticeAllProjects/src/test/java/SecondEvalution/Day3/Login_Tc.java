package SecondEvalution.Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Login_Tc {
    @Test
    void setUpTest(){
        WebDriver driver;
        driver=new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();

       POM_With_pageFactory pomWithPageFactory= PageFactory.initElements(driver,POM_With_pageFactory.class);
       pomWithPageFactory.LoginVerify("doodwalvikas@gmail.com","Akshay@123");
    }

}
