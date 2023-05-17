package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateCommand {
    public static void main(String[] args) throws InterruptedException {


        //create  instens
        WebDriver driver = new ChromeDriver();
        //go to doodle.com
        driver.get("https://google.com");
        Thread.sleep(2000);
        driver.navigate().to("https://facebook.com");
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        // go back to previos page
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        //close brouser

        //close the current tab
        driver.close();
    }
}