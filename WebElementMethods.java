
package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class WebElementMethods {

	WebDriver driver;

	@Test
	public void OrangeHRMLogin() throws InterruptedException {
		driver.get("https://nichethyself.com/tourism/home.html");
		WebElement user = driver.findElement(By.name("userName"));
		// sysouser.isDisplayed()
		System.out.println("Orange HRM test case");
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		// driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

	@BeforeClass
	public void beforeClass() {

	}

	@AfterClass
	public void afterClass() {
		// driver.quit();
	}

}
