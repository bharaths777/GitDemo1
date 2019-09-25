package com.basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium-resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		int links = driver.findElements(By.tagName("a")).size();

		System.out.println("no of links in page " + links);

		WebElement footer = driver.findElement(By.id("gf-BIG"));

		int footerlinks = footer.findElements(By.tagName("a")).size();
		System.out.println(footerlinks);

		WebElement insidefooter = driver.findElement(By
				.xpath("//table[@class='gf-t']/tbody/tr[1]/td/ul"));
		int linksinsidefooter = insidefooter.findElements(By.tagName("a"))
				.size();
		System.out.println(linksinsidefooter);
		String click = Keys.chord(Keys.CONTROL, Keys.ENTER);
		for (int i = 1; i < linksinsidefooter; i++) {
			insidefooter.findElements(By.tagName("a")).get(i).sendKeys(click);
		}

		Set<String> wins = driver.getWindowHandles();
		Iterator<String> windows = wins.iterator();

		while (windows.hasNext()) {

			driver.switchTo().window(windows.next());
			System.out.println(driver.getTitle());
		}

	}

}
