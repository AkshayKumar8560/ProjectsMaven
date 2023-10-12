package FirstEvalution.Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecutor2 {
    public static void main(String[] args) {
        WebDriver driver;
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com");

      /*  WebElement emailid=driver.findElement(By.xpath("//input[@id='email']"));
        emailid.sendKeys("Akshaydoodwalakshay@gmail.com"); */

        /* WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
        pass.sendKeys("Akshaydoodwalakshay@123"); */

        WebElement btnlogin=driver.findElement(By.xpath("//button[@name='login']"));

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("console.log('Hello Akshay')");


        String url=js.executeScript("return document.URL").toString();
        System.out.println(url);

        String title=js.executeScript("return document.title").toString();
        System.out.println(title);

        String domain=js.executeScript("return document.domain").toString();
        System.out.println(domain);
        js.executeScript("arguments[0].click()",btnlogin);
        js.executeScript("scrollBy(0,300)");
        // js.executeScript("document.getElementById('APjFqb').value='Random text here '");
        js.executeScript("document.getElementById('email').value='Akshaydoodwalakshay@gmail.com'");
        js.executeScript("document.getElementById('pass').value='AKshay@123'");


        js.executeScript("alert('Akshay kumar')");




    }
}
