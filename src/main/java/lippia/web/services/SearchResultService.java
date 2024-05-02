package lippia.web.services;

import com.crowdar.core.actions.ActionManager;

import lippia.web.constants.ClockifyConstants;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SearchResultService extends ActionManager {

    private static WebElement stats() {
        return getElement(ClockifyConstants.STATS_ID);
    }

    public static String getStats() {
        return stats().getText();
    }

    public static void verifyResults(){
        Assert.assertFalse(getStats().isEmpty());
    }
}
