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
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;





public class LoginPage_TEST {
	
	private WebDriver driver;
	LoginPage loginPageTest;
	
	//ExtentHtmlReporter htmlReporter;
 	ExtentReports extent;
	ExtentTest test;
	
	

	@Before
	public void setUp() throws Exception 
	{
		loginPageTest = new LoginPage(driver);
		driver = loginPageTest.firefoxDriverConnection();
		loginPageTest.visit("https://juice-shop.herokuapp.com");
		driver.manage().window().maximize();
		
		//EXTEND REPORT
		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("MyReport.html");
	
		spark.config().enableOfflineMode(true);
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Extent Report Demo");
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setTimeStampFormat("dd/MM/yyyy HH:mm:ss");
		extent.attachReporter(spark);
		test = extent.createTest("FIRST METHOD LOGIN FAILED"); //Name of the title of the single report
		
	
	}
	
	
	@Test
	public void Test1_LoginFailed() throws InterruptedException, Exception {
		
		
		//Calling the complete method Login User
		loginPageTest.loginFailed();	
		
		//Validating the warning message text is correct
		test.pass("Welcome message window is present");
		assertEquals("Invalid email or password.", loginPageTest.warningMessage());
	
	}
	
	
	@Test
	public void Test2_LoginValid() throws Exception {
		
		//Calling method Valid Login from y Class
		loginPageTest.validLogin();
		
		//Validating if the email displayed is my email
		assertEquals("li.ramoncr@gmail.com", loginPageTest.loginSuccessfully());
		
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
		extent.flush();
		driver.close();
				
	}

	

}
