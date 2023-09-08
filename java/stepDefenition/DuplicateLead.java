package stepDefenition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DuplicateLead extends BaseClass{
	@When("Enter name")
	public void enter_name() {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Lucious");
	}
	@When("click onsearch")
	public void click_onsearch() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	}
	@When("Click on lead")
	public void click_on_lead() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
	}
	@When("Click on duplicate lead")
	public void click_on_duplicate_lead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();

	}
	@When("Clck on submit")
	public void clck_on_submit() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.className("smallSubmit")).click();
	}
	@Then("Confirm duplicate")
	public void confirm_duplicate() {
		driver.findElement(By.xpath("//span[text()='Lucious']"));

	}

}
