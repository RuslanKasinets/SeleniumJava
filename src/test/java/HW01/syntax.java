package HW01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class syntax {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        Thread.sleep(2000);
        WebElement userName=driver.findElement(By.cssSelector("span.form-hint"));
        userName.sendKeys("Ruslan");
        WebElement password=driver.findElement(By.cssSelector("span.form-hint"));
        password.sendKeys("ruuweoo23423");
        driver.close();
    }
}
