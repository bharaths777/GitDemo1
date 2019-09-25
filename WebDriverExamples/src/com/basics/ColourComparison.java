package com.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColourComparison {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium-resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		String textcolour = driver.findElement(By.xpath("//div[@id='globalContainer']/div/div/div/div/div/div[2]")).getCssValue("color");
		String bacgroundolour = driver.findElement(By.xpath("//div[@id='globalContainer']/div/div/div/div/div/div[2]")).getCssValue("background");
		
		
		System.out.println(textcolour +" "+bacgroundolour);
		
		if(textcolour != bacgroundolour ){
			System.out.println("highlightd...");
		}
		else{
			System.out.println("not highlighted");
		}

	}

}
