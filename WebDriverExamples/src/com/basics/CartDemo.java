package com.basics;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium-resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		String [] veggies = {"Brocolli","Cauliflower","Cucumber"};
		
		List<WebElement> vnames = driver.findElements(By.cssSelector("h4.product-name"));
		
		System.out.println(vnames.size());
		
		for(int i =0 ; i<vnames.size(); i++){
			
			String[] name = vnames.get(i).getText().split("-");
			
			String formattedname = name[0].trim();
			
			List veggie = Arrays.asList(veggies);
			
			if(veggie.contains(formattedname)){
				
		driver.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]")).get(i).click();
			}
		}
		
		
		

	}

}
