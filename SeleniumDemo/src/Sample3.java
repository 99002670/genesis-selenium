import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/milind/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
        
        driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.id("u_1_b")).sendKeys("Milind");
        driver.findElement(By.id("u_1_d")).sendKeys("Mohapatra");
        
        driver.findElement(By.id("u_1_g")).sendKeys("mohapatra.milind@gmail.com");
        driver.findElement(By.id("u_1_j")).sendKeys("mohapatra.milind@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("milind11");
        
        driver.findElement(By.id("day")).sendKeys("31");
        driver.findElement(By.id("month")).sendKeys("Aug");
        driver.findElement(By.id("year")).sendKeys("1998");
        
        System.out.println(driver.findElement(By.xpath("//*[@id=\"u_1_2\"]")).isSelected());
        driver.findElement(By.xpath("//*[@id=\"u_1_2\"]")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"u_1_2\"]")).isSelected());
	}

}
