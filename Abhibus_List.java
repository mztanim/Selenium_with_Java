import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Abhibus_List {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.abhibus.com/");
        driver.findElement(By.xpath("//input[@id='source']")).sendKeys("Del");
        Thread.sleep(2000);
        List <WebElement> source = driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']/li"));
        for (WebElement s: source){
            System.out.println(s.getText());
            if(s.getText().contains("Gujarat")){
                s.click();
                break;
            }
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Kol");
        Thread.sleep(2000);
        List<WebElement> source1 = driver.findElements(By.xpath("//ul[@id='ui-id-2']/li"));
        for (WebElement s1 : source1) {
            System.out.println(s1.getText());
            if(s1.getText().contains("Koleru")){
                s1.click();
                break;
            }
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"datepicker1\"]")).click();
        List<WebElement> date = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td/a"));
        for(WebElement d: date){
            System.out.println(d.getText());
            if(d.getText().contains("14")){
                d.click();
                break;
            }
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"datepicker2\"]")).click();
        List<WebElement> date2 = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td/a"));
        for(WebElement d2: date2){
            System.out.println(d2.getText());
            if(d2.getText().contains("22")){
                d2.click();
                break;
            }
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='btn btn-main px-5 py-2 border-right-radius']")).click();
    }
}
