package SecondEvalution.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class WindowHandleDemo {
    WebDriver driver;
    @BeforeMethod
    void Setup(){
         driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @Test
    void VerifyWindowsHandle(){
        String parentwindow=driver.getWindowHandle();

        // WebElement opennewTabbtn=driver.findElement(By.id("newTabBtn"));
        WebElement opennewWindowbtn=driver.findElement(By.id("newWindowBtn"));
        opennewWindowbtn.click();
        WebElement enterName=driver.findElement(By.xpath("//input[@id='name']"));
        System.out.println("parent window"+parentwindow);

        Set<String> childwinpdew=driver.getWindowHandles();
        for (String handles:childwinpdew){
            System.out.println("child window"+handles);
            if(!handles.equals(parentwindow)){
                driver.switchTo().window(handles);
                driver.manage().window().maximize();
                WebElement firstName=driver.findElement(By.xpath("//input[@id='firstName']"));
                WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));

                firstName.sendKeys("Akshay");
                lastname.sendKeys("Kumar");
                //driver.close();
            }

        }
        driver.switchTo().window(parentwindow);
        enterName.sendKeys("Akshay Kumar");
        // driver.quit();




    }
}
