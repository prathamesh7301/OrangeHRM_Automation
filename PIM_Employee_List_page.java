package OrangeHRMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PIM_Employee_List_page {
	WebDriver Driver;
	
	public PIM_Employee_List_page(WebDriver Driver) {
		this.Driver = Driver;
	}
	
	//path to add name
	By PIMname = By.xpath("//label[text()='Employee Name']/ancestor::div[contains(@class,'oxd-input-group')]//input"); 
	
	//path to add employee ID
	By PIMempID = By.xpath("//label[text()='Employee Id']/ancestor::div[contains(@class,'oxd-input-group')]//input"); 
	
	//path to click employee status
	By PIMclkEmpStatus = By.xpath("//label[text()='Employment Status']/following::div[contains(@class,'oxd-select-text')]"); 
	
	//path to select employee status 
	By PIMselectEmpStatus = By.xpath("//div[@role='listbox']//span[text()='Full-Time Permanent']");
	
	//path to add supervisor name
	By PIMsupervisorName = By.xpath("//label[contains(text(), 'Supervisor Name')]");
	
	//path to click job title
	By PIMclkJobTitle = By.xpath("//label[text()='Job Title']/ancestor::div[contains(@class,'oxd-input-group')]/div[2]//div[contains(@class,'oxd-select-wrapper')]");
	
	//path to select job title. selected HR Manager from job title
	By PIMselectJobTitle = By.xpath("//div[@role='option']//span[contains(text(), 'HR Manager')]");
	
	//path to click Sub Unit
	By PIMclkSubUnit = By.xpath("//label[text()='Sub Unit']/ancestor::div[contains(@class,'oxd-input-group')]/div[2]//div[contains(@class,'oxd-select-wrapper')]");
	
	//path to select option from sub unit dropdown
	By PIMselectSubUnit = By.xpath("//div[@role='listbox']//span[text()='Engineering']");
	
	//path to click on Reset Button
	By PIMResetBtn = By.xpath("//button[@type='reset']");
	
	//path to click on Search Button
	By PIMSearchBtn = By.xpath("//button[@type='submit']");
	
	//path to click Add button
	By PIMaddBtn = By.xpath("//button[normalize-space()='Add']");
	
	public void addUsername(String name) {  
		Driver.findElement(PIMname).sendKeys(name);
	}
	
	public void addEmpID(String empID) {
		Driver.findElement(PIMempID).sendKeys(empID);
	}
	
	public void ClkEmpStatus() {
		WebElement option = Driver.findElement(PIMclkEmpStatus);
		option.click();
	}
	
	public void SelectEmpStatus() {
		WebElement Select = Driver.findElement(PIMselectEmpStatus);
		Select.click();
	}
	
	public void addSupervisorName(String SName) {
		Driver.findElement(PIMsupervisorName).sendKeys(SName);
	}
		
	public void ClkJobTitle() {
		WebElement JobTitle = Driver.findElement(PIMclkJobTitle);
		JobTitle.click();
	}
	
	public void SelectJobTitle() {
		WebElement SelectJob = Driver.findElement(PIMselectJobTitle);
		SelectJob.click();
	}
	
	public void ClkSubUnit() {
		WebElement clkSubUnit = Driver.findElement(PIMclkSubUnit);
		clkSubUnit.click();
	}
	
	public void SelectSubUnit() {
		WebElement SelectSub = Driver.findElement(PIMselectSubUnit);
		SelectSub.click();
	}
	
	public void clkResetBtn() {
		Driver.findElement(PIMResetBtn).click();
	}
	
	public void clkSearchBtn() {
		Driver.findElement(PIMSearchBtn).click();
	}
	
	public void clkAddBtn() {
		Driver.findElement(PIMaddBtn).click();
	}
}

