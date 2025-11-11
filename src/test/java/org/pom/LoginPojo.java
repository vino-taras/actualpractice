package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.demo2.BaseClass;



public class LoginPojo extends BaseClass{
public LoginPojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="username")
private WebElement username;
@FindBy(name="password")
private WebElement password;
@FindBy(id="login")
private WebElement login;
@FindBy(xpath="(//select[@class='search_combobox'])[1]")
private WebElement location;
@FindBy(xpath="(//select[@class='search_combobox'])[2]")
private WebElement hotel;
@FindBy(xpath="(//select[@class='search_combobox'])[3]")
private WebElement roomtype;
@FindBy(xpath="(//select[@class='search_combobox'])[4]")
private WebElement noofrooms;
@FindBy(xpath="(//select[@class='search_combobox'])[5]")
private WebElement adults;
@FindBy(xpath="(//select[@class='search_combobox'])[6]")
private WebElement children;
@FindBy(xpath="//input[@id='datepick_in']")
private WebElement checkin;
@FindBy(xpath="//input[@id='datepick_out']")
private WebElement checkout;
@FindBy(xpath="//input[@id='Submit']")
private WebElement search;
@FindBy(xpath="//input[@id='Reset']")
private WebElement reset;
@FindBy(xpath="//a[@href=\"https://adactinhotelapp.com/resources/AdactinHotelApp_SetupGuide.pdf\"]")
private WebElement mobileapp;
@FindBy(xpath="//a[@href=\"https://adactinhotelapp.com/HotelAdactinWebServices/\"]")
private WebElement hotelappwebservices;
@FindBy(xpath="//a[@href=\"http://adactinhotelapp.com/resources/Sample-TestCases_HotelApplication.pdf\"]")
private WebElement sampletestcases;
@FindBy(xpath="//a[@href=\"http://adactinhotelapp.com/resources/KnownDefects_HotelApp.pdf\"]")
private WebElement knowndefects;






public WebElement getSearch() {
	return search;
}
public WebElement getReset() {
	return reset;
}
public WebElement getMobileapp() {
	return mobileapp;
}
public WebElement getHotelappwebservices() {
	return hotelappwebservices;
}
public WebElement getSampletestcases() {
	return sampletestcases;
}
public WebElement getKnowndefects() {
	return knowndefects;
}
public WebElement getCheckin() {
	return checkin;
}
public WebElement getCheckout() {
	return checkout;
}
public WebElement getNoofrooms() {
	return noofrooms;
}
public WebElement getAdults() {
	return adults;
}
public WebElement getChildren() {
	return children;
}
public WebElement getRoomtype() {
	return roomtype;
}
public WebElement getLocation() {
	return location;
}
public WebElement getHotel() {
	return hotel;
}
public WebElement getLogin() {
	return login;
}
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;

}



}
