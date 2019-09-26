package org.prjs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\GopiDeva\\selenium projects\\driver\\chromedriver.exe");
	WebDriver dev= new ChromeDriver();
	dev.get("https://www.facebook.com/");
	dev.manage().window().maximize();
	dev.close();
}
}
