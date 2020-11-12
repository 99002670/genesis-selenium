$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ICICI_Test.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "ICICI car loan form test",
  "description": "",
  "id": "icici-car-loan-form-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 22,
  "name": "Registration with valid details",
  "description": "",
  "id": "icici-car-loan-form-test;registration-with-valid-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "I open the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I enter the URL",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Loan form should open",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I click on Type of loan",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I select New Car Loan",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "New Car Loan should be selected",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I enter mobile number",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Mobile number should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "I enter first name",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "First name should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "I enter last name",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "Last name should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I enter city name",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "I perform Arrow Down action",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I perform Enter Key action",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "City should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "I click on residence type",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "I select Owned",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Owned should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "I click on year",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "I click on a year",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "that year should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "I click on month",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "I click on Jun",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "Jun should be dislpayed",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "I enter DOB",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "DOB should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "I enter car name",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "I perform Arrow Down action twice",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "I perform Enter Key action",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "Car model should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "I enter current city name",
  "keyword": "When "
});
formatter.step({
  "line": 55,
  "name": "I perform Arrow Down action",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "I perform Enter Key action",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "City name should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "I click on select employment",
  "keyword": "When "
});
formatter.step({
  "line": 59,
  "name": "I click on Salaried",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "Salary should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "I write employer name in company name",
  "keyword": "When "
});
formatter.step({
  "line": 62,
  "name": "I arrow down once and hit enter",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "The company name should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "I click on year of joining and I click on a year",
  "keyword": "When "
});
formatter.step({
  "line": 65,
  "name": "that year should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 66,
  "name": "I click on month of joining and click on a month",
  "keyword": "When "
});
formatter.step({
  "line": 67,
  "name": "that month should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 68,
  "name": "I click on total work experience",
  "keyword": "When "
});
formatter.step({
  "line": 69,
  "name": "I click on a number of years",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "that number of years should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 71,
  "name": "I write my salary to monthly net take home salary",
  "keyword": "When "
});
formatter.step({
  "line": 72,
  "name": "my monthly net take home salary should displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 73,
  "name": "I write my salary to gross fixed monthly salary",
  "keyword": "When "
});
formatter.step({
  "line": 74,
  "name": "my gross fixed salary should displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 75,
  "name": "I write the amount of emi paid in total current emi paid",
  "keyword": "When "
});
formatter.step({
  "line": 76,
  "name": "my salary should displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 77,
  "name": "I click on check eligibility button",
  "keyword": "When "
});
formatter.step({
  "line": 78,
  "name": "the form should be submitted",
  "keyword": "Then "
});
formatter.step({
  "line": 79,
  "name": "My eligibility should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Definition.i_open_the_chrome_browser()"
});
formatter.result({
  "duration": 1295303417,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_enter_the_url()"
});
formatter.result({
  "duration": 1244195086,
  "status": "passed"
});
formatter.match({
  "location": "Definition.loan_form_should_open()"
});
formatter.result({
  "duration": 37538,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_click_on_type_of_loan()"
});
formatter.result({
  "duration": 149838408,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_select_new_car_loan()"
});
formatter.result({
  "duration": 43455,
  "status": "passed"
});
formatter.match({
  "location": "Definition.new_car_loan_should_be_selected()"
});
formatter.result({
  "duration": 43380,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_enter_mobile_number()"
});
formatter.result({
  "duration": 133783514,
  "status": "passed"
});
formatter.match({
  "location": "Definition.mobile_number_should_be_displayed()"
});
formatter.result({
  "duration": 53897,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_enter_first_name()"
});
formatter.result({
  "duration": 89260632,
  "status": "passed"
});
formatter.match({
  "location": "Definition.first_name_should_be_displayed()"
});
formatter.result({
  "duration": 47329,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_enter_last_name()"
});
formatter.result({
  "duration": 87883539,
  "status": "passed"
});
formatter.match({
  "location": "Definition.last_name_should_be_displayed()"
});
formatter.result({
  "duration": 47227,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_enter_city_name()"
});
formatter.result({
  "duration": 1172551389,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_perform_arrow_down_action()"
});
formatter.result({
  "duration": 39533,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_perform_enter_key_action()"
});
formatter.result({
  "duration": 53288,
  "status": "passed"
});
formatter.match({
  "location": "Definition.city_should_be_displayed()"
});
formatter.result({
  "duration": 36555,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_click_on_residence_type()"
});
formatter.result({
  "duration": 151553822,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_select_owned()"
});
formatter.result({
  "duration": 45020,
  "status": "passed"
});
formatter.match({
  "location": "Definition.owned_should_be_displayed()"
});
formatter.result({
  "duration": 35987,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_click_on_year()"
});
formatter.result({
  "duration": 148407242,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_click_on_a_year()"
});
formatter.result({
  "duration": 46890,
  "status": "passed"
});
formatter.match({
  "location": "Definition.that_year_should_be_displayed()"
});
formatter.result({
  "duration": 43199,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_click_on_month()"
});
formatter.result({
  "duration": 153011867,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_click_on_jun()"
});
formatter.result({
  "duration": 32779,
  "status": "passed"
});
formatter.match({
  "location": "Definition.jun_should_be_dislpayed()"
});
formatter.result({
  "duration": 47726,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_enter_dob()"
});
formatter.result({
  "duration": 148734856,
  "status": "passed"
});
formatter.match({
  "location": "Definition.dob_should_be_displayed()"
});
formatter.result({
  "duration": 34197,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_enter_car_name()"
});
formatter.result({
  "duration": 1299192392,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_perform_arrow_down_action_twice()"
});
formatter.result({
  "duration": 41089,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_perform_enter_key_action()"
});
formatter.result({
  "duration": 27273,
  "status": "passed"
});
formatter.match({
  "location": "Definition.car_model_should_be_displayed()"
});
formatter.result({
  "duration": 39082,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_enter_current_city_name()"
});
formatter.result({
  "duration": 1256348238,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_perform_arrow_down_action()"
});
formatter.result({
  "duration": 30168,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_perform_enter_key_action()"
});
formatter.result({
  "duration": 35665,
  "status": "passed"
});
formatter.match({
  "location": "Definition.city_name_should_be_displayed()"
});
formatter.result({
  "duration": 41557,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_click_on_select_employment()"
});
formatter.result({
  "duration": 150713330,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_click_on_salaried()"
});
formatter.result({
  "duration": 30453,
  "status": "passed"
});
formatter.match({
  "location": "Definition.salary_should_be_displayed()"
});
formatter.result({
  "duration": 59616,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_write_employer_name_in_company_name()"
});
formatter.result({
  "duration": 1211156332,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_arrow_down_once_and_hit_enter()"
});
formatter.result({
  "duration": 37218,
  "status": "passed"
});
formatter.match({
  "location": "Definition.the_company_name_should_be_displayed()"
});
formatter.result({
  "duration": 30326,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_click_on_year_of_joining_and_i_click_on_a_year()"
});
formatter.result({
  "duration": 174505514,
  "status": "passed"
});
formatter.match({
  "location": "Definition.that_year_should_be_displayed()"
});
formatter.result({
  "duration": 21930,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_click_on_month_of_joining_and_click_on_a_month()"
});
formatter.result({
  "duration": 178790301,
  "status": "passed"
});
formatter.match({
  "location": "Definition.that_month_should_be_displayed()"
});
formatter.result({
  "duration": 44274,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_click_on_total_work_experience()"
});
formatter.result({
  "duration": 157271634,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_click_on_a_number_of_years()"
});
formatter.result({
  "duration": 29751,
  "status": "passed"
});
formatter.match({
  "location": "Definition.that_number_of_years_should_be_displayed()"
});
formatter.result({
  "duration": 31424,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_write_my_salary_to_monthly_net_take_home_salary()"
});
formatter.result({
  "duration": 89467678,
  "status": "passed"
});
formatter.match({
  "location": "Definition.my_monthly_net_take_home_salary_should_displayed()"
});
formatter.result({
  "duration": 25346,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_write_my_salary_to_gross_fixed_monthly_salary()"
});
formatter.result({
  "duration": 83668390,
  "status": "passed"
});
formatter.match({
  "location": "Definition.my_gross_fixed_salary_should_displayed()"
});
formatter.result({
  "duration": 34527,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_write_the_amount_of_emi_paid_in_total_current_emi_paid()"
});
formatter.result({
  "duration": 92449151,
  "status": "passed"
});
formatter.match({
  "location": "Definition.my_salary_should_displayed()"
});
formatter.result({
  "duration": 37309,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_click_on_check_eligibility_button()"
});
formatter.result({
  "duration": 1744421185,
  "status": "passed"
});
formatter.match({
  "location": "Definition.the_form_should_be_submitted()"
});
formatter.result({
  "duration": 43565,
  "status": "passed"
});
formatter.match({
  "location": "Definition.my_eligibility_should_be_displayed()"
});
formatter.result({
  "duration": 31700,
  "status": "passed"
});
});