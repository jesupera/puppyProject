package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Payment {
    WebDriver driver;
    By name = By.xpath("//input[@id='order_name']");
    By address = By.xpath("//textarea[@id='order_address']");
    By email = By.xpath("//input[@id='order_email']");
    By placeOrderButton = By.xpath("//select[@id='order_pay_type']");
    By clicktoBtn = By.xpath("//body/div[@id='container']/div[@id='wrapper']/div[@id='content']/div[2]/fieldset[1]/form[1]/div[6]/input[1]");

    public Payment(WebDriver driver){
        this.driver = driver;
    }

    public void setPaymentInfo( String cstmr_name, String cstmr_address, String cstmremail){
        driver.findElement(name).sendKeys(cstmr_name);
        driver.findElement(address).sendKeys(cstmr_address);
        driver.findElement(email).sendKeys(cstmremail);
    }
    public void placeOrder(String paymentMethood) {
        Select placeOrder = new Select(driver.findElement(placeOrderButton));
        placeOrder.selectByVisibleText(paymentMethood);
        driver.findElement(placeOrderButton).click();
    }
    public void confirmOrder(){ driver.findElement(clicktoBtn).click();}
}
