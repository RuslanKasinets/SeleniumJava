package HW04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dAYS extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement days=driver.findElement(By.xpath("//select[@id='select-demo']"));
        Select select=new Select(days);
        select.selectByValue("Sunday");
        Thread.sleep(2000);
        select.selectByVisibleText("Tuesday");
        Thread.sleep(2000);
        select.selectByVisibleText("Thursday");
        closeBrowser();



    }
}
