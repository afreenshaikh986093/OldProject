import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.concurrent.TimeUnit;

public class LoginTest {

    public static void main(String[] args) {
        // Set the path of the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();

        // Implicit wait
       // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        // Navigate to the login page
        driver.get("https://example.com/login");

        // Find username input field and enter the username
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("your_username");

        // Find password input field and enter the password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("your_password");

        // Find the login button and click it
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();

        // Verify if login is successful by checking for an element only visible upon successful login
        try {
            WebElement profile = driver.findElement(By.id("profileLink"));
            if (profile.isDisplayed()) {
                System.out.println("Login test passed!");
            }
        } catch (Exception e) {
            System.out.println("Login test failed.");
        }

        // Close the browser
        driver.quit();
    }
}
