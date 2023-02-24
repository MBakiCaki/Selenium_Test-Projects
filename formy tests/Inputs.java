import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Inputs {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:/Users/MßC/Downloads/chromedriver19.exe");
        WebDriver driver = new ChromeDriver();

        // navigate to page
        driver.get("https://formy-project.herokuapp.com/keypress");

        // type name
        driver.findElement(By.id("name")).click();
        driver.findElement(By.id("name")).sendKeys("Jack");

        // submit
        driver.findElement(By.id("button")).click();

        driver.quit();

    }
}
