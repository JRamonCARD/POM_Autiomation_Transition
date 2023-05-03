package myFirstPOM;

import static org.testng.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ProductPage_TEST {
	
	private WebDriver driver;
	ProductPage addProductTest;
	
	

	@Before
	public void setUp() throws Exception 
	{
		addProductTest = new ProductPage(driver);
		driver = addProductTest.firefoxDriverConnection();
		addProductTest.visit("https://juice-shop.herokuapp.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Test1_AddProduct() throws InterruptedException 
	{
		
		//Calling method to add product
		addProductTest.addingProduct();
		
		//Validating the name of the product inside Your Basket Container
		assertEquals("Apple Juice (1000ml)", addProductTest.nameIsCorrect());
		
	}
	
	@Test
	public void Test2_DeleteProduct() throws InterruptedException {
		
		//Calling method delete product
		addProductTest.deleteProduct();
		
	}
	

	@Test
	public void Test3_CompleteOrderFirstTime() throws InterruptedException
	{
		//Calling method complete order
		addProductTest.completeOrderFirstTime();
		
		//Calling method to validate order completed message
		assertEquals("Thank you for your purchase!", addProductTest.thankPurchaseMessage());
	}
	
	@Test
	public void Test4_CompleteOrderInfoSaved() throws InterruptedException
	{
		//Calling method to complete order with information address & payment saved
		addProductTest.completeOrderInfoSaved();
		
		
		//Calling method to validate order completed message
		assertEquals("Thank you for your purchase!", addProductTest.thankPurchaseMessageSecond());
	}
	
	
	

	@After
	public void tearDown() throws Exception 
	{
		driver.close();
	}

	

}
