package OpenChromeBrowser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alter5Example {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/kapil/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        //using leafground
        driver.get("https://www.leafground.com/alert.xhtml");

        WebElement alertClick = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']"));
        alertClick.click();
        Alert alertAccess = driver.switchTo().alert();
        Thread.sleep(3000);
        alertAccess.accept();

        WebElement cancelAltert = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']"));
        cancelAltert.click();
        Alert alertElement = driver.switchTo().alert();
        Thread.sleep(3000);
        alertElement.dismiss();

        WebElement acceptAlert = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']"));
        acceptAlert.click();
        Alert alertElement1 = driver.switchTo().alert();
        Thread.sleep(3000);
        alertElement1.accept();

        WebElement textAlert = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']"));
        textAlert.click();
        Thread.sleep(3000);
        Alert alertElement2 = driver.switchTo().alert();
        Thread.sleep(3000);
        alertElement2.sendKeys("Message typed by Kapil");
        alertElement2.accept();

        WebElement delete = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt106']"));
        delete.click();
        Alert alertElement3 = driver.switchTo().alert();
        alertElement3.accept();
    }
}
