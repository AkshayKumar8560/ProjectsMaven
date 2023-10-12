package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Checkbox_radioButton {

    public static void main(String[] args) {
        System.out.println("Hello checkbox");
        WebDriver driver=new ChromeDriver();

       /* driver.get("https://the-internet.herokuapp.com/checkboxes");

        //checkbox

        driver.findElement(By.xpath("//form[@id='checkboxes']/child::input[1]")).click();
        driver.findElement(By.xpath("//form[@id='checkboxes']/child::input[2]")).click();
*/


        //facebook
        //radioButton
       // driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804923%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804923&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D1007805%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwo9unBhBTEiwAipC114a3zhRSnaGMy1nu6xYNtthGo-BwtGEHXggY6Dcu_wAXlrub-9RPthoC52EQAvD_BwE");
       // driver.findElement(By.xpath("//input[@value='1']")).click();

        //driver.findElement(By.xpath("//input[@value='2']")).click();
       // driver.findElement(By.xpath("//input[@value='-1']")).click();

      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.get("https://demoqa.com/radio-button");

        WebElement element=driver.findElement(By.xpath("//label[@for='yesRadio']"));
        element. click();

    }
}
