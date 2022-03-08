/*Muhammed Baki Caki 02.11.2021
Example project Selenium Testing for BIL359 lecture homework*/

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "**PATH**\\chromedriver.exe"); // select driver
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();	//fullscreen browser
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");	//open the page
		
		driver.findElement(By.name("firstname")).sendKeys("John"); //set firstname
		driver.findElement(By.name("lastname")).sendKeys("Doe");	//set lastname
		driver.findElement(By.id("sex-0")).click();//set gender
		 
		driver.findElement(By.id("exp-0")).click();//set experience
		driver.findElement(By.id("datepicker")).sendKeys("01.01.2021"); //set date
		driver.findElement(By.id("profession-0")).click();//set profession1
		driver.findElement(By.id("profession-1")).click();//set profession2
		driver.findElement(By.id("tool-2")).click();//set tools
		
		//set continents
		driver.findElement(By.id("continents")).click();
		WebElement dropdown = driver.findElement(By.id("continents"));
		dropdown.findElement(By.xpath("//*[@id=\"continents\"]/option[7]")).click();
		
		//set commands
		WebElement dropdown2 = driver.findElement(By.id("selenium_commands"));
		dropdown2.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[5]")).click();
		
		driver.findElement(By.id("Submit")).click(); //submit
		
		driver.close();
	}
}
