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
	selectByValue(l.getLocation(),"London");
	selectByIndex(l.getHotel(),2);
	selectByVisibleText(l.getRoomtype(),"Standard");
	passText(l.getCheckin(),"01/12/2025");
	passText(l.getCheckout(),"03/12/2025");
	Thread.sleep(2000);
	selectByIndex(l.getAdults(),2);
	selectByIndex(l.getChildren(),3);
	
	
}
}
