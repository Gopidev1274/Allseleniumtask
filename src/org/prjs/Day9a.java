package org.prjs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9a {

	// Confirm Alert
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\GopiDeva\\selprjs\\driver\\chromedriver.exe");
			WebDriver dev= new ChromeDriver();
			dev.get("http://demo.automationtesting.in/Alerts.html");
			dev.manage().window().maximize();
			dev.findElement(By.xpath("//a[text()='Alert with OK & Cancel']")).click();
			dev.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Alert z=dev.switchTo().alert();
			Thread.sleep(2500);
			z.dismiss();
			dev.quit();
		}}
