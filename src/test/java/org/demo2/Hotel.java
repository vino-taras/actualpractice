package org.demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pom.LoginPojo;

public class Hotel extends BaseClass{
public static void main(String[] args) throws Exception {
	browserLaunch();
	maxWindow();
	launchUrl("http://adactinhotelapp.com/");
	maxWindow();
	Thread.sleep(3000);
	LoginPojo l= new LoginPojo();
	passText(l.getUsername(),"vinodhini09");
	Thread.sleep(3000);
	passText(l.getPassword(),"vinodhini90");
	l.getLogin().click();
	Thread.sleep(2000);
	Select s=new Select(l.getLocation());
	s.selectByValue("London");	
	Select s1= new Select(l.getHotel());
	s1.selectByIndex(2);
	Select s2=new Select(l.getRoomtype());
	s2.selectByVisibleText("Standard");
	Thread.sleep(2000);
	passText(l.getCheckin(),"01/12/2025");
	Thread.sleep(2000);
	passText(l.getCheckout(),"03/12/2025");
	Thread.sleep(2000);
	s1.selectByIndex(1);
	Thread.sleep(2000);
	s2.selectByVisibleText("2 - Two");
	
	
	
	
}
}
