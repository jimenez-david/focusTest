package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FocusHP 
{
	WebDriver driver;
	WebDriverWait wait;
	By homeLink = By.linkText("Home");
	By servicesLink = By.linkText("Services");
	By locationsLink = By.linkText("Locations");
	By aboutUSLink = By.linkText("About Us");
	By careersLink = By.linkText("Careers");
	By contactLink = By.linkText("Contact");
	By excelCustCareLink = By.linkText("We Excel at Customer Care, here’s how.");
	By getInTouchLink = By.linkText("Get in Touch");
	By nowHiringLink = By.linkText("Now Hiring!");
		
	public FocusHP (WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 25);
	}
	
	 
	/*Clicking on LINKS*/
	public void clickOnHomeLink ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(homeLink));
		driver.findElement(homeLink).click();
	}
	
	public void clickOnServicesLink ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(servicesLink));
		driver.findElement(servicesLink).click();
	}
	
	public void clickOnLocationsLink ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(locationsLink));
		driver.findElement(locationsLink).click();
	}
	
	public void clickOnAboutUSLink ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(aboutUSLink));
		driver.findElement(aboutUSLink).click();
	}
	
	public void clickOnCareersLink ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(careersLink));
		driver.findElement(careersLink).click();
	}
	
	public void clickOnContactLink ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(contactLink));
		driver.findElement(contactLink).click();
	}
	
	public void clickOnExcelenceCustomerCareLink ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(excelCustCareLink));
		driver.findElement(excelCustCareLink).click();
	}
	
	public void clickOnGetInTouchLink ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(getInTouchLink));
		driver.findElement(getInTouchLink).click();
	}
	
	public void clickOnNowHiringLink ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(nowHiringLink));
		driver.findElement(nowHiringLink).click();
	}
}