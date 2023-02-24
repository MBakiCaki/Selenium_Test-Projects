import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:/Users/MßC/Downloads/chromedriver19.exe");
        WebDriver driver = new ChromeDriver();

        // navigate to page
        driver.get("https://formy-project.herokuapp.com/fileupload");

        // upload file
        WebElement fileupload = driver.findElement(By.id("file-upload-field"));
        fileupload.sendKeys("example.png");

        // wait
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
