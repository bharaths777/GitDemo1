package com.basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium-resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		int links = driver.findElements(By.tagName("a")).size();
		System.out.println(links);
		
		
		for (int i = 0 ; i <links ; i++){
			String click = Keys.chord(Keys.CONTROL, Keys.ENTER);
			driver.findElements(By.tagName("a")).get(i).sendKeys(click);

			
			
		}
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> wins = windows.iterator();
		
		
		
		while(wins.hasNext()){
			
			driver.switchTo().window(wins.next());
			System.out.println(driver.getTitle());
		}

	}

}
