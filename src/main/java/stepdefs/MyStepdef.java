package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.HomePage;
import page.LandingPage;

import java.io.File;
import java.io.IOException;

public class MyStepdef {
    WebDriver driver;

    @Given("the user is on landing page")
    public void theUserIsOnLandingPage() throws Throwable{
        System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://consumer-dev.komi.io/");
        driver.manage().window().maximize();
    }

    @When("user chooses to sign in")
    public void userChoosesToSignIn() throws Throwable{
        new LandingPage(driver).openLogin();
    }

    @And("user enters the credentials")
    public void userEntersTheCredentials() throws InterruptedException {
        new LandingPage(driver).enterCredentials("d3@mailinator.com","Komi123Komi123!");
    }

    @And("user clicks sign in button")
    public void userClicksSignInButton() throws Throwable{
        new LandingPage(driver).clickSignInBtn();
    }

    @Then("user should be logged in to the website")
    public void userShouldBeLoggedInToTheWebsite() throws Throwable{
        Assert.assertTrue(new HomePage(driver).isAvatarUserDisplayed());
    }

    @And("user enters the email as <email>")
    public void userEntersTheEmailAsEmail() {
    }

    @And("user enters the credentials as email {string} and password {string}")
    public void userEntersTheCredentialsAsEmailAndPassword(String e, String pwd) throws InterruptedException {
        new LandingPage(driver).enterCredentials(e,pwd);
    }

    @After
    public void AfterScenario(Scenario scenario) throws IOException {
        if(scenario.isFailed()){
            File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File("src/main/java/screenshot/fail1.png"));
        }
        driver.quit();
    }

}
