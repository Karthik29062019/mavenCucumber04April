package com.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	WebDriver driver;
	public void openUrl() {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation_Software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		//get() used for launching our web application
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	public void username(String uName) {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(uName);
		}
	
	public void password(String pass) {
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
	}
	
	public void loginButon() {
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	public void createAccount() throws Exception {
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
	}
	
	public void ConfirmButon() {
		System.out.println("Login Successfully");
	}
	
	public void verifyLogin() {
		System.out.println("Login Successfully");
	}
	
		
	public void verifySignup() {
		System.out.println("SignUp Successfully");
	}

}
