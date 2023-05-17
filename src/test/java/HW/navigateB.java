package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateB {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.name("customer.firstName")).sendKeys("Liam");
        driver.findElement(By.id("customer.lastName")).sendKeys("Brown");
        driver.findElement(By.id("customer.address.street")).sendKeys("23 Apple Street");
        driver.findElement(By.name("customer.address.city")).sendKeys("Austin");
        driver.findElement(By.id("customer.address.state")).sendKeys("TX");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("78701");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("929-443-4532");
        driver.findElement(By.name("customer.ssn")).sendKeys("234-543");
        driver.findElement(By.name("customer.username")).sendKeys("Lia");
        driver.findElement(By.id("customer.password")).sendKeys("password123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("password123");
        driver.close();

    }
}
