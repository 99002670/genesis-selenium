package StepDefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class Definition {
	WebDriver driver = null;

	@Given("^I open the chrome browser$")
	public void i_open_the_chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/home/milind/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
	}

	@When("^I enter the URL$")
	public void i_enter_the_url() throws Throwable {
		driver.get("https://loan.icicibank.com/asset-portal-all/check-eligibility?loanType=al&WT.mc_id=null");
	}

	@When("^I click on Type of loan$")
	public void i_click_on_type_of_loan() throws Throwable {
		driver.findElement(By.id("carRelspan")).click();
		driver.findElement(By.xpath("//*[text()='New Car Loan']")).click();
	}

	@When("^I enter mobile number$")
	public void i_enter_mobile_number() throws Throwable {
		driver.findElement(By.id("MOBILENUM")).sendKeys("9090480400");
	}

	@When("^I enter first name$")
	public void i_enter_first_name() throws Throwable {
		driver.findElement(By.id("CUSTFIRSTNAME")).sendKeys("Milind");
	}

	@When("^I enter last name$")
	public void i_enter_last_name() throws Throwable {
		driver.findElement(By.id("CUSTLASTNAME")).sendKeys("Mohapatra");
	}

	@When("^I enter city name$")
	public void i_enter_city_name() throws Throwable {
		driver.findElement(By.id("CUSTCOMMUCITY")).sendKeys("Cuttack");
		Thread.sleep(1000);
		driver.findElement(By.id("CUSTCOMMUCITY")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("CUSTCOMMUCITY")).sendKeys(Keys.ENTER);
	}

	@When("^I click on residence type$")
	public void i_click_on_residence_type() throws Throwable {
		driver.findElement(By.id("residancespan")).click();
		driver.findElement(By.xpath("//*[text()='Owned']")).click();
	}

	@When("^I click on year$")
	public void i_click_on_year() throws Throwable {
		driver.findElement(By.id("yrspan_mvce")).click();
		driver.findElement(By.linkText("2017")).click();
	}

	@When("^I click on month$")
	public void i_click_on_month() throws Throwable {
		driver.findElement(By.id("mnthspan")).click();
		driver.findElement(By.linkText("Jun")).click();
	}

	@When("^I enter DOB$")
	public void i_enter_dob() throws Throwable {
		driver.findElement(By.id("DATEOFBIRTH")).sendKeys("31/08/1998");
	}

	@When("^I enter car name$")
	public void i_enter_car_name() throws Throwable {
		driver.findElement(By.id("CAR_MODEL_NAME")).sendKeys("Toyota Etios Cross");
		Thread.sleep(1000);
		driver.findElement(By.id("CAR_MODEL_NAME")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("CAR_MODEL_NAME")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("CAR_MODEL_NAME")).sendKeys(Keys.ENTER);
	}

	@When("^I enter current city name$")
	public void i_enter_current_city_name() throws Throwable {
		driver.findElement(By.id("CITY_NAME")).sendKeys("Mysore");
		Thread.sleep(1000);
		driver.findElement(By.id("CITY_NAME")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("CITY_NAME")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("CAR_MODEL_PRIZE")).click();
	}

	@When("^I click on select employment$")
	public void i_click_on_select_employment() throws Throwable {
		driver.findElement(By.id("selSalspan")).click();
		driver.findElement(By.xpath("//*[text()='Salaried']")).click();
	}

	@When("^I write employer name in company name$")
	public void i_write_employer_name_in_company_name() throws Throwable {
		driver.findElement(By.id("EMPLOYERNAME")).sendKeys("State Bank of India");
		Thread.sleep(1000);
		driver.findElement(By.id("EMPLOYERNAME")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("EMPLOYERNAME")).sendKeys(Keys.ENTER);
	}

	@When("^I click on year of joining and I click on a year$")
	public void i_click_on_year_of_joining_and_i_click_on_a_year() throws Throwable {
		driver.findElement(By.id("yrspan_we")).click();
		driver.findElement(By.linkText("2018")).click();
	}

	@When("^I click on month of joining and click on a month$")
	public void i_click_on_month_of_joining_and_click_on_a_month() throws Throwable {
		driver.findElement(By.id("mnthspan_we")).click();
		driver.findElement(By.linkText("Aug")).click();
	}

	@When("^I click on total work experience$")
	public void i_click_on_total_work_experience() throws Throwable {
		driver.findElement(By.id("totalworkexp")).click();
		driver.findElement(By.linkText("3")).click();
	}

	@When("^I write my salary to monthly net take home salary$")
	public void i_write_my_salary_to_monthly_net_take_home_salary() throws Throwable {
		driver.findElement(By.id("MONTHLY_NET_HM_SAL")).sendKeys("22000");
	}

	@When("^I write my salary to gross fixed monthly salary$")
	public void i_write_my_salary_to_gross_fixed_monthly_salary() throws Throwable {
		driver.findElement(By.id("GROSS_FIXED_M_SAL")).sendKeys("30000");
	}

	@When("^I write the amount of emi paid in total current emi paid$")
	public void i_write_the_amount_of_emi_paid_in_total_current_emi_paid() throws Throwable {
		driver.findElement(By.id("TOTAL_CURR_EMI_PAID")).sendKeys("5000");
	}

	@When("^I click on check eligibility button$")
	public void i_click_on_check_eligibility_button() throws Throwable {
		driver.findElement(By.id("eligibility-btn")).click();
	}

	@Then("^Loan form should open$")
	public void loan_form_should_open() throws Throwable {

	}

	@Then("^New Car Loan should be selected$")
	public void new_car_loan_should_be_selected() throws Throwable {

	}

	@Then("^Mobile number should be displayed$")
	public void mobile_number_should_be_displayed() throws Throwable {

	}

	@Then("^First name should be displayed$")
	public void first_name_should_be_displayed() throws Throwable {

	}

	@Then("^Last name should be displayed$")
	public void last_name_should_be_displayed() throws Throwable {

	}

	@Then("^City should be displayed$")
	public void city_should_be_displayed() throws Throwable {

	}

	@Then("^Owned should be displayed$")
	public void owned_should_be_displayed() throws Throwable {

	}

	@Then("^that year should be displayed$")
	public void that_year_should_be_displayed() throws Throwable {

	}

	@Then("^Jun should be dislpayed$")
	public void jun_should_be_dislpayed() throws Throwable {

	}

	@Then("^DOB should be displayed$")
	public void dob_should_be_displayed() throws Throwable {

	}

	@Then("^Car model should be displayed$")
	public void car_model_should_be_displayed() throws Throwable {

	}

	@Then("^City name should be displayed$")
	public void city_name_should_be_displayed() throws Throwable {

	}

	@Then("^Salary should be displayed$")
	public void salary_should_be_displayed() throws Throwable {

	}

	@Then("^The company name should be displayed$")
	public void the_company_name_should_be_displayed() throws Throwable {

	}

	@Then("^that month should be displayed$")
	public void that_month_should_be_displayed() throws Throwable {

	}

	@Then("^that number of years should be displayed$")
	public void that_number_of_years_should_be_displayed() throws Throwable {

	}

	@Then("^my monthly net take home salary should displayed$")
	public void my_monthly_net_take_home_salary_should_displayed() throws Throwable {

	}

	@Then("^my gross fixed salary should displayed$")
	public void my_gross_fixed_salary_should_displayed() throws Throwable {

	}

	@Then("^my salary should displayed$")
	public void my_salary_should_displayed() throws Throwable {

	}

	@Then("^the form should be submitted$")
	public void the_form_should_be_submitted() throws Throwable {

	}

	@And("^I select New Car Loan$")
	public void i_select_new_car_loan() throws Throwable {

	}

	@And("^I perform Arrow Down action$")
	public void i_perform_arrow_down_action() throws Throwable {

	}

	@And("^I perform Enter Key action$")
	public void i_perform_enter_key_action() throws Throwable {

	}

	@And("^I select Owned$")
	public void i_select_owned() throws Throwable {

	}

	@And("^I click on a year$")
	public void i_click_on_a_year() throws Throwable {

	}

	@And("^I click on Jun$")
	public void i_click_on_jun() throws Throwable {

	}

	@And("^I perform Arrow Down action twice$")
	public void i_perform_arrow_down_action_twice() throws Throwable {

	}

	@And("^I click on Salaried$")
	public void i_click_on_salaried() throws Throwable {

	}

	@And("^I arrow down once and hit enter$")
	public void i_arrow_down_once_and_hit_enter() throws Throwable {

	}

	@And("^I click on a number of years$")
	public void i_click_on_a_number_of_years() throws Throwable {

	}

	@And("^My eligibility should be displayed$")
	public void my_eligibility_should_be_displayed() throws Throwable {

	}

}