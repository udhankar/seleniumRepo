package week4.day2.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		WebElement view = driver.findElement(By.id("brand_arrowUp"));

		Actions actions = new Actions(driver);
		actions.moveToElement(view);
		actions.perform();
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//div[@class='filter-open css-1gdff5r'])[2]")).click();

		driver.findElement(By.xpath("//span[text()='Category']//following::span[text()='Hair']")).click();
		driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='css-xrzmfa']")).click();
		Set<String> windowHandle = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandle);
		driver.switchTo().window(windows.get(1));
		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[@class=' css-d3w64v']")).click();
		String price = driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText();
		System.out.println("Price is" + price);
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("css-aesrxy")).click();
		Thread.sleep(2000);

		WebElement frame = driver.findElement(By.xpath("(//iframe[@class='css-acpm4k'])[1]"));
		driver.switchTo().frame(frame);
		String total = driver.findElement(By.xpath("(//p[@class='css-6nd5ki eka6zu20'])[2]")).getText();
		System.out.println("Total is" + total);
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@class='css-175whwo ehes2bo0']/img")).click();
		WebElement grandtotal = driver
				.findElement(By.xpath("(//div[@class='css-46b9vi efuv1qx0']/following-sibling::p)[2]"));
		String GrandTotal = grandtotal.getText();
		Thread.sleep(2000);

		if (GrandTotal.contentEquals(total)) {
			System.out.println("Grand Total is" + GrandTotal);
		}
		driver.quit();
	}

}