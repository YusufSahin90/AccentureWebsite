package utils;

import org.openqa.selenium.By;

public interface LocatorsAndVariables {

    String url = "https://www.accenture.com/de-de";
    String schriftsuccesfully = "Sign Test is Succesfully";
    String sendkeys = "Junior Software";


    By cookieszulassenbutton = By.xpath("//button[contains(text(), 'Alle Cookies zulassen')]");
    By countrychangebutton = By.cssSelector(".country-icon");
    By countrychangeenglischbutton = By.xpath("//a[contains(text(), 'USA (English)')]");
    By countrychangegermanbutton = By.xpath("//a[contains(text(), 'Germany (German)')]");
    By anmeldenbutton =  By.cssSelector(".signin.ucase");
    By logincontainerschrift =  By.cssSelector("#loginContainer");
    By accenturelogobutton =  By.cssSelector(".gh-item.acn-logo>img");
    By Insightsbutton =  By.cssSelector(".primary-link-container>*:nth-child(1)");
    By Servicesbutton = By.cssSelector(".primary-link-container>*:nth-child(2)");
    By branchenbutton = By.cssSelector(".primary-link-container>*:nth-child(3)");
    By karrierebutton = By.cssSelector(".primary-link-container>*:nth-child(4)");
    By jobsfindenundbewerbenbutton = By.xpath("//a[text()='Jobs finden und bewerben']");
    By sucheinputbutton = By.cssSelector("input[id='job-search-hero-bar']");
    By buttonsuchen = By.cssSelector(".button-container>button");
    By angebotclick = By.xpath("//h3[text()='Junior Software Engineer (all genders)']");
    By uberaccenturebutton = By.cssSelector(".primary-link-container>*:nth-child(5)");
    By uberunsbutton = By.partialLinkText("Über Accenture");
    By scrollenbutton = By.cssSelector(".cta-scroll.position-1.isactive");
    By wirsindbutton = By.xpath("//h3[text()='Wir sind ein globales Team']");
    By standortebutton = By.xpath("//a[text()='Standorte']");
    By uberaccenturedeutschlandbutton = By.xpath("//a[text()='Über Accenture in Deutschland']");





}
