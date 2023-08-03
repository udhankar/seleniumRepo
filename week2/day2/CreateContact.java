package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

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
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Trial");
		driver.findElement(By.id("lastNameField")).sendKeys("Account");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Trial");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Account");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("R&D");
		driver.findElement(By.id("createContactForm_description")).sendKeys("additional info");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("udhankar8055@gmail.com");
		WebElement source = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd = new Select(source);
		dd.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("additional info");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println(driver.getTitle());

	}

}
