package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BasePage {
    WebDriver driver ;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement signInPassword;
    //span[@class='mat-button-wrapper' and contains(text(), 'Jon')]

    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement signInEmail;

    @FindBy(xpath = "//button[@class='mat-button-block mat-raised-button']")
    private WebElement signInButton;

    @FindBy(xpath = "//button[@class='mat-button-link mat-button-sm mat-button mat-button-rounded ng-star-inserted']")
    private WebElement userProfileElement;


    public void enterEmail(String email) {
        waitForElementToBeVisible(signInEmail);
        signInEmail.sendKeys(email);
    }

    public void enterPassword(String password) {
        waitForElementToBeVisible(signInPassword);
        signInPassword.sendKeys(password);
    }

    public void clickOnSignInButton() {
        waitForElementToBeClickable(signInButton);
        signInButton.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void navigateTo(String website) {
        driver.navigate().to(website);
    }

}
