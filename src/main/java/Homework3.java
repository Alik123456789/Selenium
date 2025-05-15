import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class Homework3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://demoqa.com/select-menu");
        chrome.manage().window().maximize();
        WebElement dropdownforcolors  = chrome.findElement(By.id("oldSelectMenu"));
        Select select = new Select(dropdownforcolors);
        select.selectByVisibleText("Purple");
        select.selectByIndex(2);
        select.selectByValue("4");
        String selectedoption = select.getFirstSelectedOption().getText();
        System.out.println(selectedoption);
        List <WebElement> options = select.getOptions();
        System.out.println("All the selecteable items");
        for (WebElement i : options){
            System.out.println(i.getText());
        }
        System.out.println("Total number of options: " + options.size());
        System.out.println(dropdownforcolors.isDisplayed());
        System.out.println("Is multiple" +":" + select.isMultiple());
        try {
            select.selectByVisibleText("goal");
        }
        catch (Exception e){
            System.out.println("You selected invalid optin"+":"+" "+e.getMessage());
        }
        System.out.println("Dropdown tagName"+":"+dropdownforcolors.getTagName());
        System.out.println("Dropdown id"+":"+dropdownforcolors.getDomAttribute("id"));

            chrome.navigate().refresh();
            WebElement refresheddropdownforcolors  = chrome.findElement(By.id("oldSelectMenu"));
            System.out.println(refresheddropdownforcolors.isDisplayed());

            try{
                WebElement byid = chrome.findElement(By.id("qve"));
            }
            catch(NoSuchElementException e){
                System.out.println(e.getMessage());
        }
    }
}
