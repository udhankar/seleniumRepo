package week4.day1.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Open']")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		System.out.println("active windows are" + windows.size());
		driver.switchTo().window(windows.get(0));

		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> windows2 = new ArrayList<String>(windowHandles2);
		for (int i = 1; i < windows2.size(); i++) {
			driver.switchTo().window(windows2.get(i));
			System.out.println("active windows are" + windows2.size());
			driver.close();
		}

		driver.switchTo().window(windows2.get(0));
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> windows3 = new ArrayList<String>(windowHandles3);
		for (int i = 1; i < windows3.size(); i++) {
			driver.switchTo().window(windows3.get(i));
			System.out.println("active windows are" + windows3.size());
			driver.close();
		}

		driver.switchTo().window(windows3.get(0));
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Set<String> windowHandles4 = driver.getWindowHandles();
		List<String> windows4 = new ArrayList<String>(windowHandles4);
		Thread.sleep(2000);
		for (int i = 0; i < windows4.size(); i++) {
			driver.switchTo().window(windows4.get(i));
			System.out.println("active windows are" + windows3.size());
			driver.quit();
		}
	}
}