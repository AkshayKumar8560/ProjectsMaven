package SecondEvalution.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExicutaor {
    public static void main(String[] args) {
        WebDriver driver;
        driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");

        // eamil,pass

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("document.getElementById('email').value='Akshaydoodwalakshay@gmail.com'");
        js.executeScript("document.getElementById('pass').value='AKshay@123'");
        js.executeScript("document.getElementById('u_0_5_+P').click()");


        WebElement btnlogin=driver.findElement(By.xpath("//button[@name='login']"));
        js.executeScript("arguments[0].click()",btnlogin);

        String url =js.executeScript("return document.URL").toString();
        System.out.println(url);

        String domain =js.executeScript("return document.domain").toString();
        System.out.println(domain);

        String title =js.executeScript("return document.title").toString();
        System.out.println(title);




    }
}
