package myFirstPOM;

import static org.testng.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class AccoutPage_TEST {
	
	private WebDriver driver;
	AccountPage accountPageTest;

	@Before
	public void setUp() throws Exception 
	{
		accountPageTest = new AccountPage(driver);
		driver = accountPageTest.firefoxDriverConnection();
		accountPageTest.visit("https://juice-shop.herokuapp.com");
		driver.manage().window().maximize();
	}
	

	
	@Test
	public void Test1_Account_UserProfile() throws InterruptedException 
	{
		//Calling method userProfile
		accountPageTest.userProfile();
		
		//Validate text from user label/title
		assertEquals("User Profile", accountPageTest.userProfileSuccess());

	}
	
	
	
	@Test
	public void Test2_Account_OrderHistory() throws InterruptedException 
	{
		//Calling method orderHistory
		accountPageTest.orderHistory();
		
		//Validate title of Order History section
		assertEquals("Order History", accountPageTest.orderHistoryLabel());
	}
	
	
	@Test
	public void Test3_Account_Recycle() throws InterruptedException
	{
		//Calling method openRecycle
		accountPageTest.openRecycle();
		
		//Validate if title of Recycle section is correct
		assertEquals("Request Recycling Box", accountPageTest.requestRecyclingLabel());
		
	}
	
	
	@Test
	public void Test4_Account_NewAddress() throws InterruptedException
	{
		//Calling method to add new address
		accountPageTest.addingAddress();
		
		//Validate if address label has correct address
		accountPageTest.myAddressConfirmation();
		assertEquals("California, Hills, California, 90210", accountPageTest.myAddressConfirmation());
		
	}
	
	
	
	@Test
	public void Test5_Account_NewPayment() throws InterruptedException
	{
		//Calling method to add credit card
		accountPageTest.addingPaymentOption();
		
		//Validate if credit card added is the correct one
		accountPageTest.confirmCreditCard();
		assertEquals("Test", accountPageTest.confirmCreditCard());
	}
	
	
	@Test
	public void Test6_Account_DigitalWallet() throws InterruptedException
	{
		//Calling the method to add digital wallet
		accountPageTest.addingDigitalWallet();
		
		//Calling the method to validate if amount was displayed
		accountPageTest.validatePaymentOptionTag02();
		assertEquals("My Payment Options", accountPageTest.validatePaymentOptionTag02());
	}
	
	@After
	public void tearDown() throws Exception 
	{
		driver.close();
	}
	


}
