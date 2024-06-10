package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LandingConstants;
import lippia.web.constants.TrackerConstants;
import org.openqa.selenium.Point;
import org.testng.Assert;



public class TrackerService extends ActionManager {
    public static void setTimeEntryDescription(String name) {
        WebActionManager.waitPresence(TrackerConstants.NAME_INPUT);
        WebActionManager.getElement(TrackerConstants.NAME_INPUT).click();
        WebActionManager.setInput(TrackerConstants.NAME_INPUT,name);
    }

    public static void clickOnTempOption() {
        MainService.wait(3);
        WebActionManager.waitPresence(TrackerConstants.TIMER_OPTION);
        WebActionManager.getElement(TrackerConstants.TIMER_OPTION).click();
    }

    public static void clickOnManualOption() {
        MainService.wait(3);
        WebActionManager.waitPresence(TrackerConstants.MANUAL_OPTION);
        WebActionManager.getElement(TrackerConstants.MANUAL_OPTION).click();
    }

    public static void setTimeEntry(String timeIn, String timeOut, String day) {
        MainService.wait(3);
        WebActionManager.getElement(TrackerConstants.HOUR_START_INPUT).click();
        WebActionManager.setInput(TrackerConstants.HOUR_START_INPUT, timeIn);
        WebActionManager.getElement(TrackerConstants.HOUR_FINISH_INPUT).click();
        WebActionManager.setInput(TrackerConstants.HOUR_FINISH_INPUT, timeOut);
        WebActionManager.getElement(TrackerConstants.DATE_INPUT).click();
        WebActionManager.setInput(TrackerConstants.DATE_INPUT, day);
    }

    public static void clickOnInitButton() {
        MainService.wait(3);
        WebActionManager.waitPresence(TrackerConstants.START_BUTTON);
        WebActionManager.getElement(TrackerConstants.START_BUTTON).click();
    }

    public static void clickOnStopButton() {
        MainService.wait(5);
        WebActionManager.waitPresence(TrackerConstants.STOP_BUTTON);
        WebActionManager.getElement(TrackerConstants.STOP_BUTTON).click();
    }
    public static void testCreatedTimeEntry(String exist, String descTimeEntry) {
        MainService.wait(5);
        boolean option = false;
        try {
            String TASK = String.format(TrackerConstants.TASK, descTimeEntry);
            Point Location = WebActionManager.getElement(TASK).getLocation();
            option = true;
            System.out.println("Task found: " + descTimeEntry + " in the grid");
        } catch (Exception e) {
            System.out.println("Task not found: " + e.getMessage());
        }
        switch (exist) {
            case "TRUE": {
                Assert.assertTrue(option);
                System.out.println("assertTrue: " + option);
                break;
            }
            case "FALSE": {
                Assert.assertFalse(option);
                System.out.println("assertFalse: " + option);
                break;
            }
            default: {
                option = false;
                Assert.assertTrue(option);
                break;
            }
        }
    }

    public static void clickManageButton() {
        MainService.wait(5);
        WebActionManager.getElement(TrackerConstants.MANAGE_BUTTON).click();
    }

    public static void clickDiscardOption() {
        MainService.wait(5);
        WebActionManager.waitPresence(TrackerConstants.DISCARD_OPTION);
        WebActionManager.getElement(TrackerConstants.DISCARD_OPTION).click();
    }

    public static void clickDiscardButton() {
        MainService.wait(5);
        WebActionManager.waitPresence(TrackerConstants.DISCARD_BUTTON);
        WebActionManager.getElement(TrackerConstants.DISCARD_BUTTON).click();
    }

    public static void updateTimeEntryDescription(String description) {
        MainService.wait(3);
        WebActionManager.waitPresence(TrackerConstants.DESCRIPTION_GRID);
        WebActionManager.getElement(TrackerConstants.DESCRIPTION_GRID).clear();
        WebActionManager.getElement(TrackerConstants.DESCRIPTION_GRID).click();
        WebActionManager.setInput(TrackerConstants.DESCRIPTION_GRID,description);
        WebActionManager.getElement(LandingConstants.TRACKER_BUTTON).click();
    }

    public static void clickOnProjectOption() {
        MainService.wait(3);
        WebActionManager.getElement(TrackerConstants.PROJECT_OPTION).click();
    }

    public static void setNewProject(String nameProject) {
        MainService.wait(3);
        WebActionManager.getElement(TrackerConstants.PROJECT_INPUT).click();
        WebActionManager.setInput(TrackerConstants.PROJECT_INPUT,nameProject);
    }

    public static void clickOnAsociateProject() {
        MainService.wait(3);
        WebActionManager.getElement(TrackerConstants.PROJECT_CREATE).click();
    }

    public static void clickOnTagOption() {
        MainService.wait(3);
        WebActionManager.getElement(TrackerConstants.TAG_OPTION).click();
    }

    public static void setNewTag(String nameTag) {
        MainService.wait(3);
        WebActionManager.getElement(TrackerConstants.TAG_INPUT).click();
        WebActionManager.setInput(TrackerConstants.TAG_INPUT,nameTag);
    }

    public static void clickOnAsociateTag() {
        MainService.wait(3);
        WebActionManager.getElement(TrackerConstants.TAG_CREATE).click();
    }

    public static void setBillable() {
        MainService.wait(3);
        WebActionManager.getElement(TrackerConstants.BILLABLE_GRID).click();
    }

    public static void updateDataEntry(String timeIn, String timeOut) {
        WebActionManager.getElement(TrackerConstants.HOUR_START_GRID).click();
        WebActionManager.setInput(TrackerConstants.HOUR_START_GRID, timeIn);
        WebActionManager.getElement(TrackerConstants.HOUR_FINISH_GRID).click();
        WebActionManager.setInput(TrackerConstants.HOUR_FINISH_GRID, timeOut);
        WebActionManager.getElement(LandingConstants.TRACKER_BUTTON).click();
    }
}
