package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class icici {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sarvan\\eclipse-workspace\\Manojdurairaj\\selenium\\driver\\chromedriver.exe");
WebDriver my=new ChromeDriver();
my.get("https://netbanking.hdfcbank.com/netbanking/CCLogin.html");
WebElement mn = my.findElement(By.xpath("//img[@src='/gif/login.gif']"));
//mn.sendKeys("a");
//WebElement min = my.findElement(By.id("VALIDATE_CREDENTIALS1"));
mn.click();
Thread.sleep(3000);
Alert a = my.switchTo().alert();
a.accept();

//Alert a = my.switchTo().alert();
//a.accept();
}
}
