import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_operation {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='accept-choices']")).click();
        //driver.switchTo().frame("iframeResult");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        driver.switchTo().alert().sendKeys("Tom");
        //driver.switchTo().alert().accept();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
    }
}
