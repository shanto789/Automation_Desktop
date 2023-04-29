package com.usa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdiver_3 {

public void automation() throws InterruptedException {
	//“//*[@id='gb']/descendant::a[3]”
	
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.groupon.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='icon-x']")).click();
		driver.findElement(By.xpath("//*[@id='ls-body']/descendant::div[12]")).click();
	     //driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Tester01");
		//driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();	
		//Thread.sleep(2000);
		//driver.close();
	}

public static void main(String[] args) throws InterruptedException {
	Webdiver_3 obj= new Webdiver_3();
	obj.automation();
}
}

