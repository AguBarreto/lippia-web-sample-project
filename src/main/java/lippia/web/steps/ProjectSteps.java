package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static lippia.web.services.ProjectResultService.validateProjectCreated;
import static lippia.web.services.ProjectService.*;

public class ProjectSteps extends PageSteps {

    @And("click on the plus icon")
    public void clickOnTheButtonProject(){
        clickOnTheIconPlus();
    }

    @And("click on Create New Project")
    public void haceClickCreateNewProject() {
        clickOptionCreateNewProject();
    }

    @When("entering the name of the new project")
    public void introduceNameNewProject() {
        enteredNameProject();
    }

    @And("click on the Create button")
    public void haceClickEnElButtonCrear() {
    }

    @Then("the created project is validated with a message")
    public void seValidaElProyectoCreadoConElMensaje() {
        validateProjectCreated();
        deleteProject();
    }
}
