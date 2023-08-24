package week5Assignment;

import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class DuplicateLead extends LeadsLogin{

	@Test
	public void runDuplicate() throws InterruptedException{

		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Lucious");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.getTitle().compareTo("Duplicate Lead | opentaps CRM");
		Thread.sleep(2000);
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("//span[text()='Lucious']"));
	}
}






