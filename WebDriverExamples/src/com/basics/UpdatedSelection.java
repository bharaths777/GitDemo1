package com.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UpdatedSelection {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"E:\\selenium-resources\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.name("flight_origin")).click();
		driver.findElement(By.xpath("//p[contains(text() , 'Hyderabad')]"))
				.click();
		driver.findElement(By.xpath("//p[contains(text() , 'Goa')]")).click();

		driver.findElement(By.xpath("//div[@id='BE_flight_paxInfoBox']/i[1]"))
				.click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='BE_flight_passengerBox']/div/div/div/div/span[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@data-flightagegroup='child']/div/div/span[2]")).click();
		
		

		/*
		 * driver.get("https://www.spicejet.com/");
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * 
		 * 
		 * driver.findElement(By.id("divpaxinfo")).click(); Thread.sleep(3000);
		 * 
		 * driver.findElement(By.id("hrefIncAdt")).click();
		 */

		// driver.findElement(By.className("icon icon-angle-right arrowpassengerBox")).click();
		/*
		 * WebElement adultcount =
		 * driver.findElement(By.className("adultcount"));
		 * 
		 * for(int i =0 ; i<5 ; i++){ adultcount.click(); }
		 * 
		 * driver.findElement(By.id("BE_flight_flsearch_btn")).click();
		 */

	}

}
