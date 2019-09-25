package com.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium-resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		boolean actual = driver.findElement(
				By.id("ctl00_mainContent_chk_SeniorCitizenDiscount"))
				.isSelected();

		
	}

}
