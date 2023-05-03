package myFirstPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends Base{
	
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
		By firstProductLocator = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[2]/button");
		By nameFirstProductLocator = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[1]/div[2]/div[1]");
		By yourBasketButtonLocator = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-navbar/mat-toolbar/mat-toolbar-row/button[4]");
		By yourBasketContainerLocator = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-basket/mat-card/app-purchase-basket");
		By productnameInsideContainerLocator = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-basket/mat-card/app-purchase-basket/mat-table/mat-row/mat-cell[2]");
		By redGlobeCounterLocator = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-navbar/mat-toolbar/mat-toolbar-row/button[4]/span[1]/span[2]");
		By productAddedSnackMessage = By.xpath("//*[@id=\"cdk-overlay-28\"]/snack-bar-container");
		By productAddedSnackXButton = By.xpath("//*[@id=\"cdk-overlay-32\"]/snack-bar-container/div/div/simple-snack-bar/div/button/span[1]");
		
		
		//Delete Product locator
		By trashButtonLocator = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-basket/mat-card/app-purchase-basket/mat-table/mat-row/mat-cell[5]/button");
		By checkOutButton = By.id("checkoutButton");
		
	
		
		//Add Address
		By selectanAddressContainer = By.id("card");
		By addNewAddressButton = By.xpath("//*[@id=\"card\"]/app-address/mat-card/div/button");
		By addNewAddressContainer2 = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-address-create/div/mat-card");
		
		By countryTextBox = By.xpath("//*[@id=\"address-form\"]/mat-form-field[1]/div/div[1]/div[3]");
		By countryTextboxIn = By.xpath("//*[@id=\"mat-input-3\"]");
		
		By nameTextBox = By.id("mat-input-4");
		By nameTextBoxIn = By.xpath("//*[@id=\"mat-input-4\"]");
		
		By mobileTextBox = By.id("mat-input-5");
		By mobileTextBoxIn = By.xpath("//*[@id=\"mat-input-5\"]");
		
		By zipCodeTextBox = By.id("mat-input-6");
		By zipCodeTextBoxIn = By.xpath("//*[@id=\"mat-input-6\"]");
		
		By addressBigTextBox = By.id("address");
		By addressBigTextBoxIn = By.xpath("//*[@id=\"address\"]");
		
		By cityTextBox = By.xpath("//*[@id=\"mat-input-8\"]");
		By cityTextBoxIn = By.xpath("//*[@id=\"mat-input-8\"]");
		
		
		By stateTextBox = By.id("mat-input-9");
		By stateTextBoxIn = By.xpath("//*[@id=\"mat-input-9\"]");
		
		
		By submitAddressButton = By.id("submitButton");
		By selectAnAddressContainer2 = By.xpath("//*[@id=\"card\"]");
		
		By addressRadioButton = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-address-select/div/app-address/mat-card/mat-table/mat-row[1]/mat-cell[1]/mat-radio-button/label/span[1]/span[1]");
		By selectaddressContinueButton = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-address-select/div/app-address/mat-card/button");
		By selectandAddressContinueButton = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-address-select/div/app-address/mat-card/button");
		
		//Delivery Information
		By deliveryAddressContainer = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-delivery-method/mat-card");
		By oneDayRadioButton = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-delivery-method/mat-card/div[3]/mat-table/mat-row[1]/mat-cell[1]/mat-radio-button/label/span[1]/span[1]");
		By deliveryaddressContinueButton = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-delivery-method/mat-card/div[4]/button[2]");
		
		//Payment Information
		By myPaymentsOptionsContainer = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-payment/mat-card");
		By addNewCardDropdown = By.xpath("//*[@id=\"mat-expansion-panel-header-0\"]");
		By nameCreditCardTextBox = By.xpath("//*[@id=\"mat-input-10\"]");
		By creditCardNumberTextBbox = By.xpath("//*[@id=\"mat-input-11\"]");
		By expiryMonthDropDown = By.xpath("//*[@id=\"mat-input-12\"]");
		By monthOption12DropDown = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-payment/mat-card/div/app-payment-method/div/div/mat-expansion-panel/div/div/div/mat-form-field[3]/div/div[1]/div[3]/select/option[12]");
		By expiryYearDropDown = By.xpath("//*[@id=\"mat-input-13\"]");
		By expiryYearOptionDropDown = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-payment/mat-card/div/app-payment-method/div/div/mat-expansion-panel/div/div/div/mat-form-field[4]/div/div[1]/div[3]/select/option[9]");
		By submitPaymentInfoButton = By.xpath("//*[@id=\"submitButton\"]");
		By myPaymentInfoRadioButton = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-payment/mat-card/div/app-payment-method/div/div[1]/mat-table/mat-row[1]/mat-cell[1]/mat-radio-button/label/span[1]/span[1]");
		By mypaymentContinueButton = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-payment/mat-card/div/div[2]/button[2]");
		By orderSummaryContainer = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-order-summary/mat-card/div[2]/mat-card");
		By placeYourOrderBurron = By.id("checkoutButton");
		By thanksYourPurchaseLabel = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-order-completion/mat-card/div[1]/div/mat-card[1]/div/h1");
		
		//Data
		String email = "li.ramoncr@gmail.com";
		String password = "Password123";
		String notEqual = "The name is not the same";
		String country = "USA";
		String name = "Test";
		String mobileNumber = "1231231234";
		String zipcode = "90210";
		String bigAddress = "California";
		String city = "Hills";
		String state = "California";
		String nameCreditCard = "Test";
		String cardNumber = "4111111111111111";
		
		
				
				
				
	public ProductPage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	//////FIRST SCENARIO ADD PRODUCT TO BASKET
	
	public void addingProduct() throws InterruptedException 
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
										/*-----------------------------------------
										//Select one random product
										selectRandomProduct(productRandomNameLocator);
										
										//Get text and print from random product
										getText(productRandomNameLocator);
										System.out.println(productRandomNameLocator);
										---------------------------------------------*/
										
		
		//Find First Product and click because I was not able to select random product
		if (isDisplayed(firstProductLocator))
			{
				click(firstProductLocator);
			}
		else
			{	
				System.out.println("First Product not displayed");//Here I have an error still displaying this message even when it found the product
			}
							
		//Get text name from he product selected and print from the product selected
		String product = getText(nameFirstProductLocator);
		System.out.println(product);
		
		
		//Validate Red Globe is displayed and print value of the counter
		
		if (isDisplayed(redGlobeCounterLocator))
			{
				System.out.println("Red glode counter is displayed");
			
				String counter = getText(redGlobeCounterLocator);
				int counterNumber = Integer.parseInt(counter);
			
				if (counterNumber > 0) 
					{
						System.out.println("Counter is working the value inside is: " + counterNumber);
					}
				else
					{
						System.out.println("Counter is not working");
					}
		
			}
		else
			{
				System.out.println("Red globe counter is not displayed");
			}
		
		
				
		//Click on Your Basket button
		if (isEnable(redGlobeCounterLocator))
		{
			click(yourBasketButtonLocator);
		}
		else
		{
			System.out.println("Your Basket button was not displayed");
		}
		
		//Validate your basket container is loaded, verify product is displayed 
		if (isDisplayed(yourBasketContainerLocator))
		{
			System.out.println("Your Basket page is loaded properly");
		}
		else
		{
			System.out.println("Your Basket Page is NOT loading correctly");
			driver.quit();
		}

		
		
		
	}
	
	
	//Validate if name of product selected is equal inside Your Basket Page
	public String nameIsCorrect() 
	{
					
		//validate name of product is equal to the selection
		if (isDisplayed(productnameInsideContainerLocator))
		{
			WebElement productName = findElement(productnameInsideContainerLocator);
			return getText(productName);
		}
		else 
		{
			return notEqual;
		}
	
	}
	
	////// SECOND SCENARIO DELETE PRODUCT FROM BASKET
	
	//Method to remove products
	public void deleteProduct () throws InterruptedException 
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
				
				
		//Find First Product and click because I was not able to select random product
		if (isDisplayed(firstProductLocator))
			{
				click(firstProductLocator);
			}
		else
			{	
				System.out.println("First Product not displayed");//Here I have an error still displaying this message even when it found the product
			}
									
		//Get text name from he product selected and print from the product selected
		String product = getText(nameFirstProductLocator);
		System.out.println(product);
				
				
		//Click on Your Basket button if red globe counter is enable
		if (isEnable(redGlobeCounterLocator))
			{
				click(yourBasketButtonLocator);
			}
		else
			{
				System.out.println("Your Basket button was not displayed");
			}
				
		//Validate your basket container is loaded, verify product is displayed 
		if (isDisplayed(yourBasketContainerLocator))
			{
				System.out.println("Your Basket page is loaded properly");
			}
		else
			{
				System.out.println("Your Basket Page is NOT loading correctly");
				driver.quit();
			}

		//Verify Trash button is enable the click to remove product
		if (isDisplayed(trashButtonLocator)) 
		{
			System.out.println("Trash button is present");
			click(trashButtonLocator);
		}
		else
		{
			System.out.println("Trash burron is not displayed");
		}
		
		//Validate Checkout button should be enable
		if (isEnable(trashButtonLocator))
		{
			System.out.println("Your product was not eliminated");
		}
		else
		{
			System.out.println("Your product was eliminated");
		}

							
	}
	
	
	////// THIRD SCENARIO COMPLETE THE ORDER FOR FIRST TIME
	
	public void completeOrderFirstTime () throws InterruptedException
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
				
				
		//Find First Product and click because I was not able to select random product
		if (isDisplayed(firstProductLocator))
			{
				click(firstProductLocator);
				
			}
		else
			{	
				System.out.println("First Product not displayed");//Here I have an error still displaying this message even when it found the product
			}
									
		//Get text name from he product selected and print from the product selected
		String product = getText(nameFirstProductLocator);
		System.out.println(product);
				
				
		//Click on Your Basket button if red globe counter is enable
		if (isEnable(redGlobeCounterLocator))
			{
				click(yourBasketButtonLocator);
			}
		else
			{
				System.out.println("Your Basket button was not displayed");
			}
				
		//Validate your basket container is loaded, verify product is displayed 
		if (isDisplayed(yourBasketContainerLocator))
			{
				System.out.println("Your Basket page is loaded properly");
			}
		else
			{
				System.out.println("Your Basket Page is NOT loading correctly");
				
			}
		Thread.sleep(1500);

		//Validate Checkout button is enable and click

		if (isEnable(trashButtonLocator))
		{
			
			click(checkOutButton);
			Thread.sleep(1000);
		}
		else
		{
			System.out.println("Checkout button is not enable");
			driver.close();
			
		}
		
	
		
		/*-------PROCESS TO ADD ADDRESS-------------*/
		
		//Verify Address container is displayed, and Add Address button is present then click
		if (isDisplayed(selectanAddressContainer))
		{
			System.out.println("Add new address container was displayed");
			
		}
		else
		{
			System.out.println("Add New Address container was not displayed");
			//driver.close();
		}
		
		
		//Verify Submit button is enable and click
		if (isEnable(addNewAddressButton))
		{
			System.out.println("Add New Address button was enable");
			click(addNewAddressButton);
			Thread.sleep(1000);
			
			click(countryTextBox);
			type(country, countryTextboxIn);
			
			click(nameTextBox);
			type(name, nameTextBoxIn);
			
			click(mobileTextBox);
			type(mobileNumber, mobileTextBoxIn);
			
			click(zipCodeTextBox);
			type(zipcode, zipCodeTextBoxIn);
			
			click(addressBigTextBox);
			type(bigAddress, addressBigTextBoxIn);
		
			
			click(cityTextBox);
			type(city, cityTextBoxIn);
			
			click(stateTextBox);
			type(state, stateTextBoxIn);
		}
		else
		{
			System.out.println("Add New Address button was not enable");
			driver.close();
		}
		
		//Validate Submit button is enable and click
		if (isEnable(submitAddressButton)) 
		{
			click(submitAddressButton);
			Thread.sleep(3000);
			
		}
		else
		{
			System.out.println("Submit button was not enable");
			driver.close();
		}

		
		
		//Verify Address container is displayed then check if address option/radio button is displayed then click
		Thread.sleep(4000);
		if (isDisplayed(selectAnAddressContainer2))
			{
				System.out.println("Select an Address container 2 is displayed");
			
				if (isDisplayed(addressRadioButton))
					{
					System.out.println("Radio button is present");	
					click(addressRadioButton);
					}
				else
					{
						System.out.println("Radio button address was not displayed");
						driver.close();
					}
			}
		
		//Verify  Select an Address -> Continue button is displayed and click
		if(isEnable(selectandAddressContinueButton))
		{
			System.out.println("Continue button is present");
			click(selectandAddressContinueButton);
		}
		else
		{
			System.out.println("Continue button was not present");
		}
		

		/*------PROCESS TO ADD PAYMENT INFO----------*/
		//Verify Delivery Address is displayed
		if (isDisplayed(deliveryAddressContainer))
		{
			System.out.println("Delivery Container is displayed");
			
			if(isDisplayed(oneDayRadioButton))
			{
				System.out.println("One Day Delivery radio button is displayed");
				click(oneDayRadioButton);
			}
			else
			{
				System.out.println("One Radio button was not displayed");
			}
			
			if (isEnable(deliveryaddressContinueButton))
			{
				System.out.println("Continue button is enable");
				click(deliveryaddressContinueButton);
			}
			else
			{
				System.out.println("Continue button was not displayed");
			}
		}
		
		//Add New Credit Card process
		click(addNewCardDropdown);
		type(nameCreditCard, nameCreditCardTextBox);
		type(cardNumber, creditCardNumberTextBbox);
		
		click(expiryMonthDropDown);
		click(monthOption12DropDown);
		Thread.sleep(1000);
		
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
		
		//Validate payment info option is displayed and select
		if (isDisplayed(myPaymentInfoRadioButton))
		{
			click(myPaymentInfoRadioButton);
		}
		else
		{
			System.out.println("Payment info radio button is not displayed");
			driver.close();
		}
		
		//Validate Continue button is enable
		if (isDisplayed(mypaymentContinueButton))
		{
			click(mypaymentContinueButton);
		}
		else
		{
			System.out.println("Payment continue buttone was not enable");
			driver.close();
		}
		
		//Validate Place your order button is enable and click
		if (isDisplayed(placeYourOrderBurron))
		{
			click(placeYourOrderBurron);
		}
		else
		{
			System.out.println("Place your order button was not enable");
			driver.quit();
		}
		Thread.sleep(1000);
		
	}
	
	//Validate if correct message is displayed when order was completed
	public String thankPurchaseMessage() throws InterruptedException 
	{
		
		findElement(thanksYourPurchaseLabel);
		click(thanksYourPurchaseLabel);
		
		WebElement  purchaseMessage =  findElement(thanksYourPurchaseLabel);
		System.out.println(purchaseMessage);
		return getText(purchaseMessage);
	}	
	
	
	
//////FOURTH SCENARIO COMPLETE THE ORDER FOR FIRST TIME
	
	public void completeOrderInfoSaved () throws InterruptedException
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
				
				
		//Find First Product and click because I was not able to select random product
		if (isDisplayed(firstProductLocator))
			{
				click(firstProductLocator);
				
			}
		else
			{	
				System.out.println("First Product not displayed");//Here I have an error still displaying this message even when it found the product
			}
									
		//Get text name from he product selected and print from the product selected
		String product = getText(nameFirstProductLocator);
		System.out.println(product);
				
				
		//Click on Your Basket button if red globe counter is enable
		if (isEnable(redGlobeCounterLocator))
			{
				click(yourBasketButtonLocator);
			}
		else
			{
				System.out.println("Your Basket button was not displayed");
			}
				
		//Validate your basket container is loaded, verify product is displayed 
		if (isDisplayed(yourBasketContainerLocator))
			{
				System.out.println("Your Basket page is loaded properly");
			}
		else
			{
				System.out.println("Your Basket Page is NOT loading correctly");
				
			}
		Thread.sleep(1500);

		//Validate Checkout button is enable and click

		if (isEnable(trashButtonLocator))
		{
			
			click(checkOutButton);
			Thread.sleep(1000);
		}
		else
		{
			System.out.println("Checkout button is not enable");
			driver.close();
			
		}
		
	
		
		/*-------PROCESS TO SELECT ADDRESS-------------*/
		
		//Verify Address container is displayed then check if address option/radio button is displayed then click
		Thread.sleep(4000);
		if (isDisplayed(selectAnAddressContainer2))
			{
				System.out.println("Select an Address container 2 is displayed");
			
				if (isDisplayed(addressRadioButton))
					{
					System.out.println("Radio button is present");	
					click(addressRadioButton);
					}
				else
					{
						System.out.println("Radio button address was not displayed");
						driver.close();
					}
			}
		
		//Verify  Select an Address -> Continue button is displayed and click
		if(isEnable(selectandAddressContinueButton))
		{
			System.out.println("Continue button is present");
			click(selectandAddressContinueButton);
		}
		else
		{
			System.out.println("Continue button was not present");
		}
		
		
		/*------PROCESS TO SELECT PAYMENT INFO----------*/
		//Verify Delivery Address is displayed
		if (isDisplayed(deliveryAddressContainer))
		{
			System.out.println("Delivery Container is displayed");
			
			if(isDisplayed(oneDayRadioButton))
			{
				System.out.println("One Day Delivery radio button is displayed");
				click(oneDayRadioButton);
			}
			else
			{
				System.out.println("One Radio button was not displayed");
			}
			
			if (isEnable(deliveryaddressContinueButton))
			{
				System.out.println("Continue button is enable");
				click(deliveryaddressContinueButton);
			}
			else
			{
				System.out.println("Continue button was not displayed");
			}
		}
		
		
		//Validate payment info option is displayed and select
		if (isDisplayed(myPaymentInfoRadioButton))
		{
			click(myPaymentInfoRadioButton);
		}
		else
		{
			System.out.println("Payment info radio button is not displayed");
			driver.close();
		}
		
		//Validate Continue button is enable
		if (isDisplayed(mypaymentContinueButton))
		{
			click(mypaymentContinueButton);
		}
		else
		{
			System.out.println("Payment continue buttone was not enable");
			driver.close();
		}
		
		//Validate Place your order button is enable and click
		if (isDisplayed(placeYourOrderBurron))
		{
			click(placeYourOrderBurron);
		}
		else
		{
			System.out.println("Place your order button was not enable");
			driver.quit();
		}
		Thread.sleep(1000);
		
	}
	
	//Validate if correct message is displayed when order was completed
	public String thankPurchaseMessageSecond() throws InterruptedException 
	{
		
		findElement(thanksYourPurchaseLabel);
		click(thanksYourPurchaseLabel);
		
		WebElement  purchaseMessage =  findElement(thanksYourPurchaseLabel);
		System.out.println(purchaseMessage);
		return getText(purchaseMessage);
	} 	
	
	

}
