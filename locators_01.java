import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_01 {
    public static void main(String[] args) throws InterruptedException {
        // please tell the location of webdriver location here
//        System.setProperty("webdriver.chrome.driver","//path")
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        //driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@title='Accept All']")).click();
        driver.findElement(By.id("email")).sendKeys("Your_Email");
        driver.findElement(By.name("pass")).sendKeys("Your_Password");
        driver.findElement(By.name("login")).click();
        //driver.findElement(By.linkText("Forgot Password?")).click();
        //driver.findElement(By.partialLinkText("Forgot")).click();

    }
}
