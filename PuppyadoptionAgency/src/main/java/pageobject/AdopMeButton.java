package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdopMeButton {
    WebDriver driver;
    By adopt = By.xpath("//body/div[@id='container']/div[@id='wrapper']/div[@id='content']/div[2]/div[1]/form[1]/div[1]/input[1]");

    public AdopMeButton(WebDriver driver){this.driver = driver;}

    public void adoptBtn(){ driver.findElement(adopt).click();}
}
