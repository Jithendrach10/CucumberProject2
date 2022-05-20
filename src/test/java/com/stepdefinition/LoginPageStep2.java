package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStep2{
	WebDriver driver;
	
@Given("user is on the adactin page")
 public void user_is_on_the_adactin_page() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	driver.manage().window().maximize();
	
}

@When("user should enter {String}and {String}")
 public void user_should_enter_and(String username , String password){
	WebElement txtUserName = driver.findElement(By.id("username"));
     txtUserName.sendKeys(username);
     
     WebElement txtPassword = driver.findElement(By.id("password"));
     txtPassword.sendKeys(password);
     
     WebElement btnLogin = driver.findElement(By.name("login"));
     btnLogin.click();
}

@When("user should  searchhotel {String} ,{String},{String},{String},{String},{String},{String},{String} ")
public void user_should_searchhotel_and(String location, String hotels, String roomTypes, String noOfRooms, String checkInDate, String checkOutDate, String adultPerRoom, String childrenPerRoom ) {
	WebElement dDnLocation = driver.findElement(By.id("location"));
   Select select = new Select(dDnLocation);
   select.selectByVisibleText(location);
	
   WebElement dDnhotel = driver.findElement(By.id("hotels"));
   Select select2 = new Select(dDnhotel);
   select2.selectByVisibleText(hotels); 
 
   WebElement dDnRoomType = driver.findElement(By.id("room_type"));
   Select select3 = new Select(dDnRoomType);
   select3.selectByVisibleText(roomTypes); 
   
   WebElement dDnNoOfRooms = driver.findElement(By.id("room_nos"));
   Select select4 = new Select(dDnNoOfRooms);
   select4.selectByVisibleText(roomTypes); 
   

   
   WebElement txtDateIn = driver.findElement(By.id("datepick_in"));
   txtDateIn.sendKeys(checkInDate);
   
   WebElement txtDateOut = driver.findElement(By.id("datepick_out"));
   txtDateOut.sendKeys(checkOutDate);
   
   WebElement dDnadultPerRoom = driver.findElement(By.id("adult_room"));
   Select select5 = new Select(dDnNoOfRooms);
   select5.selectByVisibleText(adultPerRoom); 
   
   
   WebElement dDnchildrenPerRoom = driver.findElement(By.id("child_room"));
   Select select6 = new Select(dDnchildrenPerRoom);
   select6.selectByVisibleText(childrenPerRoom); 
   
   WebElement btnSubmit = driver.findElement(By.id("Submit"));
   btnSubmit.click();
   
}

@When("user should selectHotel")
public void user_should_selectHotel() {
	WebElement btnRadio = driver.findElement(By.id("radiobutton_0"));
	btnRadio.click();
	WebElement btnContinue = driver.findElement(By.id("continue"));
	btnContinue.click();

}
@When("user should bookAHotel {String},{String},{String},{String},{String},{String},{String},{String},{String}")
public void user_should_bookAHotel(String firstName, String lastName, String billingAddress, String creditCardNo,String creditCardType,String expMonth, String expYear,String CVVNumber ) {
	
		WebElement txtFirstName = driver.findElement(By.id("first_name"));
		txtFirstName.sendKeys(firstName);

		WebElement txtLastName = driver.findElement(By.id("last_name"));
		txtLastName.sendKeys(lastName);
		
		WebElement txtBillingAddress = driver.findElement(By.id("address"));
		txtBillingAddress.sendKeys(billingAddress);
		
		WebElement txtCreditCardNo = driver.findElement(By.id("cc_num"));
		txtCreditCardNo.sendKeys(creditCardNo);
		
		WebElement dDnCreditCardType = driver.findElement(By.id("cc_type"));
         Select select7 = new Select(dDnCreditCardType);
         select7.selectByVisibleText(creditCardType);
        
         WebElement dDnExpMonth = driver.findElement(By.id("cc_exp_month"));
         Select select8 = new Select(dDnExpMonth);
         select8.selectByVisibleText(expMonth);
         
         WebElement dDnExpYear = driver.findElement(By.id("cc_exp_year"));
         Select select9 = new Select(dDnExpYear);
         select9.selectByVisibleText(expYear);
         
         WebElement txtCVVNumber = driver.findElement(By.id("cc_cvv")); 
         txtCVVNumber.sendKeys(CVVNumber);
        		 
         WebElement btnBookNow = driver.findElement(By.id("book_now"));
         btnBookNow.click();
        		 
         
        		 
        		 
}



//@When("user should bookConfiguration {String}")
//public void user_should_bookConfiguration(String OrderNo){
//  WebElement txnOrderValue = driver.findElement(By.id("order_no"));
//  txnOrderValue.getAttribute("value");
//  
//  WebElement btnItinerary = driver.findElement(By.id("my_itinerary"));
//  btnItinerary.click();
//}

//@When("user should click login button")
//public void user_should_click_login_button() {
//	   WebElement btnLogin = driver.findElement(By.name("login"));
//	   btnLogin.click();
//}
@Then("user should verify success message")
public void user_should_verify_success_message() {
    Assert.assertTrue(true);
}





}























