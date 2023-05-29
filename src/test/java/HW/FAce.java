package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FAce {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.syntaxtechs.com");

        Thread.sleep(2000);
        WebElement email = driver.findElement(By.xpath("//a[text()='Переводчик']"));
        email.click();
        WebElement translate=driver.findElement(By.xpath("//li[@title='HDrezka Studio']"));
        translate.click();
        Thread.sleep(2000);
        WebElement home=driver.findElement(By.xpath("//a[@title='На главную']"));
        home.click();
        WebElement nowinki=driver.findElement(By.xpath("//a[text()='Новинки']"));
        nowinki.click();
        Thread.sleep(2000);

        driver.close();


    }
}