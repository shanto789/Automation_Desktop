package com.usa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_1 {
	
	public void automation() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("tanvirpatwary16@gmail.com");
	     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Tester01");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();	
		Thread.sleep(2000);
		driver.close();
	}
	
	public void saucedemo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.close();
	}

	public void testAutomation() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("student");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(2000);
		driver.close();
		
		}
	public void netflix() throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.netflix.com/login");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@name='userLoginId']")).sendKeys("shanto789@yahoo.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Family2020");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			driver.close();
	}

	
	public void prothomAlo() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://auth.prothomalo.com/sign-in-page?redirect_uri=https%3A%2F%2Fwww.prothomalo.com%2Fapi%2Fauth%2Fv1%2Foauth%2Ftoken&callback_uri=https%3A%2F%2Fwww.prothomalo.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shanto789@yahoo.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Aliya2021");
		driver.findElement(By.xpath("//button[@class='button Tq1xe']")).click();
		Thread.sleep(2000);
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		Webdriver_1 obj = new Webdriver_1();
		obj.automation();
		obj.saucedemo(); 
		obj.testAutomation();
	    obj.netflix();
		obj.prothomAlo();
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

	}
	

