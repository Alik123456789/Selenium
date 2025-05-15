package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Testingwindows {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://training-support.net/webelements/tabs");
        WebElement openNewTabElement = driver.findElement(By.cssSelector("button.bg-purple-200"));
        openNewTabElement.click();

        Set<String> windowHandles= driver.getWindowHandles();
        windowHandles.forEach(x-> System.out.println(x));
        // Switch to the new tab


        WebElement openAnotherTabElement = driver.findElement(By.cssSelector("[data-svelte-h='svelte-1io0agy']"));
        openAnotherTabElement.click();
     String windohandle = driver.getWindowHandle();
        for (String wh : windowHandles) {
            if (!wh.equals(windohandle)){
                  driver.switchTo().window(wh);
                  break;
            }
        }
        

    }
}
