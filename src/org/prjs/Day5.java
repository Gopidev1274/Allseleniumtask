package org.prjs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5 {
	
	//MOUSEOVER (DRAG AND CLICK) PROGRAM
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\GopiDeva\\selenium projects\\driver\\chromedriver.exe");
		WebDriver dev=new ChromeDriver();
		dev.get("http://greenstech.in/selenium-course-content.html");
		dev.manage().window().maximize();
		Actions a=new Actions(dev);
		WebElement d1 = dev.findElement(By.xpath("//a[text()='COURSES']"));
		a.moveToElement(d1).perform();
		WebElement d2 = dev.findElement(By.xpath("//span[text()='Oracle Training ']"));
		a.moveToElement(d2).perform();
		WebElement d3 = dev.findElement(By.xpath("//span[text()='Forms & Reports Training']"));
		d3.click();
		
	}}
