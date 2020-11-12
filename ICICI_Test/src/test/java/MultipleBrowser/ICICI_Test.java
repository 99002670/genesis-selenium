package MultipleBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ICICI_Test {
	@Test
	@Parameters("browser")
	public void Verifytitle(String browserName) throws Exception

	{
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"/home/milind/Downloads/geckodriver-v0.27.0-linux32/geckodriver");
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "/home/milind/Downloads/chromedriver_linux64/chromedriver");
			driver = new ChromeDriver();

		}

		driver.get("https://loan.icicibank.com/asset-portal-all/check-eligibility?loanType=al&WT.mc_id=null");

		driver.manage().window().maximize();

		driver.findElement(By.id("carRelspan")).click();
		driver.findElement(By.xpath("//*[text()='New Car Loan']")).click();
		driver.findElement(By.id("MOBILENUM")).sendKeys("9090480300");

		driver.findElement(By.id("CUSTFIRSTNAME")).sendKeys("Milind");
		driver.findElement(By.id("CUSTLASTNAME")).sendKeys("Mohapatra");

		driver.findElement(By.id("CUSTCOMMUCITY")).sendKeys("Cuttack");
		Thread.sleep(1000);
		driver.findElement(By.id("CUSTCOMMUCITY")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("CUSTCOMMUCITY")).sendKeys(Keys.ENTER);

		driver.findElement(By.id("residancespan")).click();
		driver.findElement(By.xpath("//*[text()='Owned']")).click();

		driver.findElement(By.id("yrspan_mvce")).click();
		driver.findElement(By.linkText("2017")).click();
		driver.findElement(By.id("mnthspan")).click();
		driver.findElement(By.linkText("Jun")).click();
		driver.findElement(By.id("DATEOFBIRTH")).sendKeys("31/08/1998");

		driver.findElement(By.id("CAR_MODEL_NAME")).sendKeys("Toyota Etios Cross");
		Thread.sleep(1000);
		driver.findElement(By.id("CAR_MODEL_NAME")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("CAR_MODEL_NAME")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("CAR_MODEL_NAME")).sendKeys(Keys.ENTER);

		driver.findElement(By.id("CITY_NAME")).sendKeys("Mysore");
		Thread.sleep(1000);
		driver.findElement(By.id("CITY_NAME")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("CITY_NAME")).sendKeys(Keys.ENTER);

		driver.findElement(By.id("CAR_MODEL_PRIZE")).click();

		driver.findElement(By.id("selSalspan")).click();
		driver.findElement(By.xpath("//*[text()='Salaried']")).click();

		driver.findElement(By.id("EMPLOYERNAME")).sendKeys("State Bank of India");
		Thread.sleep(1000);
		driver.findElement(By.id("EMPLOYERNAME")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("EMPLOYERNAME")).sendKeys(Keys.ENTER);

		driver.findElement(By.id("yrspan_we")).click();
		driver.findElement(By.linkText("2018")).click();
		driver.findElement(By.id("mnthspan_we")).click();
		driver.findElement(By.linkText("Aug")).click();

		driver.findElement(By.id("totalworkexp")).click();
		driver.findElement(By.linkText("3")).click();
		driver.findElement(By.id("MONTHLY_NET_HM_SAL")).sendKeys("22000");
		driver.findElement(By.id("GROSS_FIXED_M_SAL")).sendKeys("30000");
		driver.findElement(By.id("TOTAL_CURR_EMI_PAID")).sendKeys("5000");

		driver.findElement(By.id("eligibility-btn")).click();

		Thread.sleep(3000);
		driver.close();
	}
}
