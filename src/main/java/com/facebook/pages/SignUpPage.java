package com.facebook.pages;

import org.openqa.selenium.By;

public class SignUpPage extends LoginPage{
	
	public void firstName(String fName) {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fName);
		
	}
	public void lastName(String lName) {
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lName);
	}

}
