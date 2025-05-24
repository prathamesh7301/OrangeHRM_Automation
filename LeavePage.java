package OrangeHRMS;

import java.beans.Visibility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeavePage {
	WebDriver Driver;
	
	public LeavePage(WebDriver Driver) {
		this.Driver = Driver;
	}
	
	//path to click on From Date
	By FromDate = By.xpath("(//input[@class='oxd-input oxd-input--active' and @placeholder='yyyy-dd-mm'])[1]");
	
	//path to click on to date
	By ToDate = By.xpath("(//input[@class='oxd-input oxd-input--active' and @placeholder='yyyy-dd-mm'])[2]");
	
	//path to click on show leave with status
	By ShowLeaveStatus = By.xpath("//div[@class='oxd-multiselect-wrapper']//div[@class='oxd-select-text-input' and text()='-- Select --']");
	

	public void showLeaveStatus() {
		Driver.findElement(ShowLeaveStatus).click();
	}
}
