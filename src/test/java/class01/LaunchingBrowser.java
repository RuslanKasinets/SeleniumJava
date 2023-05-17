package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    public static void main(String[] args) throws InterruptedException {
       WebDriver driver=new ChromeDriver();
       driver.get("https:/www.google.com");
       //maximize the window
        driver.manage().window().maximize();



       String currentUrl=driver.getCurrentUrl();
        System.out.println("the currenty url of the website id"+currentUrl);

        //get the title of the page
        String title=driver.getTitle();

        System.out.println("the title of the page is"+title);

        // add some time

        Thread.sleep(5000);

       //close brouser
        driver.quit();
    }

}
