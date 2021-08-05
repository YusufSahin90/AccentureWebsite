package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver implements LocatorsAndVariables{


    public static WebDriver driver;

    static {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.accenture.com/de-de");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS); // sadece ana sayfa yüklenirken en başta
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // bütün webElement için geçerli


    }

}


