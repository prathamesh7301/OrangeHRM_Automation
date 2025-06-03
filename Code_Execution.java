package OrangeHRMS;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Code_Execution {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		
		//Opens OrangeHrm URL in Browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		LoginPage login = new LoginPage(driver);
		HomePage mainpage = new HomePage(driver);
		PIM_Employee_List_page EmpList=new PIM_Employee_List_page(driver);
		LeavePage Leave=new LeavePage(driver);
		AddEmployee AddEmp=new AddEmployee(driver);
		
		
		// Wait until username textbox is not visible to handle NoSuchElementFound exception
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username' and contains(@placeholder, 'Username')]")));
		
		//Login Page 
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clklogin();
		
		//Redirect to PIM page
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")));
		mainpage.clkPIM();
		System.out.println("Click on PIM Tab");
		
		// Click on Add Button to redirect to Add Employee page
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Add']")));
		EmpList.clkAddBtn();
		System.out.println("Clicked on Add button and sucessfully redirected to Add Employee page");
		
		// Add Employee
		AddEmp.FirstName("Selenium");
		AddEmp.MiddleName("Java");
		AddEmp.LastName("Maven");
		AddEmp.toggle();
		AddEmp.createUsername("Selenium");
		AddEmp.clkEnablebutton();
		AddEmp.createPassword("1234567a");
		AddEmp.confirmPassword("1234567a");
		AddEmp.clickSubmit();
		
		System.out.println("User is Redirected to Employee page automatically");
	
		//Add details in Employee Tab
		EmpList.addOtherID("0123");
		EmpList.drivingLicence("DUMMY1234");
		EmpList.LicenceExpiry();
		EmpList.Nationality();
		EmpList.MaritalStatus();
		EmpList.DateOFbirth();
		EmpList.MaleRadioBtn();
		EmpList.SaveBtn1();
		EmpList.AXWXXSX();
		EmpList.BloodGroup();
		EmpList.testField();
		EmpList.SaveBtn2();
	} 
}
