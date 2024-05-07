package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static lippia.web.services.ProjectResultService.validateProjectCreated;
import static lippia.web.services.ProjectService.*;

public class ProjectSteps extends PageSteps {

    @And("hace click en el icono mas")
    public void clickOnTheButtonProject(){
        clickOnTheIconPlus();

    }

    @And("hace click create new project")
    public void haceClickCreateNewProject() {
        clickOptionCreateNewProject();
    }

    @When("introduce name new project")
    public void introduceNameNewProject() {
        enteredNameProject();
    }

    @Then("se valida el proyecto creado con el mensaje")
    public void seValidaElProyectoCreadoConElMensaje() {
        validateProjectCreated();
        deleteProject();
    }
}
