package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().window().maximize();
        By textinputlocator = By.cssSelector("[myprop=myvalue]");
        WebElement inputelenemt = driver.findElement(textinputlocator);
        inputelenemt.sendKeys("Hello world");

        WebElement myradiobutton = driver.findElement(By.cssSelector("#my-radio-1"));
        if (myradiobutton.isSelected()){
            System.out.println("selected");
        }
        else{
            System.out.println("Not");
        }
        System.out.println("My radio button is"+" "+myradiobutton.isSelected());
        myradiobutton.click();
        System.out.println("M r b i"+" "+myradiobutton.isSelected());

//        WebElement myradiobutton2 = driver.findElement(By.cssSelector("#my-radio-2"));
//        if (myradiobutton2.isSelected()){
//            System.out.println("selected");
//        }
//        else{
//            System.out.println("Not");
//        }

    }
}
