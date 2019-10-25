package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FocusCareers {
	WebDriver driver;
	By keywordInput = By.id("search_keywords");
	By locationButton = By.className("ms-choice");
	By locationOption = By.xpath("//input[@value = 'San Salvador, El Salvador']");
	By noPositionsSpan = By.xpath("//div[contains(@class, 'agent_showing_jobs')]/span");
	
	WebDriverWait wait;
	public FocusCareers (WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 25);
	}

	private void clickOnKeywordInput ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(keywordInput));
		driver.findElement(keywordInput).click();
	}
	
	public void enterTextOnKeywordInput (String searchKey)
	{
		clickOnKeywordInput();
		driver.findElement(keywordInput).sendKeys(searchKey);
	}
	
	public void selectLocation()
	{
		wait.until(ExpectedConditions.elementToBeClickable(locationButton));
		driver.findElement(locationButton).click();
		wait.until(ExpectedConditions.elementToBeClickable(locationOption));
		driver.findElement(locationOption).click();
	}
	
	public String getNoPositionMessage()
	{
		wait.until(ExpectedConditions.elementToBeClickable(locationButton));
		return driver.findElement(noPositionsSpan).getText();
	}
}
