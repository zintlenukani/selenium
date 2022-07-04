package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.ApplyOnlinePage;


public class ApplyOnlineSteps {

    public WebDriver idriver;
    public ApplyOnlinePage ilabpage;

    @Given("a user is on the iLab website")
    public void a_user_is_on_the_i_lab_website() {
        System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers/geckodriver.exe");
        idriver = new FirefoxDriver();
        ilabpage = new ApplyOnlinePage(idriver);
        //Thread.sleep(3000);
        ilabpage.LaunchURL();
    }
    @When("a user clicks on careers")
    public void a_user_clicks_on_careers() {
        ilabpage.click_Careers();
    }
    @Then("a user should see work with iLab text")
    public void a_user_should_see_work_with_i_lab_text() {
       ilabpage.validate_work_with_iLab_text();
    }
    @When("a user clicks on South Africa")
    public void a_user_clicks_on_south_africa() {
        ilabpage.click_country();
    }
    @Then("a user should see Current Openings text")
    public void a_user_should_see_current_openings_text() {
       ilabpage.validate_current_openings();
    }
    @When("a user clicks on Software Test Engineer Johannesburg")
    public void a_user_clicks_on_software_test_engineer_johannesburg() {
        ilabpage.click_job_position();
    }
    @Then("a user should see Software Test Engineer Johannesburg text")
    public void a_user_should_see_software_test_engineer_johannesburg_text() {
        ilabpage.validate_job_title();
    }
    @When("a user click on Apply button")
    public void a_user_click_on_apply_button() {
       ilabpage.click_apply_button();
    }
    @When("a user enters names as {string}")
    public void a_user_enters_names_as(String applicantname) {
      ilabpage.enter_your_name(applicantname);
    }
    @When("a user enter email as {string}")
    public void a_user_enter_email_as(String applicantemail) {
        ilabpage.enter_email_address(applicantemail);
    }
    @When("a user enters phone number")
    public void a_user_enters_phone_as() {
        ilabpage.enter_phone_number();
    }
    @When("a user clicks on Send Application button")
    public void a_user_clicks_on_send_application_button() {
        ilabpage.click_send_application();
    }
    @Then("a user should see You need to upload at least one file.")
    public void a_user_should_see_you_need_to_upload_at_least_one_file() {
        ilabpage.validate_error_message();
        ilabpage.close_driver();
    }

}
