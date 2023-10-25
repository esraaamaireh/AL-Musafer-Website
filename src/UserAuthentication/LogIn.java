package UserAuthentication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogIn extends parameters {
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void setUp() {
		driver.manage().window().maximize();
	
	}

	    @Test(description ="This Test For LogIn Process")
	public void LogInHappySenario() {
	    	driver.get(UrlLog);
		// find elements by x path
		WebElement emailInput = driver.findElement(By.xpath("//*[@name='email']"));
		WebElement passwordInput = driver.findElement(By.xpath("//*[@name='password']"));
		WebElement buttonInput = driver.findElement(By.xpath("//*[@type='submit']"));

           //set the data

		emailInput.sendKeys("esraa99ibra@gmail.com");
		passwordInput.sendKeys(password1);
		buttonInput.click();
	
 // Adjust the timeout as needed
		WebElement actualValue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ProfileInfo__Greeting-sc-1pzdcqf-1")));
		String actual = actualValue.getText();
	  

		
		softAssert.assertEquals(actual, "Hello there");
		softAssert.assertAll();
		
	}
	   @Test(description ="This Test For LogIn with Invalid password Process")
	
public void loginSadSenarioOne() {
		   driver.get(UrlLog);
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
		softAssert.assertAll();
	}
	 @Test (description ="This Test For LogIn with Invalid email Process")
	   public void LogINSadSenariotow() {
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


}
