import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample8 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","/home/milind/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://emicalculator.net/loan-calculator/#");
        
        driver.manage().window().maximize();
        Thread.sleep(3000);
                
        WebElement element = driver.findElement(By.id("loanamountslider"));
        
        Actions action = new Actions(driver);
        action.dragAndDropBy(element, 100, 0).build().perform();        
        
	}

}
