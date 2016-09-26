package Rodan_Sort;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SortTest {

	
	WebDriver driver;
	SortPage sort;

	@BeforeMethod
	public void setUp() throws InterruptedException{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rodanandfields.com/ca/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		sort=new SortPage(driver);
	}

	@Test
	public void testRodanFields() throws InterruptedException{	
		sort.shopCare();
		sort.clickOnHighToLow();
		
		double val1 = sort.getPriceFirstProduct();
		double val2 = sort.getPriceSecondProduct();
		System.out.println("Val1: "+val1+" Val2: "+val2);
		Assert.assertTrue("Second price is greater than first",val1>val2);
		double val3 = sort.getPriceThirdProduct();
		System.out.println("Val2: "+val2+" Val3: "+val3);
		Assert.assertTrue("Third price is greater than second",val2>val3);
	}
	@AfterMethod
	public void quitBrowser(){
		driver.quit();
	}
}

