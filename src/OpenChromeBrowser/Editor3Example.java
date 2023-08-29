package OpenChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editor3Example {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/kapil/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        //using leafground
        driver.get("https://www.leafground.com/input.xhtml");
        WebElement name = driver.findElement(By.xpath("//*[@id='j_idt88:name']"));
        name.clear();
        name.sendKeys("Kapil Sreeram");

        WebElement country = driver.findElement(By.id("j_idt88:j_idt91"));
        country.sendKeys(", Tamil Nadu");

        WebElement disabledCheck = driver.findElement(By.id("j_idt88:j_idt93"));
        Boolean res = disabledCheck.isEnabled();
        System.out.println("isEnables - " + res);

        WebElement clear = driver.findElement(By.id("j_idt88:j_idt95"));
        clear.clear();

        WebElement retriveTypedText = driver.findElement(By.id("j_idt88:j_idt97"));
        String text = retriveTypedText.getAttribute("value");
        System.out.println("\nretrived text - " + text);

        WebElement emailTypeAndTab = driver.findElement(By.id("j_idt88:j_idt99"));
        emailTypeAndTab.clear();
        emailTypeAndTab.sendKeys("kapilsreeram.r@gmail.com" + Keys.TAB);
    }
}
