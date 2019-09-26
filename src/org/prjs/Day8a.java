package org.prjs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8a {
	//WINDOWS HANDLING Part-2222
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GopiDeva\\selprjs\\driver\\chromedriver.exe");
		WebDriver dev= new ChromeDriver();
		dev.get("https://www.amazon.com/");
		dev.manage().window().maximize();
		dev.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 7");
		dev.findElement(By.xpath("//input[@type='submit']")).click();
		dev.findElement(By.xpath("//img[@alt='Apple iPhone 7, 128GB, Red - For AT&T / T-Mobile (Renewed)']")).click();
	/*	String pwind = dev.getWindowHandle();	
		System.out.println(pwind);
		Set<String> allwind = dev.getWindowHandles();
		for (String v : allwind) {
			System.out.println(v);}
		dev.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	*/	}}
