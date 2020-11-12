import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegistrationAutomation {

	@Test(description = "Check registration page")
	public void registration() throws Exception {
//		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/Drivers/geckodriver");
//		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Index.html");

		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("mohapatra.milind@gmail.com");
		driver.findElement(By.xpath("//a[@href='Register.html']")).click();
//
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Milind");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Mohapatra");
//
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Cuttack");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mohapatra.milind@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9090480487");

		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();

		driver.findElement(By.xpath("//*[@id='msdd']")).click();
		driver.findElement(By.linkText("English")).click();
		driver.findElement(By.linkText("Hindi")).click();
		driver.findElement(By.xpath("//*[text()='Skills']")).click();

		WebElement dropdown = driver.findElement(By.id("Skills"));
		Select dd = new Select(dropdown);
		dd.selectByVisibleText("Android");

		dropdown = driver.findElement(By.id("countries"));
		dd = new Select(dropdown);
		dd.selectByVisibleText("India");

		driver.findElement(By.xpath("//*[@role='combobox']")).click();
		driver.findElement(By.xpath("//*[@role='combobox']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[@role='combobox']")).sendKeys(Keys.ENTER);

		dropdown = driver.findElement(By.id("yearbox"));
		dd = new Select(dropdown);
		dd.selectByVisibleText("1998");

		dropdown = driver.findElement(By.xpath("//*[@placeholder='Month']"));
		dd = new Select(dropdown);
		dd.selectByVisibleText("August");

		dropdown = driver.findElement(By.xpath("//*[@placeholder='Day']"));
		dd = new Select(dropdown);
		dd.selectByVisibleText("31");

		driver.findElement(By.id("firstpassword")).sendKeys("Abcd@123");
		driver.findElement(By.id("secondpassword")).sendKeys("Abcd@123");

		driver.findElement(By.id("submitbtn")).click();

		Thread.sleep(5000);
		driver.close();
	}

}
