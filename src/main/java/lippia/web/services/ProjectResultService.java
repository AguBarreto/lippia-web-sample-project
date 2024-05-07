package lippia.web.services;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.getText;
import static com.crowdar.core.actions.ActionManager.waitVisibility;
import static lippia.web.constants.ClockifyConstants.*;

public class ProjectResultService {

    public static void validateProjectCreated(){
        waitVisibility(ALERT_CONFIRM_CREATE_PROJECT);
        Assert.assertTrue(getText(ALERT_CONFIRM_CREATE_PROJECT).contains("Se ha creado el Proyecto"));
    }
}
