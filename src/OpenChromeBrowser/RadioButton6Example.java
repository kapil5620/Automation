package OpenChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton6Example {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/kapil/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        //using leafground
        driver.get("https://www.leafground.com/radio.xhtml");

        WebElement first = driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[1]/label"));
        first.click();

        WebElement second = driver.findElement(By.xpath("//*[@id=\"j_idt87:city2\"]/div/div[1]"));
        second.click();
    }
}
