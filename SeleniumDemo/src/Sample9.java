import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample9 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/home/milind/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://emicalculator.net/loan-calculator/#");

		driver.manage().window().maximize();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

	}

}
