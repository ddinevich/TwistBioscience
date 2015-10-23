package com.PagesClasses;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
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
        FileInputStream fileInputStream = new FileInputStream("src/test/resources/global.properties");
        properties.load(fileInputStream);
        properties.getProperty("browser");

        if(properties.getProperty("browser").contains("firefox"))
        {
            driver = new FirefoxDriver();
        }

        else if(properties.getProperty("browser").contains("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "/Users/ddinevich/Documents/IdeaProjects/TwistBioscience/src/test/resources/chromedriver");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("test-type");
            options.addArguments("--disable-user-media-security=true");
            options.addArguments("--allow-running-insecure-content");

            driver = new ChromeDriver(options);
        }

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int Width = (int) toolkit.getScreenSize().getWidth();
        int Height = (int)toolkit.getScreenSize().getHeight();
        //For Dimension class, Import following library "org.openqa.selenium.Dimension"
        driver.manage().window().setSize(new Dimension(Width,Height));
        driver.get(properties.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
