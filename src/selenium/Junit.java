package selenium;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Junit {
	public static WebDriver m;
	@BeforeClass
	public void beforeclass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sarvan\\eclipse-workspace\\Manojdurairaj\\selenium\\driver\\chromedriver.exe");
		WebDriver m=new ChromeDriver();
		m.get("https://www.adactin.com/HotelApp/Register.php");
}
	@AfterClass
	public void Afterclass() {
		m.quit();
	}
	@Before
@org.junit.Test	
	private void Test() {
	WebElement name = m.findElement(By.name("username"));
	name.sendKeys("manosjdurairaj");

	}

}