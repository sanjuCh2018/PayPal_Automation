package paypal.stepdef;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import paypal.MasterFile.Base;
import paypal.pageobject.PayPalLoginPage;
import paypal.utilites.BrowserHelper;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class PayPalHomePageSteps extends Base{

    PayPalLoginPage payPalLoginPage;
    BrowserHelper browserHelper;
    Logger logger;
    String title;

    private SoftAssertions assertions = new SoftAssertions();


    @Given("^I enter valid email (.*) and valid password (.*)$")
    public void iEnterValidEmailAndValidPassword(String email, String pw){
        payPalLoginPage.loginToPayPalAccount(email,pw);
    }

    @When("^I find the Pay Pal application web title$")
    public void iFindThePayPalApplicationWebTitle() {
         title = browserHelper.getBrowserTitle(driver);
    }

    @Then("^I match the web title successfully$")
    public void iMatchTheWebTitleSuccessfully() {
        Assert.assertEquals(title,"PayPal: Summary");
    }

    @When("^I find the Pay Pal account holder$")
    public void iFindThePayPalAccountHolder() {
        Assert.assertEquals(payPalLoginPage.getTextData(),"Welcome, Stuti!");
    }

    @Before
    public void startApp() throws Exception {
       run();
        payPalLoginPage = PageFactory.initElements(driver, PayPalLoginPage.class);
    }

    @After
    public void tearDown(Scenario scenario) {
        try{
            if (scenario.isFailed()) {
                // Take a screenshot...
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
            }
        }
        finally {
            driver.quit();
        }
    }



}
