package stepDefenition;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class MergeLead extends BaseClass {

@When("Click on Merge Leads")
public void click_on_merge_leads() {
	driver.findElement(By.linkText("Merge Leads")).click();

}
@When("Click on Lookup")
public void click_on_lookup() {
	driver.findElement(By.xpath("//img[@alt='Lookup']")).click();

}
@When("Switch window")
public void switch_window() {
	Set<String> allWindows = driver.getWindowHandles();
	List<String> allhandles = new ArrayList<String>(allWindows);
	driver.switchTo().window(allhandles.get(1));
}
@When("Enter Phone Number")
public void enter_phone_number() {
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Lucious");


}
@When("Click on searchleads")
public void click_on_searchleads() {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

}
@When("Click on result")
public void click_on_result() {
	driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]")).click();
	
}
@When("Switch windows")
public void switch_windows() {
	Set<String> allWindows = driver.getWindowHandles();
	List<String> allhandles = new ArrayList<String>(allWindows);
	driver.switchTo().window(allhandles.get(0));

	
}
@When("Click on lookupsearch")
public void click_on_lookupsearch() {
	driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

}
@When("Switch window back")
public void switch_window_back() {
	Set<String> allWindows2 = driver.getWindowHandles();
	List<String> allhandles2 = new ArrayList<String>(allWindows2);
	driver.switchTo().window(allhandles2.get(1));
}
@When("Enter search term")
public void enter_search_term() throws InterruptedException {
	Thread.sleep(2000);

	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("babu");

}
@When("Click on merge search")
public void click_on_merge_search() {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

}
@When("switch to main window")
public void switch_to_main_window() throws InterruptedException {
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	Set<String> allWindows2 = driver.getWindowHandles();
	List<String> allhandles2 = new ArrayList<String>(allWindows2);
	driver.switchTo().window(allhandles2.get(0));
}
@When("click on merge")
public void click_on_merge() {
	driver.findElement(By.xpath("//a[text()='Merge']")).click();
	driver.switchTo().alert().accept();
}



}
