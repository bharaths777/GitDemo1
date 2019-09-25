package com.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium-resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/portals-jobs");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//mouse over movements
		
		Actions a = new Actions(driver);
		
		WebElement jobs = driver.findElement(By.linkText("JOBS"));
		
		a.moveToElement(jobs).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.name("qp")).clear();
		driver.findElement(By.name("qp")).sendKeys("abc");
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.name("qp"))).doubleClick().build().perform();
		
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='login_Layer']/div"))).contextClick().build().perform();
		
		

	}

}
