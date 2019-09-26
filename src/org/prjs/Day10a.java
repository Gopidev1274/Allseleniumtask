package org.prjs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10a {

	// WEBTABLE USING ENHANCEDFORLOOP

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GopiDeva\\selprjs\\driver\\chromedriver.exe");
		WebDriver dev = new ChromeDriver();
		dev.get("https://www.toolsqa.com/automation-practice-table/");
		List<WebElement> tRows = dev.findElements(By.tagName("tr"));
		for (WebElement rows : tRows) {
		List<WebElement> tDatas = rows.findElements(By.tagName("td"));
		for (WebElement data : tDatas) {
			System.out.println(data.getText());
			}
		}
	}
}