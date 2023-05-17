package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationElement {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com");

        driver.manage().window().maximize();
        // send some text  in the email
                     //finde the element                           send some text
        driver.findElement(By.id("email")).sendKeys("ruslankasinets@gmail.com");


        driver.findElement(By.name("pass")).sendKeys("sdfsdfsdf");

        String url=driver.getCurrentUrl();
        System.out.println(url);


        String title=driver.getTitle();
        System.out.println(title);
        if (title.equals("Facebook - log in or sign up")){
            System.out.println("the title is correct");
        }else {
            System.out.println();
        }

        driver.close();
    }
}
