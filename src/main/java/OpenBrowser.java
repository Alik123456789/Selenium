import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class OpenBrowser {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
//
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.uk/");

//        WebDriver driver = new EdgeDriver();
//        driver.get("https://www.google.co.uk/");

//        WebDriver driver = new FirefoxDriver();
//        driver.get("https://www.google.co.uk/");
//        WebDriver driver = new ChromeDriver();
//     //   driver.get("https://www.google.com");
//        driver.navigate().to("https://www.google.com");
//        By locatorbyid = By.id("gbwa");
//        WebElement webelement = driver.findElement(locatorbyid);
//        By locatorbyname = By.name("q");
//        WebElement elementbyname = driver.findElement(locatorbyname);
//        By locatorbytagname = By.tagName("input");
//        WebElement elementbytagname = driver.findElement(locatorbytagname);
//        System.out.println(elementbytagname);
//        List<WebElement> elementsssbytagname = driver.findElements(locatorbytagname);
//        System.out.println("number of input elements"+" "+elementsssbytagname.size());
//        By locatorbyclass =  By.className("gNO89b");
//        WebElement e = driver.findElement(locatorbyclass);
//        List<WebElement> we = driver.findElements(locatorbyclass);
//        for (WebElement i : we){
//            System.out.println(i.isDisplayed());
//        }
//        By locatorbylinktext = By.linkText("Gmail");
//        WebElement link = driver.findElement(locatorbylinktext);
//        link.click();
//
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();
        By locatorbyclass =  By.className("gNO89b");
//        WebElement e = driver.findElement(locatorbyclass);

//        driver.quit();



    }

}
