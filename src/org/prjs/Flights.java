package org.prjs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\GopiDeva\\selprjs\\driver\\chromedriver.exe");
		WebDriver dev = new ChromeDriver();
		dev.get("https://www.goibibo.com/flights/");
		dev.manage().window().maximize();
		Robot r = new Robot();
		dev.findElement(By.id("gosuggest_inputSrc")).sendKeys("Delhi (DEL)");
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		dev.findElement(By.id("gosuggest_inputDest")).sendKeys("Chennai (MAA)");
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_DOWN);

		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		dev.findElement(By.id("fare_20190918")).click();
		dev.findElement(By.id("gi_search_btn")).click();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		List<WebElement> a = dev.findElements(By.xpath("//input[@class='button fr fltbook fb widthF105 fb quicks']"));
		int s = a.size();
		System.out.println(s);
		for (WebElement d : a) {
			System.out.println(d.getText());
		}
	}

}
