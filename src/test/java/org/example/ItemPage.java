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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ItemPage {
    private WebDriver driver;

    @BeforeClass
    public static void init() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setup() {

        driver = new ChromeDriver();

        driver.get("http://localhost:8082/");
        WebElement selectelement = driver.findElement(By.id("selectLink"));
        selectelement.click();


    }

    @After
    public void closeConnection() {

        driver.quit();
    }

    @Test
    public void check_for_the_item_check() {
        WebElement selectelement = driver.findElement(By.id("select1"));
        Select select = new Select(selectelement);
        select.selectByValue("maybe");
        assertEquals("maybe", selectelement.getAttribute("value"));
    }


}
