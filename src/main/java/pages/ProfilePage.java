package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends BasePage {
    WebDriver driver ;

    public ProfilePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='profile-header' and contains(text(), 'PERSONAL')]/following-sibling::div/div/div")
    private WebElement userPersonalProfileButton;

    @FindBy(xpath = "//div[@class='profile-header' and contains(text(), 'BUSINESS')]/following-sibling::div/div/div")
    private WebElement userBusinessProfileButton;

    @FindBy(xpath = "//button[@class='mat-default dashboard-btn mat-button']")
    private WebElement menuDropDown;

    @FindBy(xpath = "//div[@class='business-menu-item' and contains(text(), 'Ausloggen')]")
    private WebElement logoutButton;

    public void clickOnUserPersonalProfileButton() {
        waitForElementToBeClickable(userPersonalProfileButton);
        userPersonalProfileButton.click();
    }

    public void userPersonalProfileButtonIsVisible() {
        userPersonalProfileButton.isDisplayed();
    }

    public void clickOnUserBusinessProfileButton() {
        waitForElementToBeClickable(userPersonalProfileButton);
        userPersonalProfileButton.click();
    }

    public void userBusinessProfileButtonIsVisible() {
        userBusinessProfileButton.isDisplayed();
    }

    public void clickOnMenuButton() {
        waitForElementToBeClickable(menuDropDown);
        menuDropDown.click();
    }

    public void clickOnLogoutButton() {
        waitForElementToBeClickable(logoutButton);
        logoutButton.click();
    }



}
