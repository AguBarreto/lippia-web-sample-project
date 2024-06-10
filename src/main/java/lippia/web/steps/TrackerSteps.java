package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.MainService;
import lippia.web.services.TrackerService;

public class TrackerSteps extends PageSteps {
    public String description;
    public String descProject;
    public String descTag;
    @When("The user enters {} the name of the time entry description with the day and time")
    public void theClientInputTimeEntryDescription(String tipo) {
        description = MainService.getDescription(tipo);
        TrackerService.setTimeEntryDescription(description);
    }

    @When("The user click on Timer option")
    public void theClientClickOnTempOption() {
        TrackerService.clickOnTempOption();
    }

    @When("The user clicks on the Manual option")
    public void theClientClickOnManualOption() {
        TrackerService.clickOnManualOption();
    }

    @When("The user inputs Start Time {}, Finish Time {}, and Day {}")
    public void theClientInputTimeStartTimeFinishDay(String timeStart, String timeFinish, String day) {
        TrackerService.setTimeEntry(timeStart, timeFinish, day);
    }

    @When("The user clicks on init button")
    public void theClientClicksOnInitButton() {
        TrackerService.clickOnInitButton();
    }

    @When("The user clicks on stop button")
    public void theClientClickOnStopButton() {
        TrackerService.clickOnStopButton();
    }
    @Then("The user verify {} exist time entry")
    public void theClientVerifyExistTimeEntry(String SiNo) {
        TrackerService.testCreatedTimeEntry(SiNo, description);
    }

    @When("The user clicks on the 'manage time entry' button")
    public void theClientClickOnManageButton() {
        TrackerService.clickManageButton();
    }
    @When("The user clicks on Discard option")
    public void theClientClickOnDiscardOption() {
        TrackerService.clickDiscardOption();
    }

    @Given("The user add a new tracker entry")
    public void theClientAddANewTrackerEntry() {
        TrackerService.clickOnTempOption();
        description = MainService.getDescription("new");
        TrackerService.setTimeEntryDescription(description);
        TrackerService.clickOnInitButton();
        TrackerService.clickOnStopButton();
    }

    @When("The user update Time-Entry-Description name")
    public void theClientUpdateDescriptionName() {
        description = MainService.getDescription("update");
        TrackerService.updateTimeEntryDescription(description);
    }

    @When("The user update input Time Start = {}, Time Finish = {}")
    public void theClientInputNewTimeStartTimeFinish$(String timeStart, String timeFinish) {
        TrackerService.updateDataEntry(timeStart, timeFinish);
    }

    @When("The user select the project option, enter a new project and associate")
    public void theClientSelectTheProjectOptionEnterANewProjectAndAssociate() {
        TrackerService.clickOnProjectOption();
        descProject = MainService.getDescription("project");
        TrackerService.setNewProject(descProject);
        TrackerService.clickOnAsociateProject();
    }

    @When("The user select the tag option, enter a new tag and associate")
    public void theClientSelectTheTagOptionEnterANewTagAndAssociate() {
        TrackerService.clickOnTagOption();
        descTag = MainService.getDescription("tag");
        TrackerService.setNewTag(descTag);
        TrackerService.clickOnAsociateTag();
    }

    @When("The user update billable")
    public void theClientUpdateBillable() {
        TrackerService.setBillable();
    }

    @When("The user clicks on Discard button")
    public void theUserClicksOnDiscardButton() {
        TrackerService.clickDiscardButton();
    }
}
