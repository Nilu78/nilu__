import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Selenium {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();


        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));

        String searchTerm="chatGPT";
        String expectedTitle="chatGPT - Google Search";
        String expectedURL="https://chatgpt.com/";


        String actualTitle=driver .getTitle() +"BCDJH";

        if(actualTitle.equals(expectedTitle)){
            System.out.println(" Test passed");
        }else{
            System.out.println(" Test failed. Expected title: "+expectedTitle+" Actual title: "+actualTitle);
        }
    }
}
