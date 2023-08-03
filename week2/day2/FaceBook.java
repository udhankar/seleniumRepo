package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("test");
		driver.findElement(By.name("lastname")).sendKeys("account");
		driver.findElement(By.name("reg_email__")).sendKeys("9380380338");
		driver.findElement(By.name("reg_passwd__")).sendKeys("password");
		WebElement source = driver.findElement(By.id("day"));
		Select dd = new Select(source);
		dd.selectByVisibleText("10");
		WebElement source1 = driver.findElement(By.id("month"));
		Select monthdd = new Select(source1);
		monthdd.selectByVisibleText("Aug");
		WebElement source2 = driver.findElement(By.id("year"));
		Select yeardd = new Select(source2);
		yeardd.selectByVisibleText("1996");
		driver.findElement(By.xpath("//label[text()='Female']")).click();

	}

}
