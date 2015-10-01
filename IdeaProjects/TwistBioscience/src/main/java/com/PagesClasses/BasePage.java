package com.PagesClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by Dima on 9/30/2015.
 */
public class BasePage
{
    public static WebDriver driver = null;

    public void setup() throws IOException
    {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src\\test\\resources\\global.properties");
        properties.load(fileInputStream);
        properties.getProperty("browser");

        if(properties.getProperty("browser").contains("firefox"))
        {
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.get(properties.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
