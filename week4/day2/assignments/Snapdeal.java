package week4.day2.assignments;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement view = driver.findElement(By.xpath("//li[@navindex='1']"));

		Actions actions = new Actions(driver);
		actions.moveToElement(view);
		actions.perform();
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		Thread.sleep(2000);

		String sportsShoesFor = driver.findElement(By.xpath("(//li[@class='child-cat-list cat-list ']//a)[2]"))
				.getText();
		System.out.println(sportsShoesFor);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='sort-drop clearfix']")).click();
		driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();
		Thread.sleep(2000);
		
		// check sort by
		
		/*java.util.List<WebElement> price = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		for (int i = 0; i < price.size(); i++) {
			System.out.println(price.get(i).getText());
		}
		
		String[]arr = new String [price.size()];
		price.toArray(arr);
		for (int j = 0; j < price.size(); j++) {
			
			if (arr[j] < arr[j+1]) {
				System.out.println("sorted");
			}
			j++;
	}*/
		driver.findElement(By.xpath("//input[@class='input-filter']")).clear();
		driver.findElement(By.xpath("//input[@class='input-filter']")).sendKeys("600");
		driver.findElement(By.xpath("(//input[@class='input-filter'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@class='input-filter'])[2]")).sendKeys("999");
		driver.findElement(By.xpath("//div[text()[normalize-space()='GO']]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
		Thread.sleep(2000);

		WebElement priceFilter = driver.findElement(By.xpath("//div[contains(text(),'Price:')]"));
		WebElement colorFilter = driver.findElement(By.xpath("(//div[contains(text(),'Color: ')])[1]"));
		if (priceFilter.getText().contains("Price")) {

			System.out.println("Products are filtered according to price");
		}

		if (colorFilter.getText().contains("Color")) {
			System.out.println("Products are filtered according to Color");
		}
		Thread.sleep(2000);

		WebElement product = driver.findElement(By.xpath("//div[@class='clearfix row-disc']"));
		Actions Action = new Actions(driver);
		Action.click(product).perform();
		String price2 = driver.findElement(By.xpath("//div[contains(@class,'product-price pdp-e-i-PAY-l')]//span[1]")).getText();
		System.out.println("shoes price is " + price2);

		String off = driver.findElement(By.xpath("//span[@class='payBlkBig']/following-sibling::span[1]")).getText();
		System.out.println("Discount is " + off);

		WebElement shoespic = driver.findElement(By.xpath("//img[@class='cloudzoom']"));
		File snap = shoespic.getScreenshotAs(OutputType.FILE);
		File shot = new File("./snap/pic1.jpg");
		FileUtils.copyFile(snap, shot);
		driver.findElement(By.xpath("//div[contains(@class,'close close1')]")).click();
		driver.quit();
	}
}
