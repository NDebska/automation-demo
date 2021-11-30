# Automation Demo
This is a demo framework designed for automated UI tests of Google.com page.
Tests are intended to be run in Chrome browser. It's possible to run tests in different browsers after some adjustments.

#1. Technologies used:
* JAVA 17
* Maven 3.6.3
* TestNG 7.4.0
* Selenium 4.1.0
* Selenide 6.1.1
* Chromedriver 96.0.4664.45
* Chrome browser 96.0.4664.45
* Log4j 1.2.17

#2. Requirements to set-up and run the project in IDE:
* installed Java - instruction: https://www.guru99.com/install-java.html
* installed maven - instruction: https://mkyong.com/maven/how-to-install-maven-in-windows/
* installed IntelliJ IDEA - instruction: https://www.thecoderworld.com/how-to-install-intellij-idea-for-java-developers/
* installed Chrome Browser - version compatible with chromedriver.exe in src/main/resources directory of the project

#3. Documentation
Tests are written in Java with Selenide (simplified library for Selenium) and are run with TestNG.
Log4j is used for console logging.
More information about Selenide can be found here: https://selenide.org/documentation.html

#4. Running Tests
Tests can be run in several ways:
* via .xml configuration files placed in src/test/resources
  To run the test simply right click on the suite (e.g. SearchAllTests.xml) you would like to run and select an option "Run <file_path>".
  You can also use combination of keys Ctrl+Shift+F10 for that.
* by setting up the configuration manually in IntelliJ "Edit Configurations" field
* by running a command in command line - instruction: https://testng.org/doc/documentation-main.html#running-testng

#5. License
Selenium is an open source tool for designing automated tests of web applications.
More information under link: https://www.selenium.dev/about/


