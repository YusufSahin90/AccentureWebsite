package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class AccentureTest01 {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://www.accenture.com/de-de");
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement cookieszulassen = driver.findElement(By.xpath("//button[contains(text(), 'Alle Cookies zulassen')]"));
        cookieszulassen.click();
        Thread.sleep(2000);

        WebElement countrychange = driver.findElement(By.cssSelector(".country-icon"));
        countrychange.click();
        Thread.sleep(2000);

        WebElement countrychangeenglisch = driver.findElement(By.xpath("//a[contains(text(), 'USA (English)')]"));
        countrychangeenglisch.click();
        Thread.sleep(2000);

        WebElement countrychange2 = driver.findElement(By.cssSelector(".country-icon"));
        countrychange2.click();
        Thread.sleep(2000);

        WebElement countrychangegerman = driver.findElement(By.xpath("//a[contains(text(), 'Germany (German)')]"));
        countrychangegerman.click();
        Thread.sleep(2000);

        WebElement anmelden = driver.findElement(By.cssSelector(".signin.ucase"));
        anmelden.click();
        Thread.sleep(2000);

        WebElement loginContainer = driver.findElement(By.cssSelector("#loginContainer"));
        String expected = loginContainer.getText();
        System.out.println(loginContainer.getText());

        String aktuell = "Sign in to your Accenture profile\n" +
                "Sign in using your existing account.";

        Thread.sleep(2000);
        Assert.assertEquals(aktuell,expected);
        System.out.println("Sign Test is Succesfully");

        WebElement accentureLogo = driver.findElement(By.cssSelector(".gh-item.acn-logo>img"));
        accentureLogo.click();
        Thread.sleep(2000);

        WebElement countrychange3 = driver.findElement(By.cssSelector(".country-icon"));
        countrychange3.click();
        Thread.sleep(2000);

        WebElement countrychangegerman2 = driver.findElement(By.xpath("//a[contains(text(), 'Germany (German)')]"));
        countrychangegerman2.click();
        Thread.sleep(2000);

        WebElement InsightsButton = driver.findElement(By.cssSelector(".primary-link-container>*:nth-child(1)"));
        InsightsButton.click();
        Thread.sleep(2000);

        WebElement ServicesButton = driver.findElement(By.cssSelector(".primary-link-container>*:nth-child(2)"));
        ServicesButton.click();
        Thread.sleep(2000);

        WebElement branchenButton = driver.findElement(By.cssSelector(".primary-link-container>*:nth-child(3)"));
        branchenButton.click();
        Thread.sleep(2000);

        WebElement karriereButton = driver.findElement(By.cssSelector(".primary-link-container>*:nth-child(4)"));
        karriereButton.click();
        Thread.sleep(2000);


        WebElement jobsFindenUndBbewerben = driver.findElement(By.xpath("//a[text()='Jobs finden und bewerben']"));
        jobsFindenUndBbewerben.click();
        Thread.sleep(2000);

        WebElement sucheInput = driver.findElement(By.cssSelector("input[id='job-search-hero-bar']"));
        sucheInput.click();
        sucheInput.sendKeys("Junior Software");
        Thread.sleep(2000);

        WebElement sucheButton = driver.findElement(By.cssSelector(".button-container>button"));
        sucheButton.click();
        Thread.sleep(2000);

        WebElement angebotClick = driver.findElement(By.xpath("//h3[text()='Junior Software Engineer (all genders)']"));
        angebotClick.click();
        Thread.sleep(2000);

        WebElement uberAccenture = driver.findElement(By.cssSelector(".primary-link-container>*:nth-child(5)"));
        uberAccenture.click();
        Thread.sleep(2000);

        WebElement uberUns = driver.findElement(By.partialLinkText("Über Accenture"));
        uberUns.click();
        Thread.sleep(2000);

        WebElement scrollen = driver.findElement(By.cssSelector(".cta-scroll.position-1.isactive"));
        scrollen.click();
        Thread.sleep(2000);

        WebElement wirSind = driver.findElement(By.xpath("//h3[text()='Wir sind ein globales Team']"));
        js.executeScript("arguments[0].scrollIntoView();", wirSind);
        Thread.sleep(2000);

        WebElement uberAccenture2 = driver.findElement(By.cssSelector(".primary-link-container>*:nth-child(5)"));
        uberAccenture2.click();
        Thread.sleep(2000);

        WebElement standorte = driver.findElement(By.xpath("//a[text()='Standorte']"));
        standorte.click();
        Thread.sleep(2000);

        WebElement uberAccenture3 = driver.findElement(By.cssSelector(".primary-link-container>*:nth-child(5)"));
        uberAccenture3.click();
        Thread.sleep(2000);

        WebElement uberAccentureDeutschland = driver.findElement(By.xpath("//a[text()='Über Accenture in Deutschland']"));
        uberAccentureDeutschland.click();
        Thread.sleep(2000);

        WebElement werWirSind = driver.findElement(By.xpath("//h2[text()='Wer wir sind ']"));
        js.executeScript("arguments[0].scrollIntoView();", werWirSind);
        Thread.sleep(2000);

        WebElement accentureInZahlen = driver.findElement(By.xpath("//h2[text()='Accenture in Zahlen']"));
        js.executeScript("arguments[0].scrollIntoView();", accentureInZahlen);
        Thread.sleep(2000);

        WebElement ausgezeichneteArbeit = driver.findElement(By.xpath("//h2[text()='Ausgezeichnete Arbeit']"));
        js.executeScript("arguments[0].scrollIntoView();", ausgezeichneteArbeit);
        Thread.sleep(2000);

        WebElement TitelVerteidiger = driver.findElement(By.xpath("//h2[text()='Titelverteidiger']"));
        js.executeScript("arguments[0].scrollIntoView();", TitelVerteidiger);
        Thread.sleep(2000);

        driver.quit();

    }
}
