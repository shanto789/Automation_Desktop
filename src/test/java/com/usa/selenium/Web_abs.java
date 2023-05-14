package com.usa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Web_abs {

public void automation() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("tanvirpatwary16@gmail.com");
	     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Tester01");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();	
		Thread.sleep(2000);
		driver.close();
	}
	
	public abstract void getMe();
	
	
}
