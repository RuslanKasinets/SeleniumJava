import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        WebElement newAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
        newAccount.click();
        Thread.sleep(2000);
        WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Tom");
        WebElement lastName=driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Brown");
        WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("TomBrown@gmail.com");
        WebElement reEmail=driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
        reEmail.sendKeys("password1234");
        WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
        month.sendKeys("February");
        WebElement  day=driver.findElement(By.xpath("//select[@id='day']"));
        day.sendKeys("25");
        WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
        year.sendKeys("1988");
        WebElement gender=driver.findElement(By.xpath("//label[text()='Male']"));
        gender.click();
        Thread.sleep(2000);
        WebElement close=driver.findElement(By.xpath("//img[@class='_8idr img']"));
        close.click();
        Thread.sleep(2000);
        driver.close();



    }
}
