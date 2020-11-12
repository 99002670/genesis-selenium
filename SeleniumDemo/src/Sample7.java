import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample7 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","/home/milind/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        Thread.sleep(3000);
        
        WebElement alert = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/button"));
        WebElement confirm = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/button"));
        WebElement prompt = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[2]/button"));
        
        alert.click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        
        confirm.click();
        Thread.sleep(3000);    
        driver.switchTo().alert().accept();
        
        confirm.click();
        Thread.sleep(3000);       
        driver.switchTo().alert().dismiss();
        
        prompt.click();
        Thread.sleep(3000);      
        driver.switchTo().alert().sendKeys("Milind");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        
	}

}
