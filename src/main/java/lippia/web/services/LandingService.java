package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LandingConstants;


public class LandingService extends ActionManager {

    public static void clickTrackerButton() {
        WebActionManager.waitPresence(LandingConstants.TRACKER_BUTTON);
        WebActionManager.getElement(LandingConstants.TRACKER_BUTTON).click();
    }
}
