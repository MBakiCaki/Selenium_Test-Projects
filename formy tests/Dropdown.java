import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/MßC/Downloads/chromedriver19.exe");
        WebDriver driver = new ChromeDriver();

        // navigate to page
        driver.get("https://formy-project.herokuapp.com/dropdown");
        // open dropdown menu
        WebElement dropdown = driver.findElement(By.id("dropdownMenuButton"));
        dropdown.click();
        // wait list to be appear and click autocomplete
        WebElement autocomplete_btn = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.id("autocomplete")));
        autocomplete_btn.click();

        driver.quit();

    }
}
