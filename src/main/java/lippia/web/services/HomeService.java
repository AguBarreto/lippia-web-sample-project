package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.ClockifyConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class HomeService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void enterSearchCriteria(String text) {
        setInput(ClockifyConstants.INPUT_SEARCH_XPATH, text);
    }

    public static void clickSearchButton() {
        click(ClockifyConstants.SEARCH_BUTTON_NAME);
    }
}
