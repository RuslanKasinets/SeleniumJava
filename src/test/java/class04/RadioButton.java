package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends CommonMethods {
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement r1=driver.findElement(By.xpath("//input[@value='Male'and @name='optradio']"));
        r1.click();
        boolean r1Isselected=r1.isSelected();
        System.out.println("is select  "+r1Isselected);
        boolean r1isDesplayed=r1.isDisplayed();
        System.out.println("is desplayted  "+r1isDesplayed);
        boolean r1isEnabled=r1.isEnabled();
        System.out.println("is enebled  "+r1isEnabled);

        WebElement r2=driver.findElement(By.xpath("//input[@value='Female'and @name='optradio']"));
        r2.click();

        r1Isselected=r1.isSelected();
        System.out.println("is select  "+r1Isselected);


    }
}
