import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JScriptExecutor {
    public static void main(String[] args) throws Exception {
        WebDriver driver= new ChromeDriver();
        JavascriptExecutor je = (JavascriptExecutor)  driver;
        driver.get("https://www.cricbuzz.com/");
        WebElement scrollname = driver.findElement(By.xpath("(//a[@title=\"Shanaka set to travel to West Indies for ODIs\"])[2]"));
        je.executeScript("arguments[0].scrollIntoView(true);",scrollname);
        Thread.sleep(3000);
        je.executeScript("arguments[0].click();",scrollname);

    }
}
