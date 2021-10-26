package com.flipkart;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class CustmizeMethod {

		public WebDriver driver;
		public WebDriver verifyGetDriver() {
			return driver;
			
		}
		
		public void launchingBrowser(String browserName) {
			if(browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
				driver=new ChromeDriver();
				
			}
		}

		public void getUrl(String Url) {
			verifyGetDriver().get(Url);
		}

		public WebElement getElement(By element) {
			return verifyGetDriver().findElement(element);
		}

		public void getText(By element,String expText) {                    
			String actualText=getElement(element).getText().trim();
			if(actualText.equals(expText.trim())) {
				System.err.println("This text verification is passed. Actual_"+ actualText+ "&& expected_"+ expText);
			}
			else {
				System.err.println("This text verification is Failed. Actual_"+ actualText+ "&& expected_"+ expText);
			}
		}

		public void textContains(By element, String expText) {          //for match exp and actual result 1 by 1
			String actResult=getElement(element).getText().trim();
			if(actResult.contains(expText.trim())) {
				System.err.println("Text verification is passed. Actual_"+ actResult+ "&& expected_"+expText );
			}
			else {
				System.err.println("Text verification is Failed.Actual_"+ actResult+ "&& expected_"+ expText );
			}
		}

		public void disabled(By element, String expText) {
			boolean status=getElement(element).isEnabled();
			if(status==false) {
				System.err.println("Element status verification passed."+ status + "isDisabled");
			}
			else {
				System.out.println("Element status verification Failed."+status+ "isEnabled");
			}
		}

		public void enabled(By element, String expText) {
			boolean we1Status=getElement(element).isEnabled();
			if(we1Status==false) {
			System.out.println("Element status verification Passed."+we1Status+"isDisabled");	
			}
			else {
				System.out.println("Element status verification Failed."+we1Status+"isEnabled");
			}
		}

		public void elementVisible(By element, String expText, String elementName) {     //here is we have to use height and width >0
			boolean weStatus=getElement(element).isDisplayed();
			if(weStatus==false) {
			System.out.println("Element status verification is passed."+weStatus+ "isDisplayed");	
			}
			else {
				System.out.println("Element status verification is Failed."+weStatus+ "isNotDisplayed");
			}
		}

		public void getAttributeValue(By element, String expValue, String attributeName, String elementName) {
			String attrValue=getElement(element).getAttribute(attributeName);
			if(attrValue.equals(expValue)) {
				System.out.println("Element status verification Passed."+elementName+ "isDisabled");
			}
			else {
				System.out.println("Element status verification Failed."+elementName+ "isEnabled");
			}
		}
		///&&&&&&&&&&&&&&&&&&
		
		public void clear(WebElement we) {
			we.clear();
		}
		
		public void click1(WebElement we) {
			we.click();
		}

		public   void selectByIndex(By element, int index) {
			Select selobj=new  Select(getElement(element));
			selobj.selectByIndex(index);
			
		}

		public void selectByValue(By element, String value) {
			Select selobj=new Select(getElement(element));
			selobj.selectByValue(value);
			}

		public void selectByVisibleText(By element, String expText, String elementName) {
			Select selobj=new Select(getElement(element));
			selobj.selectByVisibleText(expText);
		}

		public String getText(By element) {
			return getElement(element).getText();
		}
     public void Logout(By element) {
    	 driver.close();
     }

		public void selectByVisibleTxt(By element, String text) {
			Select selobj=new Select(getElement(element));
			selobj.selectByVisibleText(text);
		}

		public String getSelectFirstOption(By element) {
			Select selobj=new Select(getElement(element));
			WebElement firstOption=selobj.getFirstSelectedOption();
			String fSelect=firstOption.getText();
			return fSelect;
		}
		public  List<WebElement> getAllSelectedOptions(By element) {
			Select selobj=new Select(getElement(element));
			return selobj.getAllSelectedOptions();
			
		}

		public  List<WebElement> getOptions(By element) {
			Select selobj=new Select(getElement(element));
			return selobj.getOptions();
			
		}

		public void isSelected(By element, String expText) {
			boolean status1=getElement(element).isSelected();
			if(status1==true) {
				System.out.println("Element status verification Passed."+status1+ "isDisplayed");
			}
			else {
				System.out.println("Element status verification Failed."+status1+ "isEnableds");
			}
		}

		//@@@@@@@@@@@@@@@@@@
		public void verifySendkeys(By element, String value) {
			Actions action=new Actions(driver);
			action.sendKeys(getElement(element),value).build().perform();
		}

		public void click(WebElement we) {
			we.click();
		}

		public void click(By target) {
			Actions action=new Actions(driver);
			action.click(getElement(target)).build().perform();;
		}

		public  void rightClick(By element) {
			Actions action=new Actions(driver);
			action.contextClick(getElement(element)).build().perform();
			
		}

		public  void doubleClick(By element) {
			Actions action=new Actions(driver);
			action.doubleClick(getElement(element)).build().perform();
			
		}

		public  void mouseOver(By element) {         //mouse over
			Actions action=new Actions(driver);
			action.moveToElement(getElement(element)).build().perform();

		}

		public  void clickAndHold(By target) {
			Actions action=new Actions(driver);
			action.clickAndHold(getElement(target)).build().perform();

		}

		public  void dragAndDrop(By source, By target) {
			Actions action=new Actions(driver);
			action.dragAndDrop(getElement(source),getElement(target)).release().build().perform();

		}


		public  void input(By element, String value) {
			Actions action=new Actions(driver);
			action.sendKeys(getElement(element), value).build().perform();
			
		}

		public  void input(By element) {
			Actions action=new Actions(driver);
			action.sendKeys(getElement(element)).build().perform();
			
		}

		public void thread(long num) {
			Actions action=new Actions(driver);
			action.pause(num).build().perform();
			
		}

		public void release(By we) {
			Actions action=new Actions(driver);
			action.release(getElement(we)).build().perform();
		}

		//@@@@@@@@@@@@@@

		public  String getTitle(By element) {
			return driver.getTitle();
			
		}

		public  String getPageSource(By element) {
			return driver.getPageSource();


		}

		//&&&&&&&&&&&&&&&&&&&&&&&&&&
		public void close() {
			driver.close();
		}

		public void quit() {
			driver.quit();
		}

		//@@@@@@@@@@@@@@@@@
		//FOR WINDOWHANDLES
		
		public String getRandomName() {
			return Long.toHexString(Double.doubleToLongBits(Math.random()));
		}

		public  void switchTo(WebElement we) {
			driver.switchTo().defaultContent();
			
		}

		public void switchTo1(WebElement we) {
			TargetLocator locator=driver.switchTo();
			locator.frame(we);
		}
		public void window(String value) {
			driver.switchTo().window(value);
			
		}

		public String getWindowHandle() {
			return driver.getWindowHandle();
			
		}

		//OR
		public String getWindowHandle1() {
		String hndlVal=	verifyGetDriver().getWindowHandle();
			return hndlVal;
		}
		
		public void windowHandles(String expTitle) {
			Set<String> hndlVal=	driver.getWindowHandles();
			for(String hValue:hndlVal) {
				driver.switchTo().window(hValue);
				String actTitle=driver.getTitle();
				if(actTitle.equalsIgnoreCase(expTitle)) {
					break;
				}
			}
				
			}

		public Set<String> getWindowHandles(By element) {
		Set<String> handleValues=verifyGetDriver().getWindowHandles();
		return handleValues;
		}

		public  Dimension getSize(By element, String xPath) {
			return driver.findElement(By.xpath(xPath)).getSize();
			
		}

		public  int getHeight(By element, String Xpath) {
			return driver.findElement(By.xpath(Xpath)).getSize().getHeight();

		}

		public  int getWidth(By element, String Xpath) {
			return driver.findElement(By.xpath(Xpath)).getSize().getWidth();
			
			
		}

		public  String getAttribute(By element, String Xpath) {
			return driver.findElement(By.xpath(Xpath)).getAttribute(Xpath);
			
		}

		//&&&&&&&&&&&&&&%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%


		public String trim() {
			String st=driver.getWindowHandle().trim();
			return st;
		}

		public int getCurrentUrl() {
			int num=driver.getCurrentUrl().length();
			return num;
		}

		public String getPageSource() {
			String s=driver.getPageSource();
			return s;
		}

		public String toString() {
			String sr=driver.toString();
			return sr;
		}
		public void m1(String expvalue){
		    WebElement colorTheme=driver.findElement(By.xpath("//select[@name='login_theme']"));
	colorTheme.click();
	   List<WebElement> num=driver.findElements(By.xpath("//select[@name='login_theme']//option"));
			for(int i=0;i<=num.size();i++){
				WebElement er=num.get(i);
				String text=er.getText();
				System.out.println(text);
				if (text.equalsIgnoreCase(expvalue)) {
					er.click();	
				}
			}
		}
	}	
		


	
	

