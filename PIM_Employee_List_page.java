package OrangeHRMS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PIM_Employee_List_page {
	WebDriver Driver;
	
	public PIM_Employee_List_page(WebDriver Driver) {
		this.Driver = Driver;
	}
	
	//path to click on Add button
	By AddBtn = By.xpath("//button[@type='button' and contains(@class,'oxd-button oxd-button--medium oxd-button--secondary')]");
	
	//path to add other id
	By otherID = By.xpath("//label[text()='Other Id']/ancestor::div[contains(@class,'oxd-input-group')]//input"); 
	
	//path to Licence plate number
	By LicenceNumber = By.xpath("//label[text()=\"Driver's License Number\"]/ancestor::div[contains(@class,'oxd-input-group')]//input"); 
	
	//path to Licence Expiry date
	By LicenceExpiryDate = By.xpath("//label[text()='License Expiry Date']/ancestor::div[contains(@class,'oxd-input-group')]//input"); 
	
	//path to select Nationality 
	By NationalityDropdown = By.xpath("//label[text()='Nationality']/ancestor::div[contains(@class, 'oxd-input-group')]//div[contains(@class, 'oxd-select-text-input')]");
	
	//path to add marital status
	By maritalStatus = By.xpath("//label[text()='Marital Status']/ancestor::div[contains(@class,'oxd-input-group')]//div[contains(@class,'oxd-select-text-input')]");
	
	//path to add Birth Date
	By BirthDate = By.xpath("//label[text()='Date of Birth']/ancestor::div[contains(@class,'oxd-input-group')]//div[contains(@class,'oxd-date-input')]");
	
	//path to select Radio Button
	By RadioBtn = By.xpath("//input[@type='radio' and @value='1']");
	
	//path to click Save Button
	By SaveButton = By.xpath("//button[@type='submit' and @data-v-10d463b7 and @data-v-6653c066 and contains(., 'Save')]");
	
	//path to select axwxxsx textbox
	By axwxxsx = By.xpath("//label[text()='axwxxsx']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//input");
	
	//path to select blood type
	By BloodType = By.xpath("//label[text()='Blood Type']/ancestor::div[contains(@class, 'oxd-input-group')]//div[contains(@class, 'oxd-select-text-input')]");
	
	//path to add Text Field
	By TestField = By.xpath("//label[text()='Test_Field']/ancestor::div[contains(@class, 'oxd-input-group')]//input");
	
	//path to click Save button
	By SaveBtn2 = By.xpath("//button[@type='submit' and @data-v-10d463b7 and not(@data-v-6653c066) and contains(., 'Save')]");
	
	public void clkAddBtn() {
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(AddBtn)).click();
		System.out.println("Clicked Add Button");
	}
	
	public void addOtherID(String ID) { 
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(otherID)).sendKeys(ID);
		System.out.println("Other ID is added");
		System.out.println("Added Other ID");
	}

	
	public void drivingLicence(String Number) {
		Driver.findElement(LicenceNumber).sendKeys(Number);
		System.out.println("Added driving Licence");
	}
	
	public void LicenceExpiry() {
		WebElement dateInput = Driver.findElement(LicenceExpiryDate);
		dateInput.clear();
		dateInput.sendKeys("2025-10-26");
		System.out.println("Added Licence Expiry Date");
	}
	
	public void Nationality() {
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(10));

		WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(NationalityDropdown));
		dropdown.click();

		WebElement option = wait.until(ExpectedConditions.visibilityOfElementLocated(
		    By.xpath("//div[@role='listbox']//span[text()='Indian']")
		));
		option.click();
		System.out.println("Added Nationality");
	}
	
	public void MaritalStatus() {
		// Create WebDriverWait
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(10));

		WebElement maritalStatusDropdown = wait.until(ExpectedConditions.elementToBeClickable(maritalStatus));
		maritalStatusDropdown.click();

		WebElement optionSingle = wait.until(ExpectedConditions.elementToBeClickable(
		    By.xpath("//div[@role='listbox']//span[text()='Single']")
		));
		optionSingle.click();
		System.out.println("Added Marital Status");
	}
		
	public void DateOFbirth() {
		WebElement Date = Driver.findElement(BirthDate);
		Date.click();
		Date.sendKeys("2000-05-03"); 
		System.out.println("Added Date of Birth");
	}
	
	public void MaleRadioBtn() {
		WebElement SelectJob = Driver.findElement(RadioBtn);
		SelectJob.click();
		System.out.println("Click on Male Radio Button");
	}
	
	public void SaveBtn1() {
		WebElement clkSubUnit = Driver.findElement(SaveButton);
		clkSubUnit.click();
		System.out.println("Click on Save Button");
	}
	
	public void AXWXXSX() {
		WebElement SelectSub = Driver.findElement(axwxxsx);
		SelectSub.click();
		System.out.println("Added data in AXWXXSX textbox ");
	}
	
	public void BloodGroup() {
		
		WebElement dropdown = Driver.findElement(BloodType);
		dropdown.click();

		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5));
		WebElement option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='listbox']//span[text()='O+']")));
		option.click();
		System.out.println("Added Blood Group");
	}
	
	public void testField() {
		Driver.findElement(TestField).click();
		System.out.println("Added test field");
	}
	
	public void SaveBtn2() {
		Driver.findElement(SaveBtn2).click();
		System.out.println("Clicked on Save button");
	}
}

