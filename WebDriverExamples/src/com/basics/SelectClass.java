package com.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectClass {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium-resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		
		WebDriverWait w = new WebDriverWait(driver,5);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='finish'] h4")));
		
		String text = driver.findElement(By.cssSelector("[id='finish'] h4")).getText();
		System.out.println(text);

	}

}
