import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.util.concurrent.TimeUnit;

public class Irctc_Wait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //Implicit wait for all the elements
        driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.DAYS);
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[text()='OK']")).click();

        // Explicit wait > webdriver wait
        //WebDriverWait wait = new WebDriverWait(driver,30);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/button[text()='OK']")));
        //wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/button[text()='OK']"))));

        //Fluent wait
        Wait wait = new FluentWait(driver)
                .withTimeout(50,TimeUnit.SECONDS)
                .pollingEvery(3,TimeUnit.SECONDS)
                .ignoring(Exception.class);
        driver.findElement(By.xpath("//button[text()='OK']")).click();

    }
}
