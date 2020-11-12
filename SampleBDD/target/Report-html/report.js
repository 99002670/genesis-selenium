$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
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
  "name": "Registration detail",
  "description": "",
  "id": "registration-detail",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 22,
  "name": "Registration with valid details",
  "description": "",
  "id": "registration-detail;registration-with-valid-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "I launch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I enter the URL",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I should see the home screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Definition.i_launch_chrome_browser()"
});
formatter.result({
  "duration": 1307686387,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_enter_the_URL()"
});
formatter.result({
  "duration": 1613226796,
  "status": "passed"
});
formatter.match({
  "location": "Definition.i_should_see_the_home_screen()"
});
formatter.result({
  "duration": 588309,
  "status": "passed"
});
formatter.uri("login2.feature");
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
  "name": "Registration details",
  "description": "",
  "id": "registration-details",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 22,
  "name": "Registration with valid details",
  "description": "",
  "id": "registration-details;registration-with-valid-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "I launch firefox browser",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I enter the icici URL",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I should see the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Definition2.i_launch_firefox_browser()"
});
formatter.result({
  "duration": 2315557080,
  "status": "passed"
});
formatter.match({
  "location": "Definition2.i_enter_the_icici_URL()"
});
formatter.result({
  "duration": 2791635612,
  "status": "passed"
});
formatter.match({
  "location": "Definition2.i_should_see_the_home_page()"
});
formatter.result({
  "duration": 153418,
  "status": "passed"
});
});