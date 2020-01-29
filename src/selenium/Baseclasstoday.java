package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclasstoday {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sarvan\\eclipse-workspace\\Manojdurairaj\\baseclass\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	WebElement search = driver.findElement(By.xpath("//input[@name='keyword']"));
	search.sendKeys("Iphone 8");
	WebElement btn = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
	btn.click();
	WebElement Iphone = driver.findElement(By.xpath("//source[@title='Apple iPhone 6s ( 32GB , 2 GB ) Space Grey']"));
	Iphone.click();
	WebElement send = driver.findElement(By.xpath("(//input[@placeholder='Enter your pincode'])[1]"));
	send.sendKeys("600100");
	WebElement ip = driver.findElement(By.xpath("(//p[text()='Apple iPhone 6s  ( 32GB , 2 GB ) Gold'])[1]"));
	ip.click();
}
}

