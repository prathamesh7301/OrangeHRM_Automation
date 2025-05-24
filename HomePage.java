package OrangeHRMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver Driver;
	
	public HomePage(WebDriver Driver) {
		this.Driver = Driver;	
		}
	
	public void clkPIM() {
		Driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
	}
	
	public void clkLeave() {
		Driver.findElement(By.xpath("//a[.//span[text()='Leave']]")).click();
	}
}