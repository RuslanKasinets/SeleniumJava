package HW06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class task1 extends CommonMethods {
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        driver.findElement(By.xpath("//button[@id='startButton']")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement text=driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        wait.until(ExpectedConditions.visibilityOf(text));
        System.out.println(text.getText());

        closeBrowser();










    }
}
