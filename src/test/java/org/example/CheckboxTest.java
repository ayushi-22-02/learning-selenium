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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CheckboxTest {
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


    }
    @After
    public void closeConnection()
    {
        driver.quit();
    }
    @Test
    public void check_for_the_checkbox_lettuce()
    {
        WebElement checkbox1 = driver.findElement(By.id("checkboxLink"));
        checkbox1.click();
        WebElement lettuce = driver.findElement(By.id("lettuceCheckbox"));
        lettuce.click();
        WebElement mayo = driver.findElement(By.id("mayoCheckbox"));
        WebElement turkey = driver.findElement(By.id("turkeyCheckbox"));
        System.out.println(lettuce.isSelected());
          System.out.println(mayo.isSelected());
          System.out.println(turkey.isSelected());


        assertTrue(lettuce.isSelected());

    }



    @Test
    public void test_loading_complete_message() {
        WebElement checkbox1 = driver.findElement(By.id("checkboxLink"));
        checkbox1.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));

        WebElement msg = driver.findElement(By.id("message"));
        assertEquals("Loading complete...", msg.getText());
    }
}
