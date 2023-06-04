package HW06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class task2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);


        WebElement button=driver.findElement(By.xpath("//button[text()='Get New User']"));
        button.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement name=driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        String texts =name.getText();
        System.out.println(texts);
        WebElement lastname=driver.findElement(By.xpath("//p[contains(text(),'Last Name')]"));
        String text =lastname.getText();
        System.out.println(text);


        Thread.sleep(2000);
        closeBrowser();

    }
}
