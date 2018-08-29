package e2e.locators;

public class OpenMRSLoginLocators {

    //By ID#email1
    public static final String LOGIN_LINK = "#ul-btn";
    public static final String EMAIL_ID = "#email";
    public static final String NEXT_BTN = "#btnNext";
    public static final String PASSWORD = "#password";
    public static final String LOG_IN_BUTTON = "#btnLogin";
    public static final String ACCOUNT_HOLDER = "//h1[contains(@class, 'welcomeMessage')]";



    public static final String IWard = "//li[@id=\"Inpatient Ward\"]";
    public static final String APPOINTMENTS = "li:nth-child(6) > a";
    public static final String EDIT = "#appointmentschedulingui-edit-Gynecology";

    //By XPATH
    public static final String APP_TYPE_LIST = "//table[@id='appointmentTypesTable']/tbody/tr/td/a";
    public static final String APPOINTMENT_TYPE = "//a[contains(text(),'Appointment Types')]";
    public static final String APPOINTMENT_SCHEDULE_LINK = "//a[5]/i";
    public static final String MST_TYPE = "//*[@id=\"appointmentTypesTable\"]/tbody/tr/td[1]";
    public static final String MST_DURATION = "//*[@id=\"appointmentTypesTable\"]/tbody/tr/td[2]";
    public static final String MANAGE_SERVICE_TYPE = "//div[3]/div/a";
    public static final String MANAGE_SERVICE_TYPE_NAME = "//table[@id='appointmentTypesTable']/tbody/tr/td[1]";
}
