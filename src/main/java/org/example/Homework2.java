package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework2 {
    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://v1.training-support.net/selenium/target-practice");
//        By bycl = By.cssSelector(".ui.red.header");
//        WebElement byclass = driver.findElement(bycl);
//        System.out.println(byclass.getText());
//       By Bycl1 = By.cssSelector(".ui.green.button");
//       WebElement Bycl11 = driver.findElement(Bycl1);
//        Bycl11.click();
//        By but = By.cssSelector(".ui.yellow.button");
//        WebElement bb = driver.findElement(but);
//        System.out.println(bb.isEnabled());
//        By clcl = By.cssSelector(".ui.massive.material.top.attached.menu");
//        WebElement ac = driver.findElement(clcl);
//        System.out.println(ac.isDisplayed());
//        System.out.println(ac.isSelected());
//        WebElement button = driver.findElement(By.tagName("button"));
//        String buttonattribute = button.getDomAttribute("class");
//        System.out.println(buttonattribute);
//        driver.navigate().refresh();
//        WebElement h1 = driver.findElement(By.tagName("h1"));
//        System.out.println(h1.getText());
//        System.out.println(h1.isDisplayed());
//______________________________________________________________________________________________________
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
//        WebElement dropdown = driver.findElement(By.cssSelector("select[name='dropdown']"));
//        System.out.println(dropdown.isEnabled());
//            Select select = new Select(dropdown);
//            WebElement selection = select.getFirstSelectedOption();
//       if (selection != null && !selection.getText().isEmpty() ){
//           System.out.println(selection.getText());
//       }
//       else {
//           System.out.println("not selected");
//       }
      //  _______________________________________________________________________________
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
//        WebElement input = driver.findElement(By.cssSelector("input[name='username']"));
//        System.out.println(input.isEnabled());
//        WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
//        System.out.println(submit.getDomAttribute("type"));
//        WebElement textarea = driver.findElement(By.cssSelector("textarea[name='comments']"));
//        System.out.println(textarea.getText());
//        WebElement check = driver.findElement(By.cssSelector("input[value='cb1']"));
//        System.out.println(check.isSelected());
//        WebElement radio = driver.findElement(By.cssSelector("input[type='radio'][value='rd2']"));
//        radio.click();
// _________________________________________________________________________________________
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
//        WebElement drop = driver.findElement(By.cssSelector("select[name='dropdown']"));
//        System.out.println(drop.isEnabled());
//        Select select = new Select(drop);
//        WebElement selectedoption =  select.getFirstSelectedOption();
//        System.out.println(selectedoption.getText());
//        //Print the label text of the first checkbox.
//        WebElement hidden = driver.findElement(By.cssSelector("input[type='hidden']"));
//        System.out.println(hidden.getDomAttribute("value"));
//        WebElement sc = driver.findElement(By.cssSelector("input[type='submit']"));
//        System.out.println(sc.isDisplayed());
//-----------------------------------------------------------------------------------------------------

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
////        driver.get("https://example.com.");
//        String url = driver.getCurrentUrl();
//        System.out.println(url);
//        System.out.println(driver.getTitle());
////        driver.navigate().to("https://the-internet.herokuapp.com/");
//       driver.navigate().back();
//       driver.navigate().forward();
//       driver.navigate().refresh();
       WebElement a = driver.findElement(By.xpath("(//tbody//td)[5]"));
        System.out.println(a.getText());
        WebElement atd= driver.findElement(By.xpath("//*[contains(text(),'Checkbox')]"));
        System.out.println(atd.getText());
       


    }


}
