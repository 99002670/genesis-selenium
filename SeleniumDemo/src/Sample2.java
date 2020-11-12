import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/milind/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        
//        String text = driver.findElement(By.xpath("//*[@id=\"logInPanelHeading\"]")).getText();
//        String username = driver.findElement(By.id("txtUsername")).getAttribute("value");
//        String password = driver.findElement(By.id("txtPassword")).getAttribute("value");
        
//        Boolean textStatus = driver.findElement(By.xpath("//*[@id=\"logInPanelHeading\"]")).isDisplayed();
                
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/div/div/fieldset/div/div/table/tbody/tr/td[4]/div/a/img")).click();
        
        driver.findElement(By.id("applyleave_txtLeaveType")).sendKeys("US - Personal");
        Thread.sleep(1000);
//        String leaveBalance = driver.findElement(By.id("applyleave_leaveBalance")).getText();
        
        driver.findElement(By.id("applyleave_txtFromDate")).clear();
        driver.findElement(By.id("applyleave_txtFromDate")).sendKeys("2020-10-29");
        driver.findElement(By.id("applyleave_txtToDate")).clear();
        driver.findElement(By.id("applyleave_txtToDate")).sendKeys("2020-10-30");
        
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[1]/h1")).click();
        driver.findElement(By.id("applyleave_partialDays")).sendKeys("All Days");
        driver.findElement(By.id("applyleave_firstDuration_duration")).sendKeys("Half Day");
        driver.findElement(By.id("applyleave_firstDuration_ampm")).sendKeys("Morning");
        driver.findElement(By.id("applyleave_txtComment")).sendKeys("Sick leave");
        
        driver.findElement(By.id("applyBtn")).click();
        
        Thread.sleep(5000);
        driver.findElement(By.id("welcome")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Logout")).click();
	}
}














