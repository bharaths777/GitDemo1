package com.basics;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartUtil {
	
	
	public static void addItems(WebDriver driver, String[] items){
		
		List<WebElement> listItems = driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i = 0 ; i <listItems.size(); i ++){
			
			String [] formattedItems = listItems.get(i).getText().split("-");
			String veggieName  = formattedItems[0].trim();
			
		List veg = Arrays.asList(items);
			
			if(veg.contains(veggieName)){
				
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				
				
			}
			
		}
		
	}

}
