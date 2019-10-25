package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FocusAutoTest {

	@Test
	public void myTest()
	{
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\jose.jimenez\\Documents\\Eclipse\\ChromeDriver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			WebDriverWait wait= new WebDriverWait(driver, 15);
			String url = "http://www.google.com/";
			
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
			
			/*Killing driver session*/
			driver.quit();
		}
	}
}