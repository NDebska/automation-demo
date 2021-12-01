# Test Approach
Test Approach for Google.com - Homepage and Search Results page – by Natalia  Dębska, Nov 2021

1. There are no requirements provided in the task description for Google Homepage and Search Results page on how the websites should work. In a real-life situation (in a project) I would ask BA/PO what is the expected behaviour for the pages, what kind of users will be using the app and what are the device/system requirements for the app (browsers, OS, devices, web users or mobile, etc.) to plan test activities accordingly.

2. Due to the common fact that Google is a top search engine this test approach will be based on assuming it is supposed to return a list of results matching keywords/char sequences provided by the user. Since no clear requirements are provided for the app, testing will be mostly exploratory.

3. Things to verify while testing
·   Homepage - if major elements are displayed
·   Search results page - if major elements are displayed
·   Search functionality - if it works as expected returning proper results matching user keywords
·   Types of input values to a search box:
	- single word
	- two words with a space lowercase
	- two words with a space uppercase
	- very long sequence of words
	- sequence of numbers
	- negative number
	- single special char
	- multiple special chars
	- combination of letters, numbers and special chars
	- no input - empty field - negative test
	- single space - negative test
·   Ways of inputting values to a search box:
	- by user keyboard 
	- by using screen keyboard (cannot be automated as screen keyboard element is not 	displayed on 	chromedriver instance of browser)
	- by using voice recording (cannot be tested via automation in Selenium)
·   Ways of submitting the search:
	- by clicking "Search Results" button
	- by clicking "I'm Feeling Lucky" button
	- by clicking "Enter" button on the keyboard
	- by selecting the element from auto-suggestion list
·   Removing the input from the search box without submitting
·   Navigating from Search results page back to Homepage
·   Responsiveness and stability test:
	-  default size of browser window
	- browser resized with a button
	- manually adjusted browser window size
	- refresh a page multiple times
·   Usability test - if pages are easy to use and intuitive, the font is readable for the user with no problems, the buttons are easy to find, screen keyobard and voice recorder are working
·   Accessibility test - if screen keyboard and voice recorder works for inputting keywords
·   Performance (simple) - response time of loading results can be compared with competetive search engines

4. Additional tests that could be executed if there were requirements specified for that
·   Visual Design - if it is according to requirements
·   Performance (complex) - load testing, stress testing, etc.
·   Security Tests

5. There are numerous tests that can be executed; however, more information would be required to get a better understanding of what type of users the app will have and to better cover risk areas with testing. It would also be very useful for deciding which test cases should be automated and which should  not.

6. Test Automation
Since task description states to test google homepage and search results page, this test approach will not cover testing of Gmail/Images/Google apps/Sign in links to other apps/footer links, etc. There are numerous other tests that can be done on a Homepage beside testing of search funtionality: pagination bar, redirecting to Gmail/other apps, etc. 
I prepared a draft framework for automating some of the UI tests which can be found on Github under link: https://github.com/NDebska/automation-demo 
It was created with Java, TestNG and Selenide. All tests can be run in parallel in two threads via running SearchAllTest.xml with testNG.

Reference: 
Certified Tester Foundation Level, Syllabus, Version 2018 V3.1, International
https://www.istqb.org/certification-path-root/foundation-level-2018.html#materialsForDownload 
______________________________________________________________________________________________________________________________________________________________________________
# Automation Demo
This is a demo framework designed for automated UI tests of Google.com page.
Tests are intended to be run in Chrome browser. It's possible to run tests in different browsers after some adjustments.

## 1. Technologies used:
* JAVA 17
* Maven 3.6.3
* TestNG 7.4.0
* Selenium 4.1.0
* Selenide 6.1.1
* Chromedriver 96.0.4664.45
* Chrome browser 96.0.4664.45
* Log4j 1.2.17

## 2. Requirements to set-up and run the project in IDE:
* installed Java - instruction: https://www.guru99.com/install-java.html
* installed maven - instruction: https://mkyong.com/maven/how-to-install-maven-in-windows/
* installed IntelliJ IDEA - instruction: https://www.thecoderworld.com/how-to-install-intellij-idea-for-java-developers/
* installed Chrome Browser - version compatible with chromedriver.exe in src/main/resources directory of the project

## 3. Documentation
Tests are written in Java with Selenide (simplified library for Selenium) and are run with TestNG.
Log4j is used for console logging.
More information about Selenide can be found here: https://selenide.org/documentation.html

## 4. Running Tests
Tests can be run in several ways:
* via .xml configuration files placed in src/test/resources
  To run the test simply right click on the suite (e.g. SearchAllTests.xml) you would like to run and select an option "Run <file_path>".
  You can also use combination of keys Ctrl+Shift+F10 for that.
* by setting up the configuration manually in IntelliJ "Edit Configurations" field
* by running a command in command line - instruction: https://testng.org/doc/documentation-main.html#running-testng

## 5. License
Selenium is an open source tool for designing automated tests of web applications.
More information under link: https://www.selenium.dev/about/


