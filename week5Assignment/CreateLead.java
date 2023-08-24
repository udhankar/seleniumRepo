package week5Assignment;

import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class CreateLead extends LeadsLogin {

	@Test
	public void runCreate() {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wayne Enterprises");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lucious");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Fox");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("L");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("R&D");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("adding autopilot");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9380380338");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("fox@wanyetech.com");
		driver.findElement(By.className("smallSubmit")).click();
	}
}
