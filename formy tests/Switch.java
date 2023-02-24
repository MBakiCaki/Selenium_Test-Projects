import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:/Users/MßC/Downloads/chromedriver19.exe");
        WebDriver driver = new ChromeDriver();

        // navigate to page
        driver.get("https://formy-project.herokuapp.com/switch-window");

        // click button to open alert
        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();

        // switch to alert and click OK
        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.quit();

    }
}
