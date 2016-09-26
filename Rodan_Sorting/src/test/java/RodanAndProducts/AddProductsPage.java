package RodanAndProducts;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddProductsPage {
	WebDriver driver;
	By shopCare=By.xpath("//div[@class='hidden-xs']//a[@id='our-products']");
	By all=By.xpath("//ul[@id='dropdown-menu']/li[7]/div/a");
	By selectRedefine=By.xpath("//div[@id='main-content']//div[2]//input[@tabindex='1']");
	By refine=By.xpath("//div[@class='dropdown-wrapper']//li[1]//div[@class='pull-right']/div");
	By reverse=By.xpath("//ul[@class='refine-products select-dropdown open']/li[2]//div[@class='repaired-checkbox']");
	By redefineTitle=By.xpath("//h2[contains(text(),'REDEFINE')]");
	By reverseTitle=By.xpath("//h2[contains(text(),'REVERSE')]");
	By sootheTitle=By.xpath("//h2[contains(text(),'SOOTHE')]");
	By unblemishTitle=By.xpath("//h2[contains(text(),'UNBLEMISH')]");
	By essentialsTitle=By.xpath("//h2[contains(text(),'ESSENTIALS')]");
	By enhancementsTitle=By.xpath("//h2[contains(text(),'ENHANCEMENTS')]");
	By clickProduct1Image=By.xpath("//div[@id='main-content']/div[5]/div[1]/div[1]/a[1]");
	By clickProduct1=By.xpath("//div[@id='main-content']/div[5]/div[1]/div[1]/a[2]/input");
	By addToBag=By.xpath("//input[@value='ADD TO BAG']");
	By quantity=By.xpath("//input[@id='quantity0']");
	By update=By.xpath("//a[@class='updateLink']");
	By subTotal=By.xpath("//div[@id='subtotal-shopping']//span");
	By continueShopping=By.xpath("//a[contains(text(),'Continue shopping')]");
	By clickProduct2Image=By.xpath("//div[@id='main-content']/div[5]/div[2]/div[1]/a[1]/img");
	By clickProduct2=By.xpath("//div[@id='main-content']/div[5]/div[2]/div[1]/a[2]/input");
	By cartItems=By.xpath("//div[@class='cartItems']/div[contains(@class,'shopping')]");
	By delete=By.xpath(".//div[@id='left-shopping']/div[3]/div[2]//div[3]//a");


	public  AddProductsPage(WebDriver driver){
		this.driver=driver;

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}


	public void shopCare() throws InterruptedException {
		driver.findElement(shopCare).click();
		Thread.sleep(2000);
		driver.findElement(all).click();
	}



	public void selectRedefineAndReverse() throws InterruptedException	{
		driver.findElement(selectRedefine).click();
		Thread.sleep(2000);
		driver.findElement(refine).click();;
		Thread.sleep(2000);;
		driver.findElement(selectRedefine).click();
		Thread.sleep(2000);
		driver.findElement(reverse).click();
		Thread.sleep(2000);

	}


	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public boolean isRedefinePresent(){
		return isElementPresent(redefineTitle);
	}

	public boolean isReversePresent(){
		return isElementPresent(reverseTitle);
	}
	public boolean isSoothePresent(){
		return isElementPresent(sootheTitle);
	}

	public boolean isUnblemishPresent(){
		return isElementPresent(unblemishTitle);
	}

	public boolean isEssentialsPresent(){
		return isElementPresent(essentialsTitle);
	}

	public boolean isEnhancementsPresent(){
		return isElementPresent(enhancementsTitle);
	}

	public void clickPrdAndAddQuantity() throws InterruptedException{

		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(clickProduct1Image)).build().perform();
		Thread.sleep(2000);
		driver.findElement(clickProduct1).click();
		Thread.sleep(2000);
		driver.findElement(addToBag).click();
		driver.findElement(quantity).sendKeys("0");
		driver.findElement(update).click();
		Thread.sleep(2000);
	}

	public String getSubTotal(){
		String s=driver.findElement(subTotal).getText();
		System.out.println("Price of items after adding 10 quantity = "+s);
		return driver.findElement(subTotal).getText();
	}

	public void clickOnAnotherPrd() throws InterruptedException{ 
		driver.findElement(continueShopping).click();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(clickProduct2Image)).build().perform();
		Thread.sleep(5000);
		driver.findElement(clickProduct2).click();
		Thread.sleep(5000);
		driver.findElement(addToBag).click();
		Thread.sleep(5000);
	}

	public int verifyCartItem(){

		List <WebElement> weblist = driver.findElements(cartItems);
		int size = weblist.size();
		System.out.println("No of item in the cart = "+ size);
		return size;
	}


	public void clickOnDelete() throws InterruptedException{

		driver.findElement(delete).click();
		Thread.sleep(5000);
	}

	public int verifyCartItemAfterDeletion(){

		List <WebElement> weblist = driver.findElements(cartItems);
		int size = weblist.size();
		System.out.println("No of item in the cart after deletion = "+size);
		return size;
	}
}

