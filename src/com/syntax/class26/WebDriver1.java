package com.syntax.class26;

interface WebDriver1 {
    void openBrowser();void closeBrowser();void maximizeWindow();void findElement();}
class ChromeDriver implements WebDriver1{
    @Override
    public void openBrowser() {
        System.out.println("Open ChromeDriver");}
    @Override
    public void closeBrowser() {
        System.out.println("Close ChromeDriver");}
    @Override
    public void maximizeWindow() {
        System.out.println("Maximize window of ChromeDriver");}
    @Override
    public void findElement() {
        System.out.println("Finf elements in ChromeDriver");
    }
}
class FireFox implements WebDriver1{
    @Override public void openBrowser() {
        System.out.println("Open Firefox");}
    @Override
    public void closeBrowser() {
        System.out.println("Close Firefox");}
    @Override
    public void maximizeWindow() {
        System.out.println("Maximize windows of Firefox");}
    @Override
    public void findElement() {
        System.out.println("Find elements in Firefox");
    }
}
