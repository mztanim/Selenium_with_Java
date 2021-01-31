import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown_01 {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        //get
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@title='Accept All']")).click();
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        Thread.sleep(5000);

        WebElement day= driver.findElement(By.xpath("//select[@id='day']"));

        Select dDay = new Select(day);
        dDay.selectByVisibleText("21");// its from UI
        //dDay.selectByIndex(3);// based on the drop down occurances
        //dDay.selectByValue("3");// it is on value attribute of option tag

        WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));

        Select dMonth = new Select(Month);
        dMonth.selectByValue("6");

        WebElement Year = driver.findElement(By.xpath("//select[@title='Year']"));

        Select dyear = new Select(Year);
        dyear.selectByValue("2001");

        WebElement Gender = driver.findElement(By.xpath("//input[@value='2']"));
        // no need to create Webdriver element like Gender, See line 15.
        Gender.click();









    }
}
