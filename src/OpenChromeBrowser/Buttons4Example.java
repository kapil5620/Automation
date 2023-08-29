package OpenChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons4Example {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/kapil/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        //using leafground
        driver.get("https://www.leafground.com/button.xhtml");

        WebElement disableButtonCheck = driver.findElement(By.id("j_idt88:j_idt92"));
        boolean res = disableButtonCheck.isEnabled();
        System.out.println("res - " + res);

        WebElement position = driver.findElement(By.id("j_idt88:j_idt94"));
        int xpath = position.getLocation().getX();
        int ypath = position.getLocation().getY();
        System.out.println("Xpath is: " + xpath + " and Ypath is: " + ypath);

        WebElement buttonColor = driver.findElement(By.id("j_idt88:j_idt96"));
        String bgColor = buttonColor.getCssValue("background-color");
        System.out.println("bgColor - " + bgColor);

        WebElement heightAndWidth = driver.findElement(By.id("j_idt88:j_idt98"));
        int height = heightAndWidth.getSize().getHeight();
        int width = heightAndWidth.getSize().getWidth();
        System.out.println("Height is: " + height + " and Width is: " + width);

        WebElement button = driver.findElement(By.id("j_idt88:j_idt102:imageBtn"));
        button.click();

        WebElement hiddenButton = driver.findElement(By.id("j_idt88:j_idt102:j_idt104"));
        hiddenButton.click();

        WebElement settingsButton = driver.findElement(By.id("layout-config-button"));
        settingsButton.click();

        Thread.sleep(5000);

        WebElement clickButton = driver.findElement(By.id("j_idt88:j_idt90"));
        clickButton.click();
    }
}
