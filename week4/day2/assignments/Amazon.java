package week4.day2.assignments;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();

		String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println(price);
		String reviews = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println(reviews);

		driver.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color-base')]")).click();
		Set<String> windowHandle = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandle);
		driver.switchTo().window(windows.get(1));
		Thread.sleep(5000);

		WebElement phone = driver.findElement(By.xpath("//div[@class='imgTagWrapper']"));
		File snap = phone.getScreenshotAs(OutputType.FILE);
		File shot = new File("./snap/pic1.jpg");
		FileUtils.copyFile(snap, shot);

		driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();
		Thread.sleep(5000);
		String subtotal = driver
				.findElement(By.xpath("//span[contains(@class,'a-size-base-plus a-color-price')]//span[1]")).getText();
		if (subtotal.equals(price)) {
			System.out.println("Subtotal is same as price" +subtotal);
		}
		Thread.sleep(2000);
		driver.quit();
	}
}