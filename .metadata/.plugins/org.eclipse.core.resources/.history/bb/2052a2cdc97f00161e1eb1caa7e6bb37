package RodanFieldsAssertions;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnrollNowPage {

	WebDriver driver;
	String beforeSelection;
	String	Parent;

	By becomeAConsultant=By.xpath("//a[@id='corp-opp']");
	By enroll=By.xpath("//div[@class='hidden-xs']//li[@id='BusinessSystemBar']//ul//li[2]//a");
	By enterTest=By.xpath("//input[@id='sponserparam']");
	By clickSearch=By.xpath("//button[@id='search-sponsor-button']");
	By nextPagination=By.xpath("//a[@class='next']");
	By noEnabled=By.xpath("//div[@class='search-module']//span[contains(text(),'3')]");
	By personalKit=By.xpath("//div[@class='enrollment-kits row']/div[3]//span");
	By clickProduct=By.xpath("//div[@class='the-search-results']/div[1]//div[@class='sponsorDataDiv']");
	By redefine=By.xpath("//div[@class='regimen-kit-selection-content row margin-0']/div[3]//span[contains(@class,'checked')]");
	By reverse=By.xpath("//div[@class='regimen-kit-selection-content row margin-0']/div[4]//span[contains(@class,'unchecked')]");
	By nextEnrollmentKit=By.xpath("//button[@id='next-button']");
	By selectStandardEnrollment=By.xpath("//div[@id='standard-enrollment']/div/span");
	By nextEnrollmentType=By.xpath("//input[@id='next-button']");
	By expressEnrollMent=By.xpath("//div[@class='enroll-choose-type enrollment-type row']/div[1]//span[contains(@class,'checked')]");
	By expressText=By.xpath("//div[@class='enroll-choose-type enrollment-type row']/div[4]/span[1]");
	By standardText=By.xpath("//div[@class='enroll-choose-type enrollment-type row']/div[4]/span[2]");
	By standardEnrollMent=By.xpath("//div[@class='enroll-choose-type enrollment-type row']/div[2]//span[contains(@class,'checked')]");
	By nextCreateAccount=By.xpath("//input[@id='enrollment-next-button']");
	By labelForFirstName=By.xpath("//form[@id='enrollmentForm']/div[1]/div[1]//label");
	By labelForLastName=By.xpath("//form[@id='enrollmentForm']/div[1]/div[1]//label");
	By firstName=By.xpath("//input[@placeholder='First Name']");
	By lastName=By.xpath("//input[@placeholder='Last Name']");

	public  EnrollNowPage (WebDriver driver){
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void clickOnEnrollNow() throws InterruptedException
	{
		driver.findElement(becomeAConsultant).click();
		Thread.sleep(5000);
		driver.findElement(enroll).click();
		Thread.sleep(5000);

	}

	public void enterTextAndSearch() throws InterruptedException{
		driver.findElement(enterTest).sendKeys("test");
		Thread.sleep(5000);
		driver.findElement(clickSearch).click();
		Thread.sleep(5000);
	}
	
	public void clickOnNextPage() throws InterruptedException{
		driver.findElement(nextPagination).click();
		Thread.sleep(5000);
		driver.findElement(nextPagination).click();

	}

	public boolean verifyPageNoIsSelected()
	{
		return	driver.findElement(noEnabled).isEnabled();
	}

	public void clickOnProductAndPersonalKit() throws InterruptedException
	{
		driver.findElement(clickProduct).click();
		Thread.sleep(5000);
		driver.findElement(personalKit).click();
		Thread.sleep(5000);
		String Parent=driver.getWindowHandle();
		Set <String> All=driver.getWindowHandles();
		for(String s:All){
			if(s.equals(Parent)==false)
			{
				driver.switchTo().window(s);
				break;

			}
			
		}}
	
	public boolean verifyRedefineIsSelected()
	{
			return driver.findElement(redefine).isEnabled();
	}

	public boolean verifyReverseIsNotSelected()
	{
			return driver.findElement(reverse).isEnabled();
	}


	public void clickOnNextOnEnrollmentKit() throws InterruptedException
	{
		driver.findElement(nextEnrollmentKit).click();
		Thread.sleep(5000);
		
		
		}

	public String verifyUserSelectedExpress() throws InterruptedException{
		Thread.sleep(5000);
		String s1=driver.findElement(expressText).getText();
		System.out.println(s1);
		return s1;

	}

	public void clickOnStandard() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(selectStandardEnrollment).click();
	}
	
	public String verifyUserSelectedStandard() throws InterruptedException{
		Thread.sleep(5000);
		
		String s2=driver.findElement(standardText).getText();
		System.out.println(s2);
		return s2;

	}


	public void clickOnNextOnEnrollmentType() throws InterruptedException
	{

		driver.findElement(nextEnrollmentType).click();
		Thread.sleep(5000);
		driver.findElement(nextCreateAccount).click();

	}

	public String verifyErrorMessageForFirstName(){

		String s3 =driver.findElement(labelForFirstName).getText();
		System.out.println("Error message for First Name "+s3);
		return s3;
	}
	
	public String verifyErrorMessageForLastName(){

		String s4 =driver.findElement(labelForLastName).getText();
		System.out.println("Error message for Last Name "+s4);
		return s4;
	}

	public void enterFirstAndLastName() throws InterruptedException{
		driver.findElement(firstName).sendKeys("Taran");
		Thread.sleep(5000);
		driver.findElement(firstName).sendKeys(Keys.TAB);
		driver.findElement(lastName).sendKeys("Kaur");
		Thread.sleep(5000);
		driver.findElement(lastName).sendKeys(Keys.TAB);
	}
}


