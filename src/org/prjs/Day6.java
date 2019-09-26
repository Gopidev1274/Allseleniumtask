package org.prjs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6 {
	
	//ACTION USING ROBOT CLASS
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\GopiDeva\\selenium projects\\driver\\chromedriver.exe");
		WebDriver dev = new ChromeDriver();
		dev.get("http://www.facebook.com/");
		dev.manage().window().maximize();
		WebElement tEmail = dev.findElement(By.id("email"));
		tEmail.sendKeys("daeva");
		Actions a=new Actions(dev);
		a.doubleClick(tEmail).perform();
		a.contextClick(tEmail).perform();
		Robot s= new Robot();
		for (int i=1;i<=3; i++) {
			s.keyPress(KeyEvent.VK_DOWN);
			s.keyRelease(KeyEvent.VK_DOWN);
		}
			s.keyPress(KeyEvent.VK_ENTER);
			s.keyRelease(KeyEvent.VK_ENTER);
			WebElement tPass = dev.findElement(By.id("pass"));
			tPass.click();
			s.keyPress(KeyEvent.VK_CONTROL);
			s.keyPress(KeyEvent.VK_V);
	
			s.keyRelease(KeyEvent.VK_CONTROL);
			s.keyRelease(KeyEvent.VK_V);
			WebElement d3 = dev.findElement(By.xpath("//input[@type='submit']"));
			d3.click();
	}}
