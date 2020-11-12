import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pcadmin\\Downloads\\chromedriver_85\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sciex.com/support/create-account?step=2");
		driver.findElement(By.name("FirstName")).sendKeys("abc");
		String s = driver.findElement(By.name("FirstName")).getAttribute("value");
		System.out.println(s);
		// GETTEXT method
		Thread.sleep(3000);
		String Z = driver
				.findElement(By.xpath(
						"//*[@id=\"body\"]/div[2]/div/div/div/div/div/section/div[3]/form/div[1]/div/p[1]/label/span"))
				.getText();
		System.out.println(Z);
		System.out.println(Z);

	}

}
