package paypal.pageobject;


import paypal.locators.PayPalLoginLocators;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class PayPalLoginPage{
    Logger logger;
    WebDriver webDriver;


    public PayPalLoginPage(WebDriver driver) {
        this.webDriver = driver;

        logger = Logger.getLogger("OpenMRSLoginPage");
        PropertyConfigurator.configure("log4j.properties");
    }
    @FindBy(css = PayPalLoginLocators.NEXT_BTN)
    private WebElement nextBtn;

    @FindBy(css = PayPalLoginLocators.EMAIL_ID)
    private WebElement emailTextField;

    @FindBy(css = PayPalLoginLocators.PASSWORD)
    private WebElement passwordTextField;

    @FindBy(css = PayPalLoginLocators.LOG_IN_BUTTON)
    private WebElement signInButton;

    @FindBy(xpath = PayPalLoginLocators.ACCOUNT_HOLDER)
    private WebElement accountHolderLink;

    @FindBy(xpath = PayPalLoginLocators.IWard)
    private WebElement iward;



    @FindBy(css = PayPalLoginLocators.APPOINTMENTS)
    private WebElement app;

    @FindBy(xpath = PayPalLoginLocators.APPOINTMENT_SCHEDULE_LINK)
    private WebElement appointmentSchedule;

    @FindBy(xpath = PayPalLoginLocators.MANAGE_SERVICE_TYPE)
    private WebElement manageServiceType;

    @FindBy(xpath = PayPalLoginLocators.APPOINTMENT_TYPE)
    private WebElement appType;

    @FindBy(css = PayPalLoginLocators.EDIT)
    private WebElement edit;

    @FindBy(xpath = PayPalLoginLocators.APP_TYPE_LIST)
    private List<WebElement> appTypeList;

    @FindBy(xpath = PayPalLoginLocators.MST_TYPE)
    private List<WebElement> mstTypeList;

    @FindBy(xpath = PayPalLoginLocators.MST_DURATION)
    private List<WebElement> mstDurationList;

    @FindBy(xpath = PayPalLoginLocators.MANAGE_SERVICE_TYPE_NAME)
    private List<WebElement> manageServiceTypeName;

    public List<WebElement> getListApp() {
        return appTypeList;
    }

    public List<WebElement> getListOfServiceTypes() {
        return manageServiceTypeName;
    }

    public void loginToPayPalAccount(String email, String password) {
        logger.info("Click on Login link!!");
        emailTextField.sendKeys(email);
        logger.info("Enter the user name id");
        nextBtn.click();
        passwordTextField.sendKeys(password);
        logger.info("Enter the password");
        signInButton.click();
        logger.info("Click on submit button");
    }

    public void loginToOpenMRSAccount() {
        logger.info("Click on Login link!!");
        emailTextField.sendKeys("Admin");
        logger.info("Enter the user name id");
        passwordTextField.sendKeys("Admin123");
        logger.info("Enter the password");
        iward.click();
        signInButton.click();
        logger.info("Click on submit button");

        appointmentSchedule.click();
        manageServiceType.click();

    }


    public void navigateManageServiceTypeWindow() {
        appointmentSchedule.click();
        manageServiceType.click();

    }

    public void getListValue(List<WebElement> listInput, String desiredValue) {

        for (WebElement element : listInput) {
            if (element.getText().equals(desiredValue)) {
                logger.info(element.getText().equals(desiredValue));
                logger.info(desiredValue + " present in App Type");
                System.out.println("pass");
            }

        }
    }


    public String getTextData(){

        return accountHolderLink.getText();
    }





}


