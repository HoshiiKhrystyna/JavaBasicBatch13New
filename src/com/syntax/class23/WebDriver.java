package com.syntax.class23;

public class WebDriver {
    public void startBrowser(){
        System.out.println("Starting the browser");
    }
    public void openURL(String url){
        System.out.println("opening "+url);
    }
    public void testLoginPage(){
        System.out.println("Checking if login page is visible");
    }
    public void closeBrowser(){
        System.out.println("closing the browser");
    }
}
class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("opening Google Chrome");
    }

    @Override
    public void openURL(String url) {
        System.out.println("opening the URL "+url +" on Google Chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on Google Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Chrome");
     }
}
class FireFox extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting the FireFox");
    }

    @Override
    public void openURL(String url) {
        System.out.println("opening the URL "+url +" on FireFox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on FireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the FireFox");
    }
}
class Safari extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting the Safari");
    }

    @Override
    public void openURL(String url) {
        System.out.println("opening the URL "+url +" on Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Safari");
    }
}
class IE extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting the IE");
    }

    @Override
    public void openURL(String url) {
        System.out.println("opening the URL "+url +" on IE");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on IE");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the IE");
    }
}