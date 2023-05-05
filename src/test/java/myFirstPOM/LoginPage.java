package myFirstPOM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;



public class LoginPage extends Base {
	
	//Extent Reports Variables
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;	
	
	//LOCATORS
	
	By welcomeWindowLocator = By.xpath("//*[@id=\"mat-dialog-0\"]");
	By dismissButtonLocator = By.xpath("//*[@id=\"mat-dialog-0\"]/app-welcome-banner/div/div[2]/button[2]");
	By coockieBannerLocator = By.xpath("/html/body/div[1]");
	By weWantItButtonLocator = By.xpath("/html/body/div[1]/div/a");
	By accountButtonLocator = By.id("navbarAccount");
	By loginButtonLocator = By.id("navbarLoginButton");
	By loginContainerLocator = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-login/div/mat-card");
	By emailTextFieldLocator = By.id("email");
	By passwordTextFieldLocator = By.id("password");
	By loginMasterLocator = By.id("loginButton");
	By warningMessageLocator = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-login/div/mat-card/div[1]");
	By myEmailLocator = By.xpath("//*[@id=\"mat-menu-panel-0\"]/div/button[1]/span");
	
	//NULL LOGIN LOCATORS
	By emailWarningMessage = By.id("mat-error-0");
	By passwordWarningMessage = By.id("mat-error-1");
	
	//LOGOUT LOCATORS
	
	By logoutButtonLocator = By.id("navbarLogoutButton");
	By yourbasketButtonLocator = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-navbar/mat-toolbar/mat-toolbar-row/button[4]");
	
	
	//Email and password data
	String email = "li.ramoncr@gmail.com";
	String password = "Password123";
	
	
	//Super constructor to manage functions
	public LoginPage(WebDriver driver) 
	{
		super(driver);
	}
	
	
	
