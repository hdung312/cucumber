package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy (className = "ant-dropdown-trigger")
    WebElement avatarUser;

    public boolean isAvatarUserDisplayed() throws Throwable{
        return avatarUser.isDisplayed();
    }
}
