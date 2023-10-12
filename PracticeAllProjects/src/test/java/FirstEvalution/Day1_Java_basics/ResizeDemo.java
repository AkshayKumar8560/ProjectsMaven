package FirstEvalution.Day1_Java_basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ResizeDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/resizable/");
        driver.manage().window().maximize();

        // Switch to frame
        driver.switchTo().frame(0);

        // Element-path store in web-element variable
        WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
        Point location = resize.getLocation();
        int xOffset = location.getX() ;
        int yOffset = location.getY();

        System.out.println(yOffset);
        System.out.println(xOffset);

        Actions act = new Actions(driver);

        // For resizable
        act.clickAndHold(resize).moveByOffset(xOffset/2, yOffset/2).release().perform();

        Thread.sleep(3000);
        driver.quit();
    }
}

