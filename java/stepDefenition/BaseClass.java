package stepDefenition;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass extends AbstractTestNGCucumberTests {
	
	public static ChromeDriver driver;

	@BeforeMethod
	public void preCondition() {
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();


	}
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
