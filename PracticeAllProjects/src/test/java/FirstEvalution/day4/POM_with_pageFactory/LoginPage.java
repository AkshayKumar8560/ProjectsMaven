package FirstEvalution.day4.POM_with_pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
WebDriver driver;

@FindBy(how = How.XPATH,using = "//input[@id='email']")
    WebElement email_id;


@FindBy(how = How.XPATH,using = "//input[@id='pass']")
    WebElement pass;
@FindBy(how = How.XPATH,using = "//button[@name='login']")
    WebElement login_btn;


public  LoginPage(WebDriver driver1){
    this.driver=driver1;
}

public void loginverify_Page(String gmail,String password){
   email_id.sendKeys(gmail);
   pass.sendKeys(password);
   login_btn.click();
}

}
