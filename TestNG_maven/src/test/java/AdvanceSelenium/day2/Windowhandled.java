package AdvanceSelenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class Windowhandled {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

// Load the website
        driver.get("http://www.naukri.com/");

// It will return the parent window name as a String
        String parent=driver.getWindowHandle();

        Set<String> s=driver.getWindowHandles();

// Now iterate using Iterator
        Iterator<String> I1= s.iterator();

        while(I1.hasNext())
        {

            String child_window=I1.next();


            if(!parent.equals(child_window))
            {
                driver.switchTo().window(child_window);

                System.out.println(driver.switchTo().window(child_window).getTitle());

                driver.close();
            }

        }
       WebElement jobElement= driver.findElement(By.xpath("//a[@title='Search Jobs']"));
       WebElement wfhElement= driver.findElement(By.xpath("//a[@title='Work from home jobs']"));
        Actions actions =new Actions(driver);
        actions.moveToElement(jobElement).perform();
        actions.moveToElement(wfhElement).click().build().perform();
//switch to the parent window
        driver.switchTo().window(parent);

    }
}
