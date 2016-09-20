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

	By becomeAConsultant=By.xpath(".//a[@id='corp-opp']");
	By enroll=By.xpath("//div[@class='hidden-xs']//li[@id='BusinessSystemBar']//ul//li[2]//a");
	By enterTest=By.xpath("//input[@id='sponserparam']");
	By clickSearch=By.xpath("//button[@id='search-sponsor-button']");
	By nextPagination=By.xpath("//a[@class='next']");
	By noEnabled=By.xpath("//div[@class='search-module']//span[contains(text(),'3')]");
	By personalKit=By.xpath("//div[@class='enrollment-kits row']/div[3]//span");
	By clickProduct=By.xpath("//div[@class='the-search-results']/div[1]//div[@class='sponsorDataDiv']");
	By redefine=By.xpath("//div[@class='regimen-kit-selection-content row margin-0']/div[3]//span[1]");
	By reverse=By.xpath("//div[@class='regimen-kit-selection-content row margin-0']/div[4]//span[1]");
	By nextEnrollmentKit=By.xpath("//button[@id='next-button']");
	By selectStandardEnrollment=By.xpath(".//div[@id='standard-enrollment']/div/span");
	By nextEnrollmentType=By.xpath("//input[@id='next-button']");
	By expressEnrollMent=By.xpath("//div[@class='enrollment-description col-xs-10']/span[1]");
	By standardEnrollMent=By.xpath("//div[@class='enrollment-description col-xs-10']/span[2]");
	By nextCreateAccount=By.xpath("//input[@id='enrollment-next-button']");
	By label=By.xpath("//form[@id='enrollmentForm']/div//label");
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
		return	driver.findElement(redefine).isEnabled();
	}

	public boolean verifyReverseIsNotSelected()
	{
		return	driver.findElement(reverse).isEnabled();
	}


	public void clickOnNextOnEnrollmentKit() throws InterruptedException
	{
		driver.findElement(nextEnrollmentKit).click();
		Thread.sleep(5000);
		driver.findElement(selectStandardEnrollment).click();
		
		}

	public String verifyUserSelectedExpress(){
		return driver.findElement(expressEnrollMent).getText();

	}

	public String verifyUserSelectedStandard(){
		return driver.findElement(standardEnrollMent).getText();

	}


	public void clickOnNextOnEnrollmentType() throws InterruptedException
	{

		driver.findElement(nextEnrollmentType).click();
		Thread.sleep(5000);
		driver.findElement(nextCreateAccount).click();

	}

	public String verifyErrorMessage(){

		String s =driver.findElement(label).getText();
		System.out.println(s);
		return s;
	}

	public void enterFirstAndLastName(){
		driver.findElement(firstName).sendKeys("Taran");
		driver.findElement(firstName).sendKeys(Keys.TAB);
		driver.findElement(lastName).sendKeys("Kaur");
		driver.findElement(lastName).sendKeys(Keys.TAB);
	}
}


