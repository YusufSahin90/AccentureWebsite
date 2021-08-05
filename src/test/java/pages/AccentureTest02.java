package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.Driver;
import utils.LocatorsAndVariables;


public class AccentureTest02 extends Driver implements LocatorsAndVariables {
    public static void main(String[] args) throws InterruptedException {


        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement cookieszulassen = driver.findElement(cookieszulassenbutton);
        cookieszulassen.click();
        Thread.sleep(2000);

        WebElement countrychange = driver.findElement(countrychangebutton);
        countrychange.click();
        Thread.sleep(2000);

        WebElement countrychangeenglisch = driver.findElement(countrychangeenglischbutton);
        countrychangeenglisch.click();
        Thread.sleep(2000);

        WebElement countrychange2 = driver.findElement(countrychangebutton);
        countrychange2.click();
        Thread.sleep(2000);

        WebElement countrychangegerman = driver.findElement(countrychangegermanbutton);
        countrychangegerman.click();
        Thread.sleep(2000);

        WebElement anmelden = driver.findElement(anmeldenbutton);
        anmelden.click();
        Thread.sleep(2000);

        WebElement loginContainer = driver.findElement(logincontainerschrift);
        String expected = loginContainer.getText();
        System.out.println(loginContainer.getText());

        String aktuell = "Sign in to your Accenture profile\n" +
                "Sign in using your existing account.";

        Thread.sleep(2000);
        Assert.assertEquals(aktuell,expected);
        System.out.println(schriftsuccesfully);

        WebElement accentureLogo = driver.findElement(accenturelogobutton);
        accentureLogo.click();
        Thread.sleep(2000);

        WebElement countrychange3 = driver.findElement(countrychangebutton);
        countrychange3.click();
        Thread.sleep(2000);

        WebElement countrychangegerman2 = driver.findElement(countrychangegermanbutton);
        countrychangegerman2.click();
        Thread.sleep(2000);

        WebElement InsightsButton = driver.findElement(Insightsbutton);
        InsightsButton.click();
        Thread.sleep(2000);

        WebElement ServicesButton = driver.findElement(Servicesbutton);
        ServicesButton.click();
        Thread.sleep(2000);

        WebElement branchenButton = driver.findElement(branchenbutton);
        branchenButton.click();
        Thread.sleep(2000);

        WebElement karriereButton = driver.findElement(karrierebutton);
        karriereButton.click();
        Thread.sleep(2000);

        WebElement jobsFindenUndBbewerben = driver.findElement(jobsfindenundbewerbenbutton);
        jobsFindenUndBbewerben.click();
        Thread.sleep(2000);

        WebElement sucheInput = driver.findElement(sucheinputbutton);
        sucheInput.click();
        sucheInput.sendKeys(sendkeys);
        Thread.sleep(2000);

        WebElement sucheButton = driver.findElement(buttonsuchen);
        sucheButton.click();
        Thread.sleep(2000);

        WebElement angebotClick = driver.findElement(angebotclick);
        angebotClick.click();
        Thread.sleep(2000);

        WebElement uberAccenture = driver.findElement(uberaccenturebutton);
        uberAccenture.click();
        Thread.sleep(2000);

        WebElement uberUns = driver.findElement(uberunsbutton);
        uberUns.click();
        Thread.sleep(2000);

        WebElement scrollen = driver.findElement(scrollenbutton);
        scrollen.click();
        Thread.sleep(2000);

        WebElement wirSind = driver.findElement(wirsindbutton);
        js.executeScript("arguments[0].scrollIntoView();", wirSind);
        Thread.sleep(2000);

        WebElement uberAccenture2 = driver.findElement(uberaccenturebutton);
        uberAccenture2.click();
        Thread.sleep(2000);

        WebElement standorte = driver.findElement(standortebutton);
        standorte.click();
        Thread.sleep(2000);

        WebElement uberAccenture3 = driver.findElement(uberaccenturebutton);
        uberAccenture3.click();
        Thread.sleep(2000);

        WebElement uberAccentureDeutschland = driver.findElement(uberaccenturedeutschlandbutton);
        uberAccentureDeutschland.click();
        Thread.sleep(2000);

        driver.quit();

    }
}
