package selenium;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sarvan\\eclipse-workspace\\Manojdurairaj\\selenium\\driver\\chromedriver.exe");
	WebDriver m=new ChromeDriver();
	m.get("https://www.snapdeal.com/");
	//WebElement search = m.findElement(By.name("keyword"));
	//search.sendKeys("iphone11");
	//Actions ac=new Actions(m);
	//ac.doubleClick(search).perform();
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	
}
}
