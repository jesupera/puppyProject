package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pageobject.AdopMeButton;
import pageobject.CompleteAdoptionButton;
import pageobject.GetPuppy;
import pageobject.Payment;

public class MainPuppyAdoption {
    WebDriver driver;
    GetPuppy dog;
    AdopMeButton adoptbtn;
    CompleteAdoptionButton additem;
    Payment infoPymt;
    public String name = "Jesus Peralta";
    public String address = "Abasolo 35";
    public String email = "myemail@gmail.com";


    @BeforeSuite(groups = {"A","B"})
    public void beforeSuite(){
        String chromePath = System.getProperty("user.dir") + "/drivers/chromedriver850418387";
        System.setProperty("webdriver.chrome.driver",  chromePath);
        System.out.println("Before Suite: Se agrega Chrome Driver");
    }

    @BeforeTest(groups = {"A","B"})
    public void beforeTest(){
        driver = new ChromeDriver();
    }

    @BeforeClass(groups = {"A","B"})
    public void beforeClass(){
        driver.manage().window().maximize();
        driver.get("http://puppies.herokuapp.com/");
    }

    @BeforeMethod(groups = {"A","B"})
    public void beforeMethod(){}

    @Test(priority = 1, groups = "A")
    public void testCase1() {
        dog = new GetPuppy(driver);
        adoptbtn = new AdopMeButton(driver);
        additem = new CompleteAdoptionButton(driver);
        infoPymt = new Payment(driver);

        dog.getDog1();
        adoptbtn.adoptBtn();
        additem.addToy();
        additem.addCarrier();
        additem.completeAdoptBtn();
        infoPymt.setPaymentInfo(name, address, email);
        infoPymt.placeOrder("Check");
        infoPymt.confirmOrder();
    }

    @Test(priority = 2, groups = "B")
    public void testCase2() {
        dog = new GetPuppy(driver);
        adoptbtn = new AdopMeButton(driver);
        additem = new CompleteAdoptionButton(driver);
        infoPymt = new Payment(driver);

        dog.pagination();
        dog.getDog1();
        adoptbtn.adoptBtn();
        additem.addCollar();
        additem.completeAdoptBtn();
        infoPymt.setPaymentInfo(name, address, email);
        infoPymt.placeOrder("Credit card");
        infoPymt.confirmOrder();
    }

    @AfterMethod(groups = {"A","B"})
    public void afterMethod(){
        System.out.println("Just leave this method to follow the NG test methodology, normally " +
                "the @AfterMethod method will be invoked after the execution of each test method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Just leave this method to follow the NG test methodology, normally " +
                "the @AfterClass method will be executed after all the test methods of a current class have been invoked");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Just leave this method to follow the NG test methodology, normally " +
                "the @AfterTest method is executed after the execution of all the test methods " +
                "of the available classes");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("Just leave this method to follow the NG test methodology, normally " +
                "the @AfterSuite method is executed after the execution of all the test methods in the Suite.");
    }

}
