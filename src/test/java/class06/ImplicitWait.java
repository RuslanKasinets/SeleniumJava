package class06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ImplicitWait extends CommonMethods {
    public static void main(String[] args) {

        String url="https://www.facebook.com/";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.click();

        WebElement crateNewAccountBtn=driver.findElement(By.xpath("//a[text()='Create new account']"));
        sendText("sdhfasdh",firstName);
    }
}
