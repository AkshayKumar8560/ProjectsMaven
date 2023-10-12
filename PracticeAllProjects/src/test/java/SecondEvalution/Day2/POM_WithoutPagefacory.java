package SecondEvalution.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM_WithoutPagefacory {

    WebDriver driver;
    By email= By.xpath("//input[@id='email']");
    By pass= By.xpath("//input[@id='pass']");
    By submitBtn= By.xpath("//button[@name='login']");



    public  POM_WithoutPagefacory(WebDriver driver){
        this.driver=driver;
    }

    public  void  getLoginverify(String emaild,String password){
        WebElement emailLogin=driver.findElement(email);
        emailLogin.sendKeys(emaild);
        WebElement passwordLogin=driver.findElement(pass);
        passwordLogin.sendKeys(password);
        WebElement submit=driver.findElement(submitBtn);
        submit.click();

    }



}
