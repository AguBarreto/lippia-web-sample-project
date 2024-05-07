package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;
import static lippia.web.constants.ClockifyConstants.*;

public class WorkspaceResultService extends ActionManager {

    public static void validateWorkspaceCreation() {
        Assert.assertTrue(getText(ALERT_CONFIRM_CREATE_WORSKSPACE).contains("Se ha creado el espacio de trabajo"));
    }

}
