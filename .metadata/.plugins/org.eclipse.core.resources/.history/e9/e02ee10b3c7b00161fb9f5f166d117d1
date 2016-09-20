

package RodanFieldsAssertions;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;


public class RodanAssertionsTest {


	static WebDriver driver;
	EnrollNowPage enrollNow;

	@BeforeMethod
	public void setUp() throws InterruptedException{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rodanandfields.com/ca/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		enrollNow=new EnrollNowPage(driver);

	}

	@Test
	public void rodanFieldsTest1() throws InterruptedException{	

		enrollNow.clickOnEnrollNow();
		enrollNow.enterTextAndSearch();
		enrollNow.clickOnNextPage();
		Assert.assertTrue(enrollNow.verifyPageNoIsSelected(), "Page no is not selected");
		enrollNow.clickOnProductAndPersonalKit();
		Assert.assertTrue(enrollNow.verifyRedefineIsSelected(), "Redefine is not selected");	
		Assert.assertTrue(enrollNow.verifyReverseIsNotSelected(),"Reverse is selected");
		enrollNow.clickOnNextOnEnrollmentKit();
		Assert.assertFalse(enrollNow.verifyUserSelectedExpress().contains("Express"),"You are on Express page");
		Assert.assertTrue(enrollNow.verifyUserSelectedStandard().contains("Standard"),"You are not on Standard page");	
		enrollNow.clickOnNextOnEnrollmentType();
		Assert.assertTrue(enrollNow.verifyErrorMessage().contains("This field is required."),"Wrong message");
		enrollNow.enterFirstAndLastName();
		
	}
@AfterMethod
	public void quitBrowser(){
		driver.close();
	}
}






