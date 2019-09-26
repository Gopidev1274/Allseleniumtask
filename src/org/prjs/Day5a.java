package org.prjs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5a {
	
	//ACTION DRAGANDDROP
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\GopiDeva\\selenium projects\\driver\\chromedriver.exe");
		WebDriver dev = new ChromeDriver();
		dev.get("http://demo.guru99.com/test/drag_drop.html");
		dev.manage().window().maximize();
		Actions a = new Actions(dev);
		WebElement d1 = dev.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement d2 = dev.findElement(By.xpath("//ol[@id='amt7']"));
		a.dragAndDrop(d1, d2).perform();

	}
}
