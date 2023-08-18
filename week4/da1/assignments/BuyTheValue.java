package week4.day1.assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyTheValue {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='grid-image'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("wk_zipcode")).sendKeys("600028");
		driver.findElement(By.xpath("//input[@value='Check']")).click();
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		WebElement view = driver.findElement(By.xpath("(//a[text()='View Cart'])[1]"));
		Thread.sleep(2000);
		driver.executeScript("arguments[0].click();", view);
		driver.findElement(By.xpath("//input[@id='checkout']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

}
