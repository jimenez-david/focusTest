# focusTest
This repository is to asses the Automtation Test from Focus
##################
How to setup project:
1. Download Chromedriver from 
   https://chromedriver.storage.googleapis.com/index.html?path=78.0.3904.70/
2. Unzip folder and move to a user folder Ex.
   C:\Users\user\Documents\Eclipse\ChromeDriver\chromedriver.exe
3. Clone repository to IDE
4. Add dependencies to pom.xml file
   <dependency>
		<groupId>org.testng</groupId>
		<artifactId>testng</artifactId>
		<version>6.8</version>
		<scope>test</scope>
   </dependency>
5. Update maven dependencies
6. Download Selenium libraries
   https://bit.ly/2zm3ZzF
7. Unzip folder
8. Add Selenium libraries to Java Build Path on IDE
9. On src/test/java/test/FocusAutoTest.java update line 23 according to path for chromedriver.exe
10. Run src/test/java/test/FocusAutoTest.java as a TestNG test
