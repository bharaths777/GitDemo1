package com.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium-resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(
				By.id("fromCity"))
				.click();

		
		Thread.sleep(2000);
		driver.findElement(By.id("fromCity")).sendKeys("HYD");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Hyderabad, India')]"))
				.click();

		
		Thread.sleep(2000);
		
		driver.findElement(
				By.id("toCity"))
				.click();
		
		Thread.sleep(2000);
		driver.findElement(
				By.id("toCity")).sendKeys("MAA");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Chennai, India')]"))
				.click();
	}

}
