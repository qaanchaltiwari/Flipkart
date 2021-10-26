package com.flipkart;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
	
		CustmizeMethod cm=new CustmizeMethod();
		Login log=new Login(cm);
		HomePage hm=new HomePage(cm);
        cm.launchingBrowser("Chrome");
        cm.getUrl("https://www.flipkart.com");
        
        log.validLoginPage();
        hm.search("mobile");
     hm.TopUp();
        
	}

}
