package com.Experiences.Automate;

import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PRizeDraw {
public WebDriver driver;
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver" ,"/Users/geetika/Desktop/Automation/MAC/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		driver.get("https://campaign.odicci.com/#/a45f2e65a129a739ebba");
		driver.findElement(By.id("427")).click();
		driver.findElement(By.id("427")).sendKeys("1993geetika@gmail.com");
		driver.findElement(By.id("1146")).click();
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\"textTagBox\"]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		driver.findElement(By.id("questionEmoduleAnswer")).click();
		driver.findElement(By.id("questionEmoduleAnswer")).sendKeys("ABD");
	driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
	driver.findElement(By.xpath("//*[@id=\"imageTagBox\"]/div/div[1]/div/div[1]/div/div/span")).click();
	driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
	driver.findElement(By.xpath("//*[@id=\"specialEmodule\"]/div[8]/div[2]/div[2]/button[2]")).click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//*[@id=\"rating78372\"]/div[5]/div[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
	
		
	}
}