	///// FIRST METHOD LOGIN FAILED /////
	public void loginFailed() throws InterruptedException, Exception {
		
		// start reporters
	    htmlReporter = new ExtentHtmlReporter("extent.html");
	    extent = new ExtentReports();
	    extent.attachReporter(htmlReporter);
			
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		extent.attachReporter(htmlReporter);
		
		ExtentTest test = extent.createTest("Test Case No 1.- Validate if user can't login usin invalid credentials");
		test.log(Status.INFO, "This test case is to validate login is failing  using invalid credentials");
		
		
		//Verify welcome window is displayed
		test.log(Status.INFO, "Verify if Welcome Window is displayed");
		if (isDisplayed(welcomeWindowLocator)) {
			System.out.println("Welcome message window is present");
			test.pass("Welcome message window is present", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
			//test.addScreenCaptureFromPath("screenshot.png");
			
		}
		else {
			System.out.println("Element is NOT present");
			test.fail("Welcome Window element is NOT present", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
			//test.addScreenCaptureFromPath(null);
		
			
						
		}
		
		//Verify Dismiss  button is displayed and click
		if (isDisplayed(dismissButtonLocator)) {
			System.out.println("Button is present");
			click(dismissButtonLocator);	
		}
		else {
			System.out.println("Button is NOT present");
		}
		
		//Verify Cookie Banner is displayed and click
		if (isDisplayed(coockieBannerLocator)) {
			System.out.println("Cookie banner is present");
			
		}
		else {
			System.out.println("Cookie banner is NOT present");
		}
		
		//Verify Me Want it button is displayed and click
		if (isDisplayed(weWantItButtonLocator)) {
			System.out.println("Accept button is present");
			click(weWantItButtonLocator);
		}
		else {
			System.out.println("Accept button NOT present");
		}
			
		//Find Account button and click
		findElement(accountButtonLocator);
		click(accountButtonLocator);
		
		//Validate if Login button is displayed
		if (isDisplayed(loginButtonLocator)) {
			click(loginButtonLocator);
		}
		else {
			System.out.println("Login button not displayed");
		}
		
		//Verify Login box container is displayed enter credentials and validate warning message
		if (isDisplayed(loginContainerLocator)) {
			System.out.println("Login container was displayed");
			
			//Validate Email text box is displayed send email
			if(isDisplayed(emailTextFieldLocator)) {
				type("wrong@email.com", emailTextFieldLocator);
			}
			else {
				System.out.println("Email field not present");
			}
			
			//Validate Password field is present
			if (isDisplayed(passwordTextFieldLocator)) {
				type("password", passwordTextFieldLocator);
			}
			else {
				System.out.println("Password field not present");
			}
			
			//Validate Login button is enable and click
			if (isEnable(loginMasterLocator)) {
				click(loginMasterLocator);
			}
			else {
				System.out.println("Login button is not enable");
			}
		}	
		extent.flush();
	}
	
	
	//To send the text from Warning Message Error
	public String warningMessage() {
		
		//Validate "Invalid email or password." message is displayed
		WebElement  errorMessage =  findElement(warningMessageLocator);
		
		return getText(errorMessage);
		
	}

	///// SECOND METHOD LOGIN VALID /////
	
	//Method Login user
		public void validLogin() throws InterruptedException{
			
			//Verify welcome window is displayed
			if (isDisplayed(welcomeWindowLocator)) 
			{
				System.out.println("Welcome message window is present");
			}
			else 
			{
				System.out.println("Element is NOT present");
			}
			
			//Verify Dismiss  button is displayed and click
			if (isDisplayed(dismissButtonLocator)) 
			{
				System.out.println("Button is present");
				click(dismissButtonLocator);	
			}
			else 
			{
				System.out.println("Button is NOT present");
			}
			
			//Verify Cookie Banner is displayed and click
			if (isDisplayed(coockieBannerLocator)) 
			{
				System.out.println("Cookie banner is present");
			}
			else 
			{
				System.out.println("Cookie banner is NOT present");
			}
			
			//Verify Me Want it button is displayed and click
			if (isDisplayed(weWantItButtonLocator)) 
			{
				System.out.println("Accept button is present");
				click(weWantItButtonLocator);
			}
			else 
			{
				System.out.println("Accept button NOT present");
			}
			
			
			//Find Account button and click
			findElement(accountButtonLocator);
			click(accountButtonLocator);
			
			//Validate if Login button is displayed
			if (isDisplayed(loginButtonLocator)) 
			{
				click(loginButtonLocator);
			}
			else 
			{
				System.out.println("Login button not displayed");
			}
			
			
			//Verify Login box container is displayed enter credentials and validate warning message
			if (isDisplayed(loginContainerLocator)) 
			{
				System.out.println("Login container was displayed");
						
				//Validate VALID Email text box is displayed send email
				if(isDisplayed(emailTextFieldLocator)) 
				{
						type(email, emailTextFieldLocator);
				}
				else 
				{
					System.out.println("Email field not present");
				}
						
				//Validate Password field is present
				if (isDisplayed(passwordTextFieldLocator)) 
				{
					type(password, passwordTextFieldLocator);
				}
				else 
				{
					System.out.println("Password field not present");
				}
						
				//Validate Login button is enable and click
				if (isEnable(loginMasterLocator)) 
				{
					click(loginMasterLocator);
				}
				else 
				{
					System.out.println("Login button is not enable");
				}
			}	
			
		}
		
		//Validate if my email is displayed under Account button 
		public String loginSuccessfully() throws InterruptedException 
		{
						
			//Click on Account button
			click(accountButtonLocator);
					
			//Save content of Email element
			WebElement  myEmail =  findElement(myEmailLocator);
						
										
			//Return value to validate  if is my email	
			return getText(myEmail);
					
		}
		
	///// THIRD SCENARIO LOGIN WITH NULL VALUES
	public void nullLogin() throws InterruptedException 
	{
			
			//Verify welcome window is displayed
			if (isDisplayed(welcomeWindowLocator)) 
			{
				System.out.println("Welcome message window is present");
			}
			else 
			{
				System.out.println("Element is NOT present");
			}
			
			//Verify Dismiss  button is displayed and click
			if (isDisplayed(dismissButtonLocator)) 
			{
				System.out.println("Button is present");
				click(dismissButtonLocator);	
			}
			else 
			{
				System.out.println("Button is NOT present");
			}
			
			//Verify Cookie Banner is displayed and click
			if (isDisplayed(coockieBannerLocator)) 
			{
				System.out.println("Cookie banner is present");
			}
			else 
			{
				System.out.println("Cookie banner is NOT present");
			}
			
			//Verify Me Want it button is displayed and click
			if (isDisplayed(weWantItButtonLocator)) 
			{
				System.out.println("Accept button is present");
				click(weWantItButtonLocator);
			}
			else 
			{
				System.out.println("Accept button NOT present");
			}
			
			
			//Find Account button and click
			findElement(accountButtonLocator);
			click(accountButtonLocator);
					
			//Validate if Login button is displayed
			if (isEnable(loginButtonLocator)) 
			{
				click(loginButtonLocator);
			}
			else 
			{
				System.out.println("Login button not displayed");
			}
			
					
					
			//Verify Login box container is displayed enter credentials and validate warning message
			if (isDisplayed(loginContainerLocator)) 
			{
				System.out.println("Login container was displayed");
						
				//Validate VALID Email text box is displayed send email
				if(isDisplayed(emailTextFieldLocator)) 
				{
					//click on email field
					click(emailTextFieldLocator);
				}
				else 
				{
					System.out.println("Email field not present");
				}
						
				//Validate Password field is present
				if (isDisplayed(passwordTextFieldLocator)) 
				{
					//Click on Password field
					click(passwordTextFieldLocator);
				}
				else 
				{
					System.out.println("Password field not present");
				}
						
				
				//Validate Login button is  NOT enable and click
				
				if (isEnable(loginMasterLocator)) 
				{
					System.out.println("Login button is enable and should NOT");
					driver.quit();
				}
				else 
				{
					System.out.println("Login button is not enable, this is EXPECTED");
				}
			}
				
		}
	
	//Validate if warning email message
		public String warningEmailMessage() 
			{
				
				findElement(emailTextFieldLocator).click();
				WebElement  warningEmail =  findElement(emailWarningMessage);
				return getText(warningEmail);
			}		
			
			
			//Validate if warning email message
		public String warningPasswordlMessage() 
			{
				
				findElement(passwordTextFieldLocator).click();		
				
				WebElement  warningPassword =  findElement(passwordWarningMessage);
				return getText(warningPassword);
					
			}
		
	
		
		
		///// FOURTH SCENARIO LOGOUT /////
		//Method Login user
		public void logOutProcess() throws InterruptedException 
		{
			
		//Verify welcome window is displayed
				if (isDisplayed(welcomeWindowLocator)) 
					{
						System.out.println("Welcome message window is present");
					}
				else 
					{
						System.out.println("Element is NOT present");
					}
					
				//Verify Dismiss  button is displayed and click
				if (isDisplayed(dismissButtonLocator)) 
					{
						System.out.println("Button is present");
						click(dismissButtonLocator);	
					}
				else 
					{
						System.out.println("Button is NOT present");
					}
					
				//Verify Cookie Banner is displayed and click
				if (isDisplayed(coockieBannerLocator)) 
					{
						System.out.println("Cookie banner is present");
					}
				else 
					{
						System.out.println("Cookie banner is NOT present");
					}
					
				//Verify Me Want it button is displayed and click
				if (isDisplayed(weWantItButtonLocator)) 
					{
						System.out.println("Accept button is present");
						click(weWantItButtonLocator);
					}
				else 
					{
						System.out.println("Accept button NOT present");
					}
					
					
				//Find Account button and click
					findElement(accountButtonLocator);
					click(accountButtonLocator);
					
				//Validate if Login button is displayed
				if (isDisplayed(loginButtonLocator)) 
					{
						click(loginButtonLocator);
					}
				else 
					{
						System.out.println("Login button not displayed");
					}
					
					
				//Verify Login box container is displayed enter credentials and validate warning message
				if (isDisplayed(loginContainerLocator)) 
					{
						System.out.println("Login container was displayed");
								
					//Validate VALID Email text box is displayed send email
					if(isDisplayed(emailTextFieldLocator)) 
						{
								type(email, emailTextFieldLocator);
						}
					else 
						{
							System.out.println("Email field not present");
						}
								
					//Validate Password field is present
					if (isDisplayed(passwordTextFieldLocator)) 
						{
							type(password, passwordTextFieldLocator);
						}
					else 
						{
							System.out.println("Password field not present");
						}
								
					//Validate Login button is enable and click
					if (isEnable(loginMasterLocator)) 
						{
							click(loginMasterLocator);
						}
					else 
						{
							System.out.println("Login button is not enable");
						}
					}
					
					//Click on Account button then verify Logout button is displayed then click
					findElement(accountButtonLocator);
					click(accountButtonLocator);
					
					
					if(isDisplayed(logoutButtonLocator)) 
						{
							click(logoutButtonLocator);
						}
					else
						{
							System.out.println("Logout button  is not displayed");
						
						}
					
					//Verify Your Basket is displayed
						
					if(isDisplayed(yourbasketButtonLocator))
						{
							System.out.println("Your Basket button is not displayed");
						}
					else
						{
							System.out.println("Your Basket button is NOT displayed");
						}
			
			}
	
			
	
	
}
			
	
	
