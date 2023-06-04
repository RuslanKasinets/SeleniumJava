package class06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class WindowHandles extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://accounts.google.com/signup";

        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        //        click on the help button and privacy button
        WebElement helpBtn = driver.findElement(By.linkText("Help"));
        helpBtn.click();

        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();


//        get the window handle of the main page and print on console
//        also save it for later use
        String mainPageHandle = driver.getWindowHandle();
        System.out.println("main page handle is :"+mainPageHandle);

        Thread.sleep(2000);


//        get all the window handles and print the titles associated with each window handle
//        on the console

//        get all handles
        Set<String> allHandles = driver.getWindowHandles();
        for (String handle:allHandles){
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Google Account Help")){
                break;
            }



        }System.out.println("the curent page under focus is:"+driver.getTitle());

        driver.switchTo().window(mainPageHandle);
        System.out.println("the focus is on:"+driver.getTitle());


    }
}


