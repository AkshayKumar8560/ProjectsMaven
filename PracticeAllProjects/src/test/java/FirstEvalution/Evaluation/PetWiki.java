package FirstEvalution.Evaluation;

import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class PetWiki {

    public static String getLoadedData(WebDriver driver) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(1))
                .pollingEvery(Duration.ofMillis(250))
                .ignoring(ElementNotInteractableException.class);

        driver.findElement(By.id("load-button")).click();

        try {

            wait.until(ExpectedConditions.elementToBeClickable(By.id("load-button")));
            WebElement content = driver.findElement(By.id("content"));
            return content.getText();

        } catch (TimeoutException ex) {
            return null;
        }

    }


}