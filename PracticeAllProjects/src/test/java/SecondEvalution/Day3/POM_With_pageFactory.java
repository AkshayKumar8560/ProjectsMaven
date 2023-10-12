package SecondEvalution.Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class POM_With_pageFactory {
    WebDriver driver;
    @FindBy (how = How.XPATH,using = "//input[@id='email']")
    WebElement email;
    @FindBy (how = How.XPATH,using = "//input[@id='pass']")
    WebElement pass;
    @FindBy (how = How.XPATH,using = "//button[@name='login']")
    WebElement submitBtn;

    public POM_With_pageFactory(WebDriver driver) {
        this.driver=driver;
    }

    public  void LoginVerify(String emailid,String password){
        email.sendKeys(emailid);
        pass.sendKeys(password);
        submitBtn.click();
    }

}
