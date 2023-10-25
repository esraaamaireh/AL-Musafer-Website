package UserAuthentication;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;

public class parameters {
	protected static WebDriver driver = new ChromeDriver();
	
	static String UrlSign = "https://global.almosafer.com/en/register?currentTab=email";
	static String UrlLog = "https://global.almosafer.com/en/signin";
	protected static String UrlHome = "https://global.almosafer.com/en/";
	// static String UrlLog = "https://global.almosafer.com/en/signin";

	protected SoftAssert softAssert = new SoftAssert();
	protected static String expectedCurrency = "SAR";
	protected static String excpectedValueLanguage = "العربية";
	protected static WebDriverWait wait = new WebDriverWait(driver, null);

	static Random random = new Random();
	static String[]  places = {"Dubai", "Jeddah", "Riyadh"};
	static String[] firstNames = { "Esra", "Aseim", "Musa", "hadel", "yamn", "mohmad" };
	static String[] lastNames = { "adel", "mousa", "ahmed", "kaled", "omar", "ibraheem" };
	static int randomNumber = random.nextInt(lastNames.length);
	
	static int randomplacesindex = random.nextInt(places.length);
	
	static String password1 = "Es123456789.0";

	static String randomFirstName() {
		String RandomFirstName = firstNames[randomNumber];
		return RandomFirstName;
	}
	protected static String randomPlaces() {
		String RandomPlaces = places[randomplacesindex];
		return RandomPlaces;
	}
	static String randomLastName() {
		String RandomLastName = lastNames[randomNumber];
		return RandomLastName;
	}

	static String fNameGenereate = randomFirstName();
	static String lNameGenereate = randomLastName();
	static String email = fNameGenereate + lNameGenereate + randomNumber + "@gmail.com";

}
