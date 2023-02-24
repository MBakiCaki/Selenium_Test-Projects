import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/MßC/Downloads/chromedriver19.exe");
        WebDriver driver = new ChromeDriver();

        // Radio Buttons

        // navigate to page
        driver.get("https://formy-project.herokuapp.com/radiobutton");

        // click buttons
        driver.findElement(By.id("radio-button-1")).click(); //id
        driver.findElement(By.cssSelector("input[value='option2']")).click(); //value attribute
        driver.findElement(By.xpath("/html/body/div/div[3]/input")).click(); //xPath
        Thread.sleep(3000);

        // Checkboxes
        // navigate to page
        driver.get("https://formy-project.herokuapp.com/checkbox");

        // click button
        driver.findElement(By.id("checkbox-1")).click(); //id
        driver.findElement(By.cssSelector("input[value='checkbox-2']")).click(); //value attribute
        driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]")).click(); //xpath
        Thread.sleep(3000);

        driver.quit();

    }
}
