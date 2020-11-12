import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","/home/milind/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://sciex.com/support/create-account");
        
//        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        WebElement element = driver.findElement(By.xpath("//*[@id=\"nav\"]/div/ul/li[1]/a"));
        
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div/ul/li[1]/div/div/div/div/div/div[1]/h6/a")).click();
//        driver.close();
        
	}

}
