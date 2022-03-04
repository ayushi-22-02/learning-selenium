package org.example;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class radioTest {
    private WebDriver driver;
    @BeforeClass
    public static void init()
    {
        WebDriverManager.chromedriver().setup();
    }
    @Before
    public void setup()
    {

        driver = new ChromeDriver();

        driver.get("http://localhost:8082/");
        WebElement radio = driver.findElement(By.id("radioLink"));
        radio.click();


    }
    @After
    public void closeConnection()
    {
        driver.quit();
    }

    @Test
    public void test(){


        List<WebElement> list=driver.findElements(By.name("color"));
        WebElement color = null;
        for (WebElement webElement : list) {
            if (Objects.equals(webElement.getAttribute("value"), "blue")) {
                color = webElement;
            }
        }

//        WebElement tick=driver.findElement(By.cssSelector("body > div > form > input[type=radio]:nth-child(5)"));
        color.click();
        assertTrue(color.isSelected());

    }



}
