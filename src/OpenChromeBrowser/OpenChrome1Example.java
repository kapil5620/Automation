package OpenChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome1Example {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/kapil/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        //open the sumologs and enter username and password
        driver.findElement(By.name("q")).sendKeys("https://www.leafground.com" + Keys.ENTER);

        //It closes the current tab
        //driver.close();

        //It closes the entire chrome
        //driver.quit();

    }
}
