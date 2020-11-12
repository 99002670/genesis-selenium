import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample5 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","/home/milind/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://sciex.com/support/create-account?step=2");
        
//        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        WebElement firstName = driver.findElement(By.name("FirstName"));
        WebElement lastName = driver.findElement(By.name("LastName"));
        
        firstName.sendKeys("Milind");
        lastName.sendKeys("Mohapatra");
        
        Thread.sleep(3000);
        
        System.out.println(firstName.getAttribute("value"));
        System.out.println(lastName.getAttribute("value"));
        
        Thread.sleep(3000);
        
        firstName.clear();
        lastName.clear();
        
//        driver.close();
        
	}

}

