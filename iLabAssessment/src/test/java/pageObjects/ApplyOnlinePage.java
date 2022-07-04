package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplyOnlinePage {
    public WebDriver driver;
    public RandomNumber randNum = new RandomNumber();

    public ApplyOnlinePage(WebDriver xdriver){
        driver = xdriver;
        PageFactory.initElements(xdriver, this);
    }
    @FindBy(xpath = "//a [contains(text(), 'CAREERS')][1]")
    WebElement careers_element;

    @FindBy(xpath = "//a[contains(text(), 'South Africa')][1]")
    WebElement sa_element;

    @FindBy(xpath = "//a[contains(text(), 'Software Test Engineer - Johannesburg')]")
    WebElement position_element;

    @FindBy(xpath = "//a[@data-wpjb-form='wpjb-form-job-apply']")
    WebElement apply_button;

    @FindBy(id = "applicant_name")
    WebElement application_name;

    @FindBy(id="email")
    WebElement email_element;

    @FindBy(xpath = "//p[contains(text(), 'WORK WITH')]")
    WebElement work_with_us_element;

    @FindBy(xpath = "//h3[contains(text(),'CURRENT OPENINGS')]")
    WebElement current_openings_element;

    @FindBy(xpath = "//h1[contains(text(), 'Software Test Engineer – Johannesburg')]")
    WebElement job_title_element;

    @FindBy(xpath = "//ul[@class=\"wpjb-errors\"]")
    WebElement error_message;

    @FindBy(id = "wpjb_submit")
    WebElement send_application;

    @FindBy(id = "phone")
    WebElement phone_element;

    public void LaunchURL(){
        String iLabURL = "https://www.ilabquality.com/";
        driver.get(iLabURL);
        driver.manage().window().maximize();
    }

    public void click_Careers(){
        careers_element.click();
    }
    public void click_country(){
        sa_element.click();
    }
    public void click_job_position(){
        position_element.click();
    }
    public void click_apply_button(){
        apply_button.click();
    }
    public void enter_your_name(String names){
        application_name.clear();
        application_name.sendKeys(names);
    }
    public void enter_email_address(String emailaddress){
        email_element.clear();
        email_element.sendKeys(emailaddress);
    }
    public void validate_work_with_iLab_text(){
        work_with_us_element.isDisplayed();
    }
    public void validate_current_openings(){
        current_openings_element.isDisplayed();
    }
    public void validate_job_title(){
        job_title_element.isDisplayed();
    }
    public void validate_error_message(){
        error_message.isDisplayed();
    }
    public void click_send_application(){
        send_application.click();
    }
    public void enter_phone_number(){
        phone_element.sendKeys(randNum.randoNumber());

    }
    public void close_driver(){
        driver.close();
    }
}
