package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalProfilePage extends ProfilePage {

    WebDriver driver ;

    public PersonalProfilePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='mat-toolbar-link-text ng-star-inserted' and contains(text(), 'Personal')]")
    private WebElement toolbarProfilePersonal;

    public void toolbarPersonalProfileISVisible() {
//        waitForElementToBeVisible(toolbarProfilePersonal);
        toolbarProfilePersonal.isDisplayed();
    }


}
