package com.usa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_1 {
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
public static void main(String[] args) throws InterruptedException {
	Test_1 obj = new Test_1();
	obj.automation();
}

}
