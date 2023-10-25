package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import UserAuthentication.parameters;

public class home extends parameters {
	@BeforeTest
	public void setUp() {
		driver.manage().window().maximize();
		driver.get(UrlHome);

		driver.findElement(By.className("cta__saudi")).click();

	}

	@Test()
	public void TestLanguage() throws InterruptedException {
		 WebElement languageElement = driver.findElement(By.className("jJNggu"));
	        String languageText = languageElement.getText();
	      
	    
	        softAssert.assertEquals(languageText,excpectedValueLanguage , "Language is in arabic ");
	        softAssert.assertAll();

	}
	@Test()
	public void TestCurrency() throws InterruptedException {
		 WebElement currencyElement = driver.findElement(By.className("fPnvOO"));
	        String currencyText = currencyElement.getText();
	      
	      
	        softAssert.assertEquals(currencyText,expectedCurrency , "Currency is in SAR.");
	        softAssert.assertAll();


	}
	@AfterTest
	public void PostTest() {
	driver.close();
		}
	
}