package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetPuppy {
    WebDriver driver;
    By selectPuppy = By.xpath("//body/div[@id='container']/div[@id='wrapper']/div[@id='content']/div[2]/div[1]/div[4]/form[1]/div[1]/input[1]");
    By page = By.xpath("//a[contains(text(),'2')]");

    public GetPuppy(WebDriver driver){this.driver = driver;}
    public void getDog1(){ driver.findElement(selectPuppy).click();}
    public void pagination(){ driver.findElement(page).click();}
}
