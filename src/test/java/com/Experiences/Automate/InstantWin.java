package com.Experiences.Automate;

import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstantWin {
public WebDriver driver;
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver" ,"/Users/geetika/Desktop/Automation/MAC/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		driver.get("https://campaign.odicci.com/#/c9711f73cbe7430f9b69");
		driver.findElement(By.id("427")).click();
		driver.findElement(By.id("427")).sendKeys("1993geetika@gmail.com");
		driver.findElement(By.id("1146")).click();
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"questionEmoduleAnswer\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"questionEmoduleAnswer\"]")).sendKeys("Hello");
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"top-lace\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"imageTagBox\"]/div/div[1]/div/div[1]/div/div/span")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"canvasFront\"]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"rating76637\"]/div[4]/div[1]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"specialEmodule\"]/div[8]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"specialEmodule\"]/div[9]/div[2]/div[2]/button[2]")).click();
		//driver.findElement(By.xpath("//*[@id=\"textTagBox\"]/div[1]/div[1]")).click();
		//driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		driver.findElement(By.xpath("//*[@class=\"string\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"tapImage0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"jackpot\"]/div[2]/div/div[6]")).click();
		
		
		
		
		
	}
}
