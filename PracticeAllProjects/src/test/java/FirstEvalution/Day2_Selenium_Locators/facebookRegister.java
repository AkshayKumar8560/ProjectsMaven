package FirstEvalution.Day2_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class facebookRegister {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //driver.get("");
        driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.manage().window().maximize();
        String title=driver.getTitle();
        System.out.println("title is: "+title);

        // register facebook page
        WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys("Akshay");
        WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
        lastname.sendKeys("Kumar");

        WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("doodwal@gmail.com");
        WebElement email_conf=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        email_conf.sendKeys("doodwal@gmail.com");

        WebElement newpass=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        newpass.sendKeys("Akshay@123");


        WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));

        Select day_select=new Select(day);
        day_select.selectByValue("10");

        WebElement newmonthspass=driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select select_months=new Select(newmonthspass);
        select_months.selectByValue("5");

        WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select select_year=new Select(year);
        select_year.selectByValue("2001");


        WebElement male=driver.findElement(By.xpath("//input[@value='2']"));
        male.click();

        WebElement submit=driver.findElement(By.xpath("//button[@name='websubmit']"));
        submit.click();



       driver.close();





    }
}
