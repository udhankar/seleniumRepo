package week4.day1.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
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

		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Thread.sleep(2000);

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> win = new ArrayList<String>(windowHandles);
		driver.switchTo().window(win.get(1));
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[2]/tbody/tr[1]/td[1]/div/a")).click();
		driver.switchTo().window(win.get(0));

		driver.findElement(By.xpath("//input[@id='partyIdTo']/following::img")).click();
		Thread.sleep(2000);

		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(windows.get(1));
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[3]/tbody/tr[1]/td[1]/div/a")).click();
		driver.switchTo().window(win.get(0));

		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		if (driver.getTitle().contains("View Contact"))
			driver.close();

	}

}
