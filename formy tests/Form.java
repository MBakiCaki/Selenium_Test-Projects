
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/MßC/Downloads/chromedriver19.exe");

        WebDriver driver = new ChromeDriver();

        // navigate to page
        driver.get("https://formy-project.herokuapp.com/form");

        // fill out form
        fillForm(driver);

        // submit
        driver.findElement(By.cssSelector("a[class='btn btn-lg btn-primary']")).click();

        // wait 3 second
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // assert alert message is successful
        WebElement element = driver.findElement(By.className("alert"));
        String alertMessage = element.getText();
        Assert.assertEquals(alertMessage, "The form was successfully submitted!");

        driver.quit();
    }

    public static void fillForm(WebDriver driver) {
        // fill name
        driver.findElement(By.id("first-name")).sendKeys("Bruce");
        driver.findElement(By.id("last-name")).sendKeys("Lee");

        // fill job title
        driver.findElement(By.id("job-title")).sendKeys("Fighter");

        // select education level
        driver.findElement(By.id("radio-button-2")).click();

        // select gender
        driver.findElement(By.id("checkbox-1")).click();

        // select experince
        driver.findElement(By.id("select-menu")).click();
        driver.findElement(By.cssSelector("option[value='4']")).click();

        // select date
        WebElement datepicker = driver.findElement(By.id("datepicker"));
        datepicker.sendKeys("01/01/2025");
        datepicker.sendKeys(Keys.RETURN);
    }
}