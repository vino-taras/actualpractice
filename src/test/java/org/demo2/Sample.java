package org.demo2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.pom.LoginPojo;

public class Sample extends BaseClass{
public static void main(String[] args) throws Exception {
	browserLaunch();
	maxWindow();
	launchUrl("https://www.facebook.com/");
	maxWindow();
	LoginPojo l= new LoginPojo();

	WebElement username=driver.findElement(By.name("email"));
	passText(username,"vinodhini");
	WebElement password;
	passText(l.getPassword(),"vino098");
	driver.navigate().refresh();
	click(l.getBtncreateacc());
	Set<String> allWindows = driver.getWindowHandles(); 
	for (String each : allWindows) {
	    driver.switchTo().window(each);
	}
	WebElement firstname;
	passText(l.getFirstname(),"Vinodhini");
	WebElement surname;
	passText(l.getSurname(),"Murali");
	
}
}
