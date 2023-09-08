package stepDefenition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Editlead extends BaseClass{
	@When("Click on FindLeads Link")
	public void click_on_find_leads_link() {
		driver.findElement(By.linkText("Find Leads")).click();

	}
	@When("Click on phone")
	public void click_on_phone() {
		driver.findElement(By.linkText("Phone")).click();

	}
	@When("Enter the phonenumber")
	public void enter_the_phonenumber() {
		driver.findElement(By.name("phoneNumber")).sendKeys("9380380338");

	}
	@When("Click on Findleads")
	public void click_on_findleads() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	}
	@When("Get LeadId")
	public void get_lead_id() {
		WebElement Id = driver
				.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1]"));
		}
	@When("Click on edit")
	public void click_on_edit() {
		driver.findElement(By.linkText("Edit")).click();

	}
	@When("Clear company name")
	public void clear_company_name() {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();

	}
	@When("Enter company name")
	public void enter_company_name() {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Luthor corp");

	}
	@When("Click on submit")
	public void click_on_submit() {
		driver.findElement(By.className("smallSubmit")).click();

	}
	@Then("Verify edit")
	public void verify_edit() {
		driver.findElement(By.partialLinkText("Luthor corp"));

	}


}
