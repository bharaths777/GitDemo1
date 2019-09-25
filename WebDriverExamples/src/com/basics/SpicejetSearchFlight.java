package com.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpicejetSearchFlight {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium-resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"))
				.click();
		driver.findElement(
				By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='HYD']"))
				.click();

		driver.findElement(
				By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();

		driver.findElement(By.linkText("24")).click();

		driver.findElement(By.id("divpaxinfo")).click();

		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		
	Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
	s.selectByIndex(3);
	driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
