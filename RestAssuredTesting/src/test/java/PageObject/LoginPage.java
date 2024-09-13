package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	//find web elements of login page

			@FindBy(xpath="//input[@name='username']")
			WebElement username;


			@FindBy(xpath="//input[@name='password']")
			WebElement password;

			@FindBy(xpath="//button[@type='submit']")
			WebElement loginBtn;
			
			@FindBy(xpath="(//a[@class='oxd-userdropdown-link'])[4]")
			WebElement logoutBtn;
			
			@FindBy(xpath="//p[@class='oxd-userdropdown-name']")
			WebElement logoutdropdown;
			
			@FindBy(xpath="//span[text()='PIM']")
			WebElement PIMModule;
			
			@FindBy(xpath="//a[text()='Add Employee']")
			WebElement AddEmployee;
			
			@FindBy(xpath="//input[@placeholder='First Name']")
			WebElement Firstname;
			
			@FindBy(xpath="//input[@placeholder='Middle Name']")
			WebElement MiddleName;
			
			@FindBy(xpath="//input[@placeholder='Last Name']")
			WebElement LastName;
			
			@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
			WebElement EnterEmpID;
			
			@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
			WebElement SaveBtn;

			@FindBy(partialLinkText="Employee List")
			WebElement EmployeeList;
			
			@FindBy(xpath="(//input[@placeholder='Type for hints...'])[1]")
			WebElement SearchEmployeeName;
			
			@FindBy(xpath="//button[@type='submit']")
			WebElement SearchBtn;
			
			@FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
			WebElement InvalidCredetial;
			
	  public LoginPage(WebDriver driver)
	  {
		  
	  PageFactory.initElements(driver, this);
	  }

			public LoginPage() {
		
	}

			//Methods for operations
			public void setUserName(String name)
			{
				username.sendKeys(name);
			}

			public void SetPassword(String pwd)
			{
				password.sendKeys(pwd);
			}
			
			public void clickOnLoginBtn()
			{
				loginBtn.click();;
			}
			
			public void clickOnLogoutBtn()
			{
				logoutBtn.click();
			}
			
			public void clickLogoutdropdown()
			{
				logoutdropdown.click();
			}
			
			public void clickOnPIMmodule()
			{
				PIMModule.click();
			}
			
			public void clickOnAddEmployee()
			{
				AddEmployee.click();
			}
			

			public void SetFirstName(String firstname)
			{
				Firstname.sendKeys(firstname);
			}
			

			public void SetMiddleName(String middlename)
			{
				MiddleName.sendKeys(middlename);
			}
			

			public void SetLastName(String lastname)
			{
				LastName.sendKeys(lastname);
			}

			public void SetEmployeeID(String EmpID)
			{
				EnterEmpID.sendKeys(EmpID);
			}
			
			public void clickOnSaveBtn()
			{
				SaveBtn.click();
			}
			
			public void clickOnEmployeeList()
			{
				EmployeeList.click();
			}
			public void SetSearchEmployeeName(String EmpName)
			{
				SearchEmployeeName.sendKeys(EmpName);
			}
			
			public void clickOnSearchBtn()
			{
				SearchBtn.click();
			}
			
			public void ValidateInvalidaCredetials()
			{
				InvalidCredetial.getText();
			}
			
}
