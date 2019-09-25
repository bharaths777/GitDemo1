package com.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QAClickCheckbox {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium-resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("checkBoxOption2")).click();
		String value = driver.findElement(By.id("checkBoxOption2")).getAttribute("value");
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdown);
		
		s.selectByValue(value);

		
		driver.findElement(By.id("name")).sendKeys(value);
		
		driver.findElement(By.id("alertbtn")).click();
		
		String alertmsg = driver.switchTo().alert().getText();
		
		if(alertmsg.contains(value)){
			System.out.println("test case passed .....");
			driver.switchTo().alert().accept();
			
		}
		else
		{
			System.out.println("failed test case....");
		}
	}

}
