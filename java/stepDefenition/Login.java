package stepDefenition;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login  extends BaseClass{
	
	@Given("Enter the Username")
	public void enterUsername() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");
		
	}
	
	@Given("Enter the Password")
	public void enterPassword() {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
	}
	
	@When("Click on the login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	@When("Click on the crmsfa link")
	public void click_on_the_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@When("Click on leads")
	public void click_on_leads() {
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@Then("WelcomePage is displayed")
	public void welcomePage() {
		System.out.println(driver.getTitle());
	}

}
