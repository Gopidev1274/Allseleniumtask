package org.prjs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Day 3 using Click the Button
public class Day3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GopiDeva\\selenium projects\\driver\\chromedriver.exe");
		WebDriver dev=new ChromeDriver();
		dev.get("https://www.facebook.com/");
		dev.manage().window().maximize();
		WebElement d1 = dev.findElement(By.id("email"));
		d1.sendKeys("Deva");
		WebElement d2 = dev.findElement(By.id("pass"));
		d2.sendKeys("Deva");
		WebElement d3 = dev.findElement(By.xpath("//input[@type='submit']"));
		d3.click();
		dev.quit();
	}}
