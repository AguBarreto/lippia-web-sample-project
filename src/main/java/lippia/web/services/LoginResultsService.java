package lippia.web.services;

import com.crowdar.core.actions.ActionManager;

import static lippia.web.constants.ClockifyConstants.*;

import org.testng.Assert;


public class LoginResultsService extends ActionManager {
    public static void validateMainPage() {
        String placeholderText = getAttribute(INPUT_PLACEHOLDER, "placeholder");
        Assert.assertTrue(placeholderText.contains("¿En qué estás trabajando?"));
    }

    public static void validateCloseSession(){
        waitPresence(TEXT_LOGIN);
        Assert.assertTrue(isVisible(TEXT_LOGIN));
    }

}
