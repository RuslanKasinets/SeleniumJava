package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        driver.manage().window().maximize();


        WebElement userNameTextBox = driver.findElement(By.id("txtUsername"));
        userNameTextBox.sendKeys("Admin");


        Thread.sleep(2000);

        // driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        userNameTextBox.clear();
        userNameTextBox.sendKeys("Admin");
        WebElement pass = driver.findElement(By.name("txtPassword"));
        pass.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.className("button"));
        loginBtn.click();
        WebElement pimTab=driver.findElement(By.xpath("(//a[@id='menu_pim_viewPimModule'])"));
        pimTab.click();

    }
}