package org.prjs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7 {
	//SCREENSHOT PROGRAM
	
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\GopiDeva\\selenium projects\\driver\\chromedriver.exe");
	WebDriver dev=new ChromeDriver();
	dev.get("https://www.instagram.com/?hl=en");
//type casting
	TakesScreenshot z=(TakesScreenshot)dev;
	//temprovary save
	File src=z.getScreenshotAs(OutputType.FILE);
	System.out.println(src);
//Permanently save
	File dest=new File("C:\\Users\\ELCOT\\Desktop\\Screeenshot\\instagram.jpeg");
	FileUtils.copyFile(src, dest);
}
}
