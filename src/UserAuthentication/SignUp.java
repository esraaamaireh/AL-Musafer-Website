package UserAuthentication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUp extends parameters {
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void setUp() {
		driver.manage().window().maximize();
	
	}

	    @Test(description ="This Test For SignUp Process")
	public void SignUpHappySenario() throws InterruptedException {
	    	driver.get(UrlSign);
		// find elements by x path
		WebElement emailInput = driver.findElement(By.xpath("//*[@name='email']"));
		WebElement passwordInput = driver.findElement(By.xpath("//*[@name='password']"));
		WebElement buttonInput = driver.findElement(By.xpath("//*[@type='submit']"));

           //set the data

		emailInput.sendKeys(email);
		passwordInput.sendKeys(password1);
		buttonInput.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
 // Adjust the timeout as needed
		WebElement actualValue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("gZlSQG")));
		String actual = actualValue.getText();
	  

		
		softAssert.assertEquals(actual, "Welcome to Almosafer");
		wait(6000);
	
		
	}
	   @Test(description ="This Test For SignUp with Invalid PASSWORD ")
	
public void SignUpSadSenarioOne() {
	driver.get(UrlSign);
		// find elements by x path
		WebElement emailInput = driver.findElement(By.xpath("//*[@name='email']"));
		WebElement passwordInput = driver.findElement(By.xpath("//*[@name='password']"));
		WebElement buttonInput = driver.findElement(By.xpath("//*[@type='submit']"));

           //set the data

		emailInput.sendKeys(email);
		passwordInput.sendKeys("0");
		buttonInput.click();
		WebElement actualValue=driver.findElement(By.className("invalid-feedback"));
		String actual=actualValue.getText();
		softAssert.assertEquals(actual, "Your password must have at least 8 characters, one uppercase letter, one lowercase letter and one number.");
	}
	 @Test (description ="This Test For SignUp with Invalid Email Process")
	   public void SignUpSadSenariotow() {
	   	driver.get(UrlSign);
	   		// find elements by x path
	   		WebElement emailInput = driver.findElement(By.xpath("//*[@name='email']"));
	   		WebElement passwordInput = driver.findElement(By.xpath("//*[@name='password']"));
	   		WebElement buttonInput = driver.findElement(By.xpath("//*[@type='submit']"));

	   		
	   				//set the data

	   		emailInput.sendKeys("0000");
	   		passwordInput.sendKeys(password1);
	   		buttonInput.click();
	   		WebElement actualValue=driver.findElement(By.className("invalid-feedback"));
				String actual=actualValue.getText();
	   		
	   		softAssert.assertEquals(actual, "Please enter a valid email address");
	   		softAssert.assertAll();
	   	}
@AfterTest
public void PostTest() {
driver.close();
	}
	


}
