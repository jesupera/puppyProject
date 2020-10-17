package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompleteAdoptionButton {
    WebDriver driver;
    By toy = By.xpath("//input[@id='toy']");
    By carrier = By.xpath("//input[@id='carrier']");
    By completeAdopt = By.xpath("//body/div[@id='container']/div[@id='wrapper']/div[@id='content']/div[2]/form[1]/div[1]/input[1]");
    By collar = By.xpath("//input[@id='collar']");

    public CompleteAdoptionButton(WebDriver driver){this.driver = driver;}
    public void addToy(){ driver.findElement(toy).click();}
    public void addCarrier(){ driver.findElement(carrier).click();}
    public void completeAdoptBtn(){ driver.findElement(completeAdopt).click();}
    public void addCollar(){driver.findElement(collar).click();}
}
