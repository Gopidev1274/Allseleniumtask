package org.prjs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4a {
	
	//DEBUG PROGRAM
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\GopiDeva\\selenium projects\\driver\\chromedriver.exe");
		WebDriver dev=new ChromeDriver();
		dev.get("https://www.facebook.com/");
		dev.manage().window().maximize();
		WebElement d1 = dev.findElement(By.id("email"));
		d1.sendKeys("Deva");
		String dAtt = d1.getAttribute("text");
		System.out.println(dAtt);
		WebElement dTex = dev.findElement(By.xpath("//span[text()='Create an account']"));
		String text = dTex.getText();		
		System.out.println(text);
	}}
