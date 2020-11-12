import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","/home/milind/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver=new ChromeDriver();
                
        driver.get("https://sciex.com/support/create-account?step=2");
        
//        driver.findElement(By.xpath("//*[@id='navbtn2']")).click();
//        driver.findElement(By.xpath("//*[text()='Request Info']")).click();
//        driver.findElement(By.id("navbtn2")).click();
        
//        driver.findElement(By.name("FirstName")).sendKeys("Milind");
//        driver.findElement(By.name("LastName")).sendKeys("Mohapatra");
//        driver.findElement(By.name("EmailAddress")).sendKeys("milind.mohapatra@ltts.com");
//        driver.findElement(By.name("Company")).sendKeys("LTTS");
//        driver.findElement(By.name("MarketSegment")).sendKeys("Pharma");
//        driver.findElement(By.id("password_create")).sendKeys("milind11");
//        driver.findElement(By.name("confirmpassword")).sendKeys("milind11");
//        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        
        driver.findElement(By.xpath("//*[@name='FirstName']")).sendKeys("Milind");
        driver.findElement(By.xpath("//*[@name='LastName']")).sendKeys("Mohapatra");
        driver.findElement(By.xpath("//*[@name='EmailAddress']")).sendKeys("milind.mohapatra@ltts.com");
        driver.findElement(By.xpath("//*[@name='Company']")).sendKeys("LTTS");
        driver.findElement(By.xpath("//*[@name='MarketSegment']")).sendKeys("Pharma");
        driver.findElement(By.xpath("//*[@id='password_create']")).sendKeys("milind11");
        driver.findElement(By.xpath("//*[@name='confirmpassword']")).sendKeys("milind11");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        
	}
}
