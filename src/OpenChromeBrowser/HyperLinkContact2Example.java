package OpenChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinkContact2Example {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/kapil/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/dashboard.xhtml");
//        driver.findElement(By.id("menu-button")).click();
    }
}
