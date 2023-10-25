package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import UserAuthentication.parameters;

public class booking extends parameters{
	@BeforeTest
	public void setUp() {
		driver.manage().window().maximize();
		driver.get(UrlHome);

		driver.findElement(By.className("cta__saudi")).click();

	}

	@Test(description = "hotelTap")
	public void search() {
		WebElement hotelTab = driver.findElement(By.id("uncontrolled-tab-example-tab-hotels"));
		hotelTab.click();
		WebElement searchPlace = driver.findElement(By.className("AutoComplete__Input"));
		
		searchPlace.sendKeys(randomPlaces());
		
		WebElement chooices = driver.findElement(By.className("AutoComplete__ListItem--highlighted"));
		
		
		WebElement roomchoose = driver.findElement(By.xpath("//*[@data-testid=HotelSearchBox__ReservationSelect_Select]"));
	
		WebElement bookingMember = driver.findElement(By.xpath("//*[@data-testid=HotelSearchBox__ReservationSelect_A]"));
		WebElement searchButton = driver.findElement(By.xpath("//*[@data-testid=HotelSearchBox__SearchButton]"));
		WebElement searchResult = driver.findElement(By.className("iFtFsb"));
		
		wait.until(ExpectedConditions.visibilityOf(chooices));
		chooices.click();
		
		wait.until(ExpectedConditions.visibilityOf(roomchoose));
		roomchoose.click();
		
		wait.until(ExpectedConditions.visibilityOf(bookingMember));
		bookingMember.click();
		searchButton.click();
		wait.until(ExpectedConditions.visibilityOf(searchResult));
		
	
		softAssert.assertAll();

	}

@AfterTest
public void PostTest() {
//driver.close();
	}
}/*
WebElement classes = driver.findElement(By.className("kzASoM"));
	WebElement roomchoose = driver.findElement(By.xpath("//*[@data-testid=HotelSearchBox__ReservationSelect_Select]"));
	WebElement passenger = driver.findElement(By.className("cTmVLj"));
	WebElement passengerType = driver.findElement(By.className("jtVbGd"));
	WebElement passengerMember = driver.findElement(By.xpath("//*[@data-testid=HotelSearchBox__ReservationSelect_A]"));
	WebElement searchButton = driver.findElement(By.xpath("//*[@data-testid=FlightSearchBox__SearchButton]"));
	wait.until(ExpectedConditions.visibilityOf(chooices));
	chooices.click();
	classes.click();
	wait.until(ExpectedConditions.visibilityOf(roomchoose));
	roomchoose.click();
	passenger.click();
	wait.until(ExpectedConditions.visibilityOf(passengerType));
	passengerMember.click();
	searchButton.click();
	
	
//	softAssert.assertEquals(ariaSelectedValue, "true", "Hotel tab is clickable");
	softAssert.assertAll();

}

}*/
