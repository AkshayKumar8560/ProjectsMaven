package FirstEvalution.Day1_Java_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
    public static void main(String[] args) {

        System.out.println("Hello Akshay");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com");

        // cssSelector

        // 1 . tag and id  #
        driver.findElement(By.cssSelector("#email")).sendKeys("Akshay@gmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Akshay@123");

        //driver.findElement(By.cssSelector("button#u_0_5_15")).click();

        //2 tag and class
        // driver.findElement(By.cssSelector("button._42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
        //driver.findElement(By.cssSelector("button._42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();


        //3 tag and type
        //driver.findElement(By.cssSelector("button[type='submit']")).click();
        //driver.findElement(By.cssSelector("[type='submit']")).click();

        // 4 tag and attribute

        driver.findElement(By.cssSelector("[name=login]")).click();
        driver.findElement(By.cssSelector("button[name=login]")).click();

    }

}
