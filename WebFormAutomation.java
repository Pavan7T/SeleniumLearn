package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebFormAutomation {

	WebDriver driver;

	@Test
	public void fillWebform() throws InterruptedException {
		driver.get("https://demoqa.com/automation-practice-form");

		WebElement user = driver.findElement(By.id("firstName"));
		user.sendKeys("John");
		System.out.println("UserName: " + user.getAttribute("value"));

		WebElement password = driver.findElement(By.id("lastName"));
		password.sendKeys("Doe");
		System.out.println("UserName: " + password.getAttribute("value"));

		driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("john.doe@gmail.com");
		Thread.sleep(4000);
		WebElement gender = driver
				.findElement(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']"));
		if (gender.isDisplayed()) {

			if (!gender.isSelected()) {
				gender.click();
			}
		} else {
			System.out.println("Not Displayed");
		}
		Thread.sleep(4000);
		System.out.println("Orange HRM test case Passed");
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
