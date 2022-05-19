package freetrialproject;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keywords {
WebDriver driver;
FileInputStream fis;
Properties prop;
	public void open() {
      System.setProperty("webdriver.chrome.driver","F://selenium files//chromedriver.exe");
      driver=new ChromeDriver();
      
      try {
    	   fis=new FileInputStream("E:\\eclipse workspace\\java_1\\freetrialproject\\src\\main\\java\\freetrialproject\\object.properties2");
    	   prop=new Properties();
    	   prop.load(fis);
      }catch (Exception e) {
	e.printStackTrace();
	}
	}
	public void url(String httpurl) {
        driver.get(httpurl);		
	}

	public void inputbyname(String testdata, String objectname) {
		driver.findElement(By.xpath(prop.getProperty(objectname))).sendKeys(testdata);
		//driver.findElement(By.xpath(prop.getProperty(objectname))).send/
	}

}
