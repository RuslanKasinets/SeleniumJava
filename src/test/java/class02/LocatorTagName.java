package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorTagName {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();


        List <WebElement>allList=driver.findElements(By.xpath("a"));

        for (WebElement link:allList){
          String  linkOfWebsite=link.getAttribute("href");
            System.out.println(linkOfWebsite);
        }

    }
}
