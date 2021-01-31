import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_1 {
    public static void main(String[] args) {
        // please tell the location of webdriver location here
//        System.setProperty("webdriver.chrome.driver","//path")
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
}
