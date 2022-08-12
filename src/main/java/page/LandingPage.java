package page;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LandingPage extends BasePage {

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//button[@class='ant-btn ant-btn-text p--0']")
    private WebElement loginBtn;

    @FindBy (xpath="//input[@placeholder='Enter your email']")
    private WebElement email;

    @FindBy (id="password")
    private WebElement password;

    @FindBy (xpath = "//button[@type='submit']")
    private WebElement signInBtn;

    @FindBy (xpath = "//button[@class='ant-btn ant-btn-circle home-page']")
    private WebElement nextBtn;

    public void openLogin(){
        loginBtn.click();
    }

    public  void  enterCredentials(String e, String p) throws InterruptedException {
        email.sendKeys(e);
        Thread.sleep(3000);
        nextBtn.click();
        password.sendKeys(p);
    }

    public void clickSignInBtn(){
        signInBtn.click();
    }
}
