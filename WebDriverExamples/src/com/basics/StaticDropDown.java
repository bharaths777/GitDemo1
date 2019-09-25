package com.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium-resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement currency = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
		
		Select sel = new Select(currency);
		
		String defaultvalue = sel.getFirstSelectedOption().getText();
		
		sel.selectByIndex(2);
		Thread.sleep(3000);
		sel.selectByValue("USD");
		Thread.sleep(3000);
		sel.selectByVisibleText("INR");
	
		
		
		System.out.println("default selected value ----"+defaultvalue);
		List<WebElement> count = sel.getOptions();
		System.out.println(count.size());
		
		for(WebElement sele:count)
		{
			
			System.out.println(sele.getText());
		}
	

	}

}
