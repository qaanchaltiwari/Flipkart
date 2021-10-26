package com.flipkart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class HomePage {

	private CustmizeMethod cm;
    public HomePage(CustmizeMethod cm1) {
    	this.cm=cm1;
    }
	
	private By searchbox=By.xpath("//input[@name='q']");
	private By searchClick=By.xpath("//button[@class='L0Z3Pu']");
    private By cheakTop =By.xpath("//div[@class='CXW8mj']/following::div[@class='xtXmba']");

	
	
			public void search(String search) {	
    	cm.getElement(searchbox).click();
    	cm.getElement(searchbox).sendKeys(search);
    	cm.getElement(searchClick).click();
     }
			public void TopUp() {
			List	<WebElement> size = cm.verifyGetDriver().findElements(cheakTop);
		    int list =	size.size();
				for (int i = 1; i < list; i++) {
					String alltopUp=cm.verifyGetDriver().findElements(cheakTop).get(i).getText();
	                    // I am printing only apart form validation 
						System.out.println(alltopUp);
				}
			
			}

}
