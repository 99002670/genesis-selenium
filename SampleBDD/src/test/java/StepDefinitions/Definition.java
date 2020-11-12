package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Definition {
	WebDriver driver;

	@Given("^I launch chrome browser$")
	public void i_launch_chrome_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
		System.out.println("In chrome browser");
		System.setProperty("webdriver.chrome.driver", "/home/milind/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
	}

	@When("^I enter the URL$")
	public void i_enter_the_URL() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
		System.out.println("Enter required URL");
		driver.get("https://loan.icicibank.com/asset-portal-all/check-eligibility?loanType=al&WT.mc_id=null");
	}

	@Then("^I should see the home screen$")
	public void i_should_see_the_home_screen() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
		System.out.println("Show home page");
	}

}
