package HW04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dayOfBirth extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="https://www.facebook.com/";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement createNewA=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createNewA.click();
        Thread.sleep(2000);
        WebElement days=driver.findElement(By.xpath("//select[@name='birthday_day']"));

        Select select=new Select(days);

        select.selectByVisibleText("2");
        Thread.sleep(2000);

        select.selectByVisibleText("22");
        Thread.sleep(2000);
        select.selectByValue("25");
        closeBrowser();


    }

}
