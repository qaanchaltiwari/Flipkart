package com.flipkart;

import org.openqa.selenium.By;
import org.tfa.rahul.vtiger.utilitylayer.GenericClass;

public class Login {

	private CustmizeMethod cm;
    public Login(CustmizeMethod cm1) {
    	this.cm=cm1;
    }
	
	private By userName= By.xpath("//input[@class='_2IX_2- VJZDxU']");
	
	public By getUserName() {
		return userName;
	}
	private By password=By.xpath("//input[@type='password']");
	
	public By getPassword() {
		return password;
	}
	
private By logoutArrow =By.xpath("//*[text()='Ashish']/..");
	
	public By getlogoutArrow() {
		return logoutArrow;
	}
	
private By logout =By.xpath("//*[text()='Logout']");
	
	public By getlogout() {
		return logout;
	}
	private By login= By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");
	
	public By getLogin() {
		return login;
	}
	public void validLoginPage() {
		cm.input(userName, "asfdf");
		cm.input(password, "12334");
		cm.click(login);
	}
	
	// TEST CASE 
	
// Login TC - 1 
	  
	      //         When user login in application with valid username and valid password 
	       //         Then verified user gets login successfully 
	       //         Then Verified user jumps on dashboard page 
	
// TC -2 
    //         When user login in application with valid username and Invalid password 
    //         Then verified user should see error  
	
	// TC -3 
    //         When user login in application with invalid username and valid password 
    //         Then verified user should see error  
	
	// TC -4 
    //         When user login in application without username and without password 
    //         Then verified user should see error 
	
	
	// Product Menu validation - 
	
	//TC -1     User jumps on dashboard page 
	       //   Then user verified top offers which is first one option 
	
	// Search Menu validation - 
	
		//TC -2     User jumps on dashboard page 
	              //And user enters junks data keyword in search option 
		       //   Then verified nothing listed here  
	
}



