package stepDefenition;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class DeleteLead extends BaseClass{
	@When("Click on delete")
	public void click_on_delete() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();

	}
	@When("Click on delete button")
	public void click_on_delete_button() {
		driver.findElement(By.linkText("Delete")).click();

	}
}
