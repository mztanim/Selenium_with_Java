import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateField= driver.findElement(By.id("datepicker"));
        dateField.sendKeys("03/03/1988");
        dateField.sendKeys(Keys.RETURN);
        Thread.sleep(1000);

        driver.quit();
    }
}