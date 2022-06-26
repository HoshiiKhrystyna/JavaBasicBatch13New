package com.syntax.class23;

public class BrowserTester {
    public static void main (String [] args){
       // WebDriver chrome=new Safari();
       // chrome.startBrowser();
       // chrome.openURL("www.google.com");
       // chrome.testLoginPage();
       // chrome.closeBrowser();

        WebDriver [] browser={new Chrome(), new Safari(), new FireFox(),new IE()};
        for(WebDriver driver:browser){
            driver.startBrowser();
            driver.openURL("www.google.com");
            driver.testLoginPage();
            driver.closeBrowser();

            for(int i=0; i<browser.length; i++){
                browser[i].startBrowser();
                browser[i].openURL("www.google.com");
                browser[i].testLoginPage();
                browser[i].closeBrowser();
            }
        }

    }

}
