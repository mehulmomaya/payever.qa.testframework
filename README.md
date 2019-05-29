# payever.qa.testframework
About the framework : framework is build on the approach of Page Object Model, using Java, Selenium, Cucumber with TestNg and Junit

## Directory Structure
* Root directory -> payer.qa.testframework
* payer.qa.testframework/src/main/java/features -> test features and test scenarios written in cucumber
* payer.qa.testframework/src/main/java/pages -> methods and locators for each page
* payer.qa.testframework/src/main/java/steps -> steps/implementation of each page
* payer.qa.testframework/src/main/java/utilities -> utilities methods for the framework
* payer.qa.testframework/src/main/resources. -> resources such as chrome driver, gecko driver etc
* payer.qa.testframework/src/main/test -> Runner class responsible for running the application
* payer.qa.testframework/screenshots -> screenshots incase the test fails
* payer.qa.testframework/build/reports/index/html -> cucumber generated report

## The framework can be enhanced further with reporting and grid infrastructure with CI/CD tools

How to Run the Tests -
> Go to payer.qa.testframework
> grade build (will run all the scenarios given on runner class)
