package FirstEvalution.Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecutor {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");

        WebElement firstName=driver.findElement(By.xpath("//input[@id='email']"));
        WebElement lastname=driver.findElement(By.xpath("//input[@id='pass']"));

        firstName.sendKeys("doodwalakshay@gmail.com");
        lastname.sendKeys("Akshay@123");

        WebElement loginBtn=driver.findElement(By.xpath("//button[@name='login']"));

        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;

         javascriptExecutor.executeScript("arguments[0].click();",loginBtn);
        javascriptExecutor.executeScript("alert('Akshay Kumar')");


    }
}
