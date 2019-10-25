package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.FocusCareers;
import utils.FocusHP;

public class FocusAutoTest {

	@Test
	public void myTest()
	{
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\jose.jimenez\\Documents\\Eclipse\\ChromeDriver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			WebDriverWait wait= new WebDriverWait(driver, 15);
			String url = "http://www.google.com/";
			FocusHP homePage = new FocusHP(driver);
			FocusCareers careers = new FocusCareers (driver);
			
			/*Navigate to Google*/
			driver.get(url);
			
			/*Search values*/
			WebElement inputSearch = driver.findElement(By.name("q"));
			wait.until(ExpectedConditions.elementToBeClickable(inputSearch));
			inputSearch.sendKeys("Focus Services");
			
			WebElement inputButton = driver.findElement(By.name("btnK"));
			wait.until(ExpectedConditions.elementToBeClickable(inputButton));				
			inputButton.click();
			
			/*Clicking on Focus link*/
			WebElement focusLink = driver.findElement(By.xpath("//a[contains (@href, 'https://www.focusservices.com/')]"));
			Assert.assertTrue(focusLink.isDisplayed(), "Link is displayed");		
			focusLink.click();
			
			/*Click on Now Hiring*/
			homePage.clickOnNowHiringLink();
			
			/*Click on Careers*/
			homePage.clickOnCareersLink();
			
			/*Select SS Location*/
			careers.selectLocation();
			
			/*Entering Text to search job vacancies*/
			careers.enterTextOnKeywordInput("Contact" + Keys.ENTER);
			
			/*Validate there no positions available*/	
			Assert.assertEquals(careers.getNoPositionMessage(), "Search completed. Found 0 matching record(s).");
			
			/*Killing driver session*/
			driver.quit();
		}
	}
}