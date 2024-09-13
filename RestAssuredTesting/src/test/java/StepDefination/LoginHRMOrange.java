package StepDefination;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.LoginPage;
import io.cucumber.java.en.*;

public class LoginHRMOrange {
	// public String OrangeUrl =
	// "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public WebDriver driver;
	LoginPage obj;

	@Given("Launch the Chrome Browser and login Orange HRM")
	public void launch_the_chrome_browser_and_login_orange_hrm() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		obj = new LoginPage(driver);
	}

	@When("Open the URL_Orange HRM")
	public void open_the_url_orange_hrm() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@And("Enter the Username")
	public void enter_the_username() {
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");

	}

	@And("Enter the Password")
	public void enter_the_password() {
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
	}

	@And("Clock on Login")
	public void clock_on_login() {
		WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		loginBtn.click();
	}

	@Then("Verify the PageTitle")
	public void verify_the_page_title() {
		String PageTitle = driver.getTitle();
		System.out.println(PageTitle);
		Assert.assertEquals("OrangeHRM", PageTitle);
	}

	@And("Navigate to Home Page")
	public void navigate_to_home_page() {
		obj.clickLogoutdropdown();
	}

	@And("Click on Logout")
	public void click_on_logout() {
		obj.clickOnLogoutBtn();
	}

	@Then("click on PIM Module")
	public void click_on_pim_module() {
		obj.clickOnPIMmodule();

	}

	@And("click on Add Employee")
	public void click_on_add_employee() {
		obj.clickOnAddEmployee();
	}

	@And("Enter First Name")
	public void enter_first_name() {
		obj.SetFirstName("Rahul");
	}

	@And("Enter Middle Name")
	public void enter_middle_name() {
		obj.SetMiddleName("Laxman");
	}

	@And("Enter Last Name")
	public void enter_last_name() {
		obj.SetLastName("Harinkhede");
	}

	@And("click on Save Btn")
	public void click_on_save_btn() {
		obj.clickOnSaveBtn();
		System.out.println("Details Saved Succcessfully");
	}

	@And("click on Employee Employee List")
	public void click_on_employee_employee_list() {
		obj.clickOnEmployeeList();
	}

	@Then("Enter Employee Name")
	public void enter_employee_name() {
		obj.SetSearchEmployeeName("Rahul");
	}

	@Then("click on Search Btn")
	public void click_on_search_btn() {
		obj.clickOnSearchBtn();
	}

	@And("Enter the Valid Username")
	public void enter_the_valid_username() {
		obj.setUserName("Admin");
	}

	@And("Enter the Valid Password")
	public void enter_the_valid_password() {
		obj.SetPassword("admin123");
	}

	@And("Enter the InValid Username")
	public void enter_the_in_valid_username() {
		obj.setUserName("Test123");
	}

	@And("Enter the InvalidPassword")
	public void enter_the_invalid_password() {
		obj.SetPassword("admin432");
	}

	@Then("Velidate the Invalid Credential message")
	public void velidate_the_invalid_credential_message() {
		String message_expected = "Invalid credentials";
		String message_actual = driver
				.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();

		Assert.assertEquals(message_expected, message_actual);

	}

	@And("Close Browser")
	public void close_browser() {
		driver.close();
	}

}
