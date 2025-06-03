package OrangeHRMS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddEmployee {
	
	WebDriver Driver;
	
	public AddEmployee(WebDriver Driver) {
		this.Driver = Driver;
	}
	
	//path to add employee first name
	By EmpFirstName = By.xpath("//input[@placeholder='First Name']");
	
	//path to add employee middle name
	By EmpMiddleName = By.xpath("//input[@placeholder='Middle Name']");
	
	//path to add employee last name
	By EmpLastName = By.xpath("//input[@placeholder='Last Name']");
	
	//path to add employee id
	By EmpID = By.xpath("//label[text()='Employee Id']/ancestor::div[contains(@class, 'oxd-input-group')]//input");
	
	//path to click on create login credential toggle
	By LoginCredentialToggle = By.xpath("//span[contains(@class, 'oxd-switch-input')]");
	
	//path to add username
	By CreateUname = By.xpath("//input[@class='oxd-input oxd-input--active' and @autocomplete='off']");
	
	//path to click on enable radio button
	By enableButton = By.xpath("//label[input[@type='radio' and @value='1']]//span[contains(@class, 'oxd-radio-input--active')]");

	//path to create password
	By CreatePW = By.xpath("(//input[@class='oxd-input oxd-input--active' and @type='password' and @autocomplete='off'])[1]");
	
	//path to create confirm password
	By ConfirmPW = By.xpath("//label[text()='Confirm Password']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//input[@type='password']");
	
	//path to click on cancel button
	By ClkCancel = By.xpath("//button[@type='button' and @class='oxd-button oxd-button--medium oxd-button--ghost']");
	
	//path to click on submit button
	By ClkSubmit = By.xpath("//button[@type='submit']");

	public void FirstName(String FirstName) {
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(EmpFirstName)).sendKeys(FirstName);
		System.out.println("Added name");
	}
	
	
	public void MiddleName(String MiddleName) {
		Driver.findElement(EmpMiddleName).sendKeys(MiddleName);
		System.out.println("Added middle name");
	}
	
	public void LastName(String LastName) {
		Driver.findElement(EmpLastName).sendKeys(LastName);
		System.out.println("Added last name");
	}
	
	public void EmpID(String ID) {
		Driver.findElement(EmpID).sendKeys(ID);
		System.out.println("Added employee id");
	}
	
	public void toggle() {
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("oxd-form-loader")));

		// Then click your toggle
		WebElement toggle = Driver.findElement(By.xpath("//span[contains(@class, 'oxd-switch-input')]"));
		toggle.click();

	}
	
	public void createUsername(String uname) {
		Driver.findElement(CreateUname).sendKeys(uname);
		System.out.println("Added username");
	}
	
	public void clkEnablebutton() {
	    WebElement button = Driver.findElement(enableButton);
	    boolean isToggleOn = button.isSelected();
	    if (!isToggleOn) {
	        button.click();
	        System.out.println("Enable button is clicked");
	    } else {
	        System.out.println("Enabled button is already clicked");
	    }
	}

	
	public void createPassword(String PW) {
		Driver.findElement(CreatePW).sendKeys(PW);
		System.out.println("Added password");
	}

	public void confirmPassword(String Confirmpassword) {
		Driver.findElement(ConfirmPW).sendKeys(Confirmpassword);
		System.out.println("Added confirm password");
	}
	
	public void clickCancel() {
		Driver.findElement(ClkCancel).click();
		System.out.println("Clicked cancel button");
	}
	
	public void clickSubmit() {
		Driver.findElement(ClkSubmit).click();
		System.out.println("Clicked submit button, Employee is added sucessfully");
	}
}
