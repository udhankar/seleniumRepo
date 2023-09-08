package stepDefenition;


import org.openqa.selenium.By;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass{

	@When("Click on CreateLead link")
	public void click_on_create_lead_link() {
		driver.findElement(By.linkText("Create Lead")).click();

	}

	@When("Enter the companyName")
	public void enter_the_company_name_as() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wayne Enterprises");

	}

	@When("Enter the firstName")
	public void enter_the_first_name_as() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lucious");

	}

	@When("Enter the lastName")
	public void enter_the_last_name_as() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Fox");

	}

	@When("Enter firstname local")
	public void enter_firstname_local_as() {
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("L");

	}

	@When("Enter department name")
	public void enter_department_name_as() {
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("R&D");

	}

	@When("Enter description")
	public void enter_description() {
		driver.findElement(By.id("createLeadForm_description")).sendKeys("adding autopilot");

	}
	
	@When("Enter Enter phonenumber")
	public void enter_enter_phonenumber() {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9380380338");

	}

	@When("Enter e-mail")
	public void enter_email() {
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("udhankar8055@gmail.com");

	}

	@When("Click on Create button")
	public void click_on_create_button() {
		driver.findElement(By.name("submitButton")).click();

	}

	@Then("ViewLead page is displayed")
	public void view_lead_page_is_displayed() {
		System.out.println(driver.getTitle());
	}

}