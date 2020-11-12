package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Popup {
	WebDriver driver;

	@Test
	public void init() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver");
		driver = new ChromeDriver();

		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	}

	@Test(dependsOnMethods = "init")
	public void confirmBox() {
		driver.findElement(By.xpath("//button[@class=\"btn btn-default btn-lg\" and text()=\"Click me!\"]")).click();
		driver.switchTo().alert().accept();

		String actual = driver.findElement(By.id("confirm-demo")).getText();
		String expected = "You pressed OK!";
		Assert.assertEquals(actual, expected);
	}

	@Test(dependsOnMethods = "confirmBox")
	public void promptBox() throws Exception {
		driver.findElement(By.xpath("//button[@class=\"btn btn-default btn-lg\" and text()=\"Click for Prompt Box\"]"))
				.click();
		String promptText = "Milind";
		driver.switchTo().alert().sendKeys(promptText);
		driver.switchTo().alert().accept();

		String actual = driver.findElement(By.id("prompt-demo")).getText();
		String expected = "You have entered '" + promptText + "' !";
		Assert.assertEquals(actual, expected);
	}

}
