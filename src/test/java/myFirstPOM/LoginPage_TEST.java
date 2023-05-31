package myFirstPOM;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;





public class LoginPage_TEST {
	
	private WebDriver driver;
	LoginPage loginPageTest; //Creating instance of the class LoginPage where I do all the validation
	
	ExtentReports extent;
	ExtentTest test;
	String timeStamp = new SimpleDateFormat("MMddyyyy_HHmmss").format(Calendar.getInstance().getTime());//To get time and date
	
	
	@Before
	public void setUp() throws Exception 
	{
		
		
		//EXTENT REPORTS
		extent = new ExtentReports();
		
		ExtentSparkReporter spark = new ExtentSparkReporter("My Report.html" + timeStamp); //creating new object "spark" to create my report with name "My Report"
		
		spark.config().enableOfflineMode(true);
		spark.config().setDocumentTitle("Automation Report");//Name of the tab of the browser
		spark.config().setReportName("Extent Report Demo");//Label displayed in the right side of the report like a button
		spark.config().setTheme(Theme.STANDARD);
		
		extent.attachReporter(spark);
		test = extent.createTest("Longin Page Reports"); //Name of the title of the single report
		
		//Code to call Login Page class, driver browser and page
		loginPageTest = new LoginPage(driver);
		driver = loginPageTest.firefoxDriverConnection();
		loginPageTest.visit("https://juice-shop.herokuapp.com");
		driver.manage().window().maximize();
		
	
	}
	
	
	@Test
	public void Test1_LoginFailed() throws InterruptedException, Exception {
		
		
		//Calling the complete method Login User
		loginPageTest.loginFailed();	
		
		//Validating the warning message text is correct
		test.info("This TEST is to validate the user can not login using incorrect Email or Password");
		assertEquals("Invalid email or password.", loginPageTest.warningMessage());
		test.pass("User was unable to login using incorrect Email and Password");
		extent.flush();//This will close  the process and create the report
	
	}
	
	
	@Test
	public void Test2_LoginValid() throws Exception {
		
		//Calling method Valid Login from y Class
		loginPageTest.validLogin();
		
		//Information
		test.info("This TEST is to validate the user can login using valid Email or Password");
		
		//Validating if the email displayed is my email
		assertEquals("li.ramoncr@gmail.com", loginPageTest.loginSuccessfully());
		test.pass("User was able to login using valid Email and Password");
		extent.flush();//This will close  the process and create the report
	}
	
	@Test
	public void Test3_LoginNull() throws InterruptedException 
	{
		
		//Calling method nullLogin from Class 
		loginPageTest.nullLogin();
		
		//Validating warning message from null email
		assertEquals("Please provide an email address.", loginPageTest.warningEmailMessage());
		
		//Validating warning from null password
		assertEquals("Please provide a password.", loginPageTest.warningPasswordlMessage());

	}
	
	@Test
	public void Test4_Logout() throws InterruptedException 
	{
		//Calling method Login Logout
		loginPageTest.logOutProcess();
	}
	
		

	@After
	public void tearDown() throws Exception {
		
		driver.close();
				
	}

	

}
