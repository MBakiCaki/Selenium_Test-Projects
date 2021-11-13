/*
 * Muhammed Baki Çakı	13.11.2021
 * n11 ürün arama testi - BIL359 dersi Selenium test ödevi
 * */
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Project2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "**PATH**\\chromedriver.exe"); // select driver
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window();
		driver.get("https://n11.com");	//open the page
		
		driver.findElement(By.id("searchData")).sendKeys("bilgisayar");	//search keyword
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[1]/div/a")).click();	//click search button
		
		boolean result = false;
		
		try {
		result = driver.findElement(By.className("resultText")).isDisplayed();	//resultText only exist if any result find
		}
		catch(NoSuchElementException e){
			System.out.println("No result");
		}
		
		if(result){	//search successful
			System.out.println("Success");
		}
		driver.close();
	}
}
