package OrangeHRMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver Driver;
	
	public LoginPage(WebDriver Driver) {
		this.Driver=Driver;
		
	}
	
	By username = By.xpath("//input[@name='username' and contains(@placeholder, 'Username')]");
	By password = By.xpath("//input[@name='password' and contains(@placeholder, 'Password')]");
	By LoginBtn = By.xpath("//button[@type='submit']");
	
	public void enterUsername(String user) {
		Driver.findElement(username).sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		Driver.findElement(password).sendKeys(pass);
	}
	
	public void clklogin() {
		Driver.findElement(LoginBtn).click();
	}
	

}
