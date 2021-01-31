import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Booking_List {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        //get
        driver.manage().window().maximize();
        driver.navigate().to("https://www.booking.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='ss']")).sendKeys("Bang");
        Thread.sleep(3000);
        List<WebElement> dropdown= driver.findElements(By.xpath("//ul[@role='listbox']/li"));
        for(WebElement d:dropdown){
            System.out.println(d.getAttribute("data-label"));
            if(d.getAttribute("data-label").contains("Downtown"))
            {
                d.click();
                break;
            }
        }
    }
}
