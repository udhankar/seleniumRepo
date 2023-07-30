package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wayne Enterprises");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lucious");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Fox");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("L");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("R&D");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("adding autopilot");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("udhankar8055@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("note");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());

	}

}
