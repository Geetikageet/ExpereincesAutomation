package com.Experiences.Automate;

import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RAFTestMode {
public WebDriver driver;
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver" ,"/Users/geetika/Desktop/Automation/MAC/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		driver.get("https://campaign.odicci.com/#/test/07b160f90af61765802f");
		driver.findElement(By.id("429")).click();
		driver.findElement(By.id("429")).sendKeys("Geetika");
		driver.findElement(By.id("430")).click();
		driver.findElement(By.id("430")).sendKeys("Geetika");
		driver.findElement(By.id("427")).click();
		driver.findElement(By.id("427")).sendKeys("1993geetika@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"mainWrapper\"]/div[2]/div[6]/div[2]/div")).click();
		driver.get("https://campaign.odicci.com/#/test/fa2346e120ae828980b0");
		driver.findElement(By.id("429")).click();
		driver.findElement(By.id("429")).sendKeys("Geetika");
		driver.findElement(By.id("430")).click();
		driver.findElement(By.id("430")).sendKeys("Geetika");
		driver.findElement(By.id("427")).click();
		driver.findElement(By.id("427")).sendKeys("geetika.5@tcs.com");
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"textTagBox\"]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"specialEmodule\"]/div[8]/button")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"rating78511\"]/div[5]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"top-lace\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"tapImage0\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"string\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"imageTagBox\"]/div/div[2]/div/div[1]/div/div/span")).click();
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"specialEmodule\"]/div[9]/div[2]/div[2]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"questionEmoduleAnswer\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"questionEmoduleAnswer\"]")).sendKeys("Hello");
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
}

}
