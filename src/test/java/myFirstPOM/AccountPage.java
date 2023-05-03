package myFirstPOM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AccountPage extends Base {
	
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
	
	
	
	//Account
	By accountButton = By.xpath("//*[@id=\"navbarAccount\"]");
	By goUserProfileButton = By.xpath(" //*[@id=\"mat-menu-panel-0\"]/div/button[1]");
	By userProfileLabel = By.xpath(" //*[@id= \"card\"]/div/h1");
	By ordersAndpaymentButton = By.xpath("//*[@id=\"mat-menu-panel-0\"]/div/button[2]/div");
	By orderHistoryButton = By.xpath("//*[@id=\"mat-menu-panel-3\"]/div/button[1]");
	By orderHistorySectionLabel = By.xpath("//*[@class= \"mat-card-title\"and contains(text(),'Order')]");
	By recycleButton = By.xpath("//*[@id=\"mat-menu-panel-3\"]/div/button[2]");
	By recyclingLabel = By.xpath("//*[@fxlayout=\"row\"]/div/h1");
	By mySavedAddressButton = By.xpath("//*[@id=\"mat-menu-panel-3\"]/div/button[3]");
	By myPaynmentOptionsButton = By.xpath("//*[@id=\"mat-menu-panel-3\"]/div/button[4]");
	By addNewCardDropdown = By.xpath("//*[@id=\"mat-expansion-panel-header-0\"]");
	
	
	
	//NewAddress
	By addNewAddressButton1 = By.xpath("//*[@class=\"mat-card mat-focus-indicator mat-elevation-z6\"]/div/button");
	By countryTextboxOut = By.xpath("//*[@id=\"address-form\"]/mat-form-field[1]/div/div[1]/div[3]");
	By countryTextboxIn =  By.xpath("//*[@id=\"mat-input-3\"]");
	
	By nameTextBoxOut = By.id("mat-input-4");
	By nameTextboxIn = By.xpath("//*[@id=\"mat-input-4\"]");
	
	By mobileTextboxOut = By.id("mat-input-5");
	By mobileTextboxIn = By.xpath("//*[@id=\"mat-input-5\"]");
	
	By zipcodeTextBoxOut = By.id("mat-input-6");
	By zipcodeTextBoxIn = By.xpath("//*[@id=\"mat-input-6\"]");
	
	By addressTextboxOut = By.id("address");
	By addressTextboxIn = By.xpath("//*[@id=\"address\"]");
	
	By cityTextboxOut = By.xpath("//*[@id=\"mat-input-8\"]");
	By cityTextboxIn = By.xpath("//*[@id=\"mat-input-8\"]");
	
	By stateTextboxOut = By.id("mat-input-9");
	By stateTextboxIn = By.xpath("//*[@id=\"mat-input-9\"]");
	
	By submitButton = By.xpath("//*[@id=\"submitButton\"]");
	
	//MY Saved Address
	By myAddressSavedTag = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-saved-address/div/app-address/mat-card/mat-table/mat-row[1]/mat-cell[2]");
	
	
	//Payment locators
	By nameCreditCarOut = By.xpath("//*[@id=\"cdk-accordion-child-0\"]/div/div/mat-form-field[1]/div/div[1]/div[3]");
	By nameCreditCardIn = By.xpath("//*[@id=\"mat-input-3\"]");
	
	By creditCardNumberOut = By.xpath("//*[@id=\"cdk-accordion-child-0\"]/div/div/mat-form-field[2]/div/div[1]/div[3]");
	By creditCardNumberIn = By.xpath("//*[@id=\"mat-input-4\"]");
	
	By expiryMonthDropDown = By.xpath("//*[@id=\"cdk-accordion-child-0\"]/div/div/mat-form-field[3]/div/div[1]/div[3]");
	By monthOption12DropDown = By.xpath("//*[@id=\"mat-input-5\"]/option[12]");
	
	By expiryYearDropDown = By.xpath("//*[@id=\"mat-input-6\"]");
	By expiryYearOptionDropDown = By.xpath("//*[@id=\"mat-input-6\"]/option[9]");
	By submitPaymentInfoButton = By.xpath("//*[@id=\"submitButton\"]");
	By myCreditCardTag = By.xpath("//*[@class=\"mat-cell cdk-cell cdk-column-Name mat-column-Name ng-star-inserted\"]");
	
	//Digital Wallet
	By digitalWalletbutton = By.xpath("//*[@id=\"mat-menu-panel-3\"]/div/button[5]");
	By amountTextBoxOut = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-wallet/mat-card/mat-form-field/div/div[1]/div[3]");
	By amountTextBoxIn = By.xpath("//*[@id=\"mat-input-3\"]");
	By continueWalltButton = By.xpath("//*[@id=\"submitButton\"]");
	By myPaymentOptionTwo = By.xpath("//*[@class=\"ng-star-inserted\"]/mat-card/div/app-payment-method/div/h1");
	
	
	//Data
	String email = "li.ramoncr@gmail.com";
	String password = "Password123";
	String country = "USA";
	String name = "Test";
	String mobileNumber = "1231231234";
	String zipcode = "90210";
	String bigAddress = "California";
	String city = "Hills";
	String state = "California";
	String nameCreditCard = "Test";
	String cardNumber = "4111111111111111";
	String newAmount = "100";
	
	
	
	//Method constructor to manage driver
	public AccountPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	//FIRST SCENARIO LOAD USER PROFILE PAGE
	public void userProfile () throws InterruptedException
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
		Thread.sleep(1000);
		
		
		//Find ACCOUNT button
		findElement(accountButtonLocator);
		click(accountButtonLocator);
		
		//Explicit wait function
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(goUserProfileButton));
		click(goUserProfileButton);
		
	}
	
	//Validate User Profile label is displayed
	public String userProfileSuccess()
	{
		
		//Save text from label
		WebElement labelUserProfileTitle = findElement(userProfileLabel);
		String content = getText(userProfileLabel);
		System.out.println("The label contain: " + content);
		
		//Return text from label
		return getText(labelUserProfileTitle);
		
	}
	
	//--------------SECOND SCENARIO ORDER HISTORY
	
	public void orderHistory () throws InterruptedException
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
		Thread.sleep(1000);
		
		
		//Find ACCOUNT button
		findElement(accountButtonLocator);
		click(accountButtonLocator);
		
		//Mouse hover 
		MoveToElement(ordersAndpaymentButton);
		Thread.sleep(500);
		
		//Click on Order History button
		click(orderHistoryButton);
		

		
	}
	
	//Validate Order history label is displayed
	public String orderHistoryLabel()
	{
		findElement(orderHistorySectionLabel);
		String content = getText(orderHistorySectionLabel);
		System.out.println("The label contain: " + content);
		
		//Return text from label
		return getText(orderHistorySectionLabel);
	}
	
	
	//----THIRD SCENARIO RECYCLE
	public void openRecycle() throws InterruptedException
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
		Thread.sleep(1000);
		
		
		//Find ACCOUNT button
		findElement(accountButtonLocator);
		click(accountButtonLocator);
		
		//Mouse hover 
		MoveToElement(ordersAndpaymentButton);
		Thread.sleep(500);
		
		
		//Click on Recycle button
		click(recycleButton);
		
	}
	
	//Validate Request Recycling label is displayed
	public String requestRecyclingLabel()
	{
		findElement(recyclingLabel);
		String content = getText(recyclingLabel);
		System.out.println("The label contain: " + content);
		
		//Return text from label
		return getText(recyclingLabel);
	}
	
	//---FOURTH SCENARIO ADDING ADDRESS
	
	public void addingAddress() throws InterruptedException
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
		Thread.sleep(1000);
		
		
		//Find ACCOUNT button
		findElement(accountButtonLocator);
		click(accountButtonLocator);
		
		//Mouse hover 
		MoveToElement(ordersAndpaymentButton);
		Thread.sleep(500);
		
		
		//Click on My saved address button
		click(mySavedAddressButton);
		
		//Enter +Add New Address
		click(addNewAddressButton1);
		
		click(countryTextboxOut);
		type(country, countryTextboxIn);
		
		click(nameTextBoxOut);
		type(name, nameTextboxIn);
		
		click(mobileTextboxOut);
		type(mobileNumber, mobileTextboxIn);
		
		click(zipcodeTextBoxOut);
		type(zipcode, zipcodeTextBoxIn);
		
		click(addressTextboxOut);
		type(bigAddress, addressTextboxIn);
		
		click(cityTextboxOut);
		type(city, cityTextboxIn);
		
		click(stateTextboxOut);
		type(state, stateTextboxIn);
		Thread.sleep(500);
		
		//Validate if submit button is enable and click
		 if (isEnable(submitButton))
		 {
			 System.out.println("Submit button was enable");
			 click(submitButton);
		 }
		 else
		 {
			 System.out.println("Subtmit button was not enable");
		 }
		Thread.sleep(500);
		
	}
	
	//Method to validate if My Address Tag has my previous ADDRESS ADDED
	public String myAddressConfirmation()
	{
		WebElement myAddressTag = findElement(myAddressSavedTag);
		String content = getText(myAddressSavedTag);
		
		System.out.println("My adress is: " + content);
		return getText(myAddressTag);
	}
	
	//---------FIFTH SCENARIO ADDING PAYMENT INFO
	public void addingPaymentOption() throws InterruptedException
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
		Thread.sleep(1000);
		
		
		//Find ACCOUNT button
		findElement(accountButtonLocator);
		click(accountButtonLocator);
		
		//Mouse hover 
		MoveToElement(ordersAndpaymentButton);
		Thread.sleep(500);
		
		//Click on My Payment Options button
		click(myPaynmentOptionsButton);
		
		//Click on Add credit card
		click(addNewCardDropdown);
		Thread.sleep(500);
		click(nameCreditCarOut);
		type(nameCreditCard, nameCreditCardIn);
		
		click(creditCardNumberOut);
		type(cardNumber, creditCardNumberIn);
		
		click(expiryMonthDropDown);
		click(monthOption12DropDown);
		Thread.sleep(500);
		
		click(expiryYearDropDown);
		click(expiryYearOptionDropDown);
		
		
		//Validate Submit button is enable  and click
		if (isEnable(submitPaymentInfoButton))
		{
			click(submitPaymentInfoButton);
		}
		else
		{
			System.out.println("Submit payment button was not present");
			driver.close();
		}
		
		
	}
	
	public String confirmCreditCard ()
	{
		WebElement myCreditCardNameTag = findElement(myCreditCardTag);
		String content = getText(myCreditCardTag);
		
		System.out.println("My adress is: " + content);
		return getText(myCreditCardNameTag);
	}
	
	//---------SIX SCENARIO ADDING DIGITAL WALLET INFO
	public void addingDigitalWallet () throws InterruptedException
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
		Thread.sleep(1000);
		
		
		//Find ACCOUNT button
		findElement(accountButtonLocator);
		click(accountButtonLocator);
		
		//Mouse hover 
		MoveToElement(ordersAndpaymentButton);
		Thread.sleep(500);
		
		//Click on Digital Wallet button
		click(digitalWalletbutton);
		
		//Enter new amount
		click(amountTextBoxOut);
		Thread.sleep(200);
		type(newAmount, amountTextBoxIn);
		
		if (isEnable(continueWalltButton))
		{
			System.out.println("The continue button was enable");
			click(continueWalltButton);
		}
		else
		{
			System.out.println("The button was not enable");
			driver.close();
		}
		
	}
	
	public String validatePaymentOptionTag02 ()
	{
		
		WebElement paymentOptionTwoTag = findElement(myPaymentOptionTwo);
		String content = getText(myPaymentOptionTwo);
		
		System.out.println("The section loaded is: " + content);
		return getText(paymentOptionTwoTag);
		
	}
	
	

}
