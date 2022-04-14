package com.sg.fb.driver;
import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	static WebDriver driver;
	
	public static WebDriver getDriver(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			if(Objects.isNull(driver))
	        driver=new ChromeDriver();
		}
		else
		if(browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			if(Objects.isNull(driver))
	        driver=new EdgeDriver();
		}
		
		return driver;
			 
	}

}
