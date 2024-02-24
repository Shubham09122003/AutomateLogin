import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class App {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "E:\\placement\\instabase\\AutomateLogin\\src\\driver\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver chrome_driver = new ChromeDriver();

        // Maximize the browser window
        chrome_driver.manage().window().maximize();

        // Launch the URL
        chrome_driver.get("https://demoqa.com/login");

        // find the username and password input field
        WebElement username = chrome_driver.findElement(By.id("userName"));
        WebElement password = chrome_driver.findElement(By.id("password"));

        // Enter username and password
        username.sendKeys("Shubham");
        password.sendKeys("Shubham123@");

        // Find the login button
        WebElement loginBtn = chrome_driver.findElement(By.id("login"));

        // Scroll to the login button
        Actions move_to_btn = new Actions(chrome_driver);
        move_to_btn.moveToElement(loginBtn).perform();

        // click the login button using JavaScript executor
        ((JavascriptExecutor) chrome_driver).executeScript("arguments[0].click();", loginBtn);
        
    }
}
