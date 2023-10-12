package FirstEvalution.day4.POM_Without_Pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_Wthout_Page_Factory {
    // facebook login

    WebDriver driver;

    By email_id=By.xpath("//input[@id='email']");
    By password=By.xpath("//input[@id='pass']");
    By login_btn=By.xpath("//button[@name='login']");

  public POM_Wthout_Page_Factory(WebDriver driver1){
          this.driver=driver1;

    }

    public void loginVerify(String gmail,String pass){

        driver.findElement(email_id).sendKeys(gmail);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(login_btn).click();
    }




}
