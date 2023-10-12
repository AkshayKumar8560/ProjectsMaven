package FirstEvalution.Day2_Selenium_Locators;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsDemo {
    public static void main(String[] args) {
        System.out.println("Hello");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");



        //1.  implicit wait

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement element= driver.findElement(By.name("q"));
        element.sendKeys("Akshay Kumar"+ Keys.ENTER);


        //2. explicit wait

        WebDriverWait driverWait=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement element1=driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));

         element1.click();


         // fluent wait

        Wait<WebDriver> fluentwait=new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        fluentwait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));


        //
       /* WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(4));
        WebElement el1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
        el1.click();


    Wait<WebDriver> fluent=new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(10))
            .pollingEvery(Duration.ofSeconds(2))
            .ignoring(NoSuchElementException.class);
    fluent.until(ExpectedConditions.elementToBeClickable(By.xpath("")));*/



    }
}
