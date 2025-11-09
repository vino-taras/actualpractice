package org.demo2;

import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

public static WebDriver driver;
public static Actions a;
public static Robot r;
public static Select s;

    public static void browserLaunch(){
	driver=new ChromeDriver();
    }
	public static void maxWindow() {
	driver.manage().window().maximize();
	}
	public static void launchUrl(String url) {
		driver.get(url);	
	}
	public static void pageTitle() {
		String Title=driver.getTitle();
		System.out.println(Title);
	}
	public static void currentUrl() {
		String currentUrl=driver.getCurrentUrl();
	}
	public static void passText(WebElement user,String name) {
	user.sendKeys(name);
	}
	public static void click(WebElement element) {
	element.click();
	}
	public static void screenshot(String newfile) throws Exception {
	TakesScreenshot t= (TakesScreenshot)driver;
	File source=t.getScreenshotAs(OutputType.FILE);
	File des= new File("screenshot"+".png");
	FileUtils.copyFile(source, des);
	}
	public static void browseClose() {
	driver.close();	
	}
	public static WebElement findElement(By locator) {
	return driver.findElement(locator);
	}

	public static void dragAndDrop(WebElement from,WebElement to) {
	a.dragAndDrop(from, to);
	}
	public static void doubleClick(WebElement text) {
	a.doubleClick(text);
	}
	public static void contextClick(WebElement text2) {
	a.contextClick(text2);
	}
	public static void scrollTo(WebElement element2) {
	a.scrollToElement(element2);
	}
	public static void selectbyvalue(WebElement element3,String value) {
	Select s= new Select(element3);
		s.selectByValue(value);
	}
	public static void selectByIndex(WebElement element4,int index) {
	Select s1= new Select(element4);
	s1.selectByIndex(index);
	}
	public static void selectByVisibleText(WebElement element5,String value) {
	Select s2=new Select(element5);
	s2.selectByVisibleText(value);
	}
	
	
	
	
	
}



