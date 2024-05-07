package lippia.web.services;

import com.crowdar.core.actions.ActionManager;

import static lippia.web.constants.ClockifyConstants.*;
import static lippia.web.services.WorkspaceService.generateRandomName;

public class ProjectService extends ActionManager {

    public static void clickOnTheIconPlus(){
        click(ICON_PLUS);
    }
    public static void clickOptionCreateNewProject(){
        click(TEXT_CREATE_NEW_PROJECT);
    }
    public static void enteredNameProject(){
        String randomName = generateRandomName();
        setInput(INPUT_NAME_NEW_PROJECT, randomName);
    }

    public static void clickiconProject(){
        click(ICON_LIST_PROJECT);
    }

    public static void selectDesplegableList(){
        click(ICON_LIST_DESPLEGABLE);
    }

    public static void closeAlert(){
        waitClickable(CLOSE_ALERT_DELETE_PROJECT).click();

    }
    public static void clickIconMenuHamburguer(){
        isEnabled(ICON_MENU_HAMBURGUER);
        click(ICON_MENU_HAMBURGUER);
    }
    public static void clickArchiveProject(){
        click(OPTION_ARCHIVAR);
        click(POP_UP_BUTTON_ARCHIVAR);
        closeAlert();
    }

    public static void clickOptionDelete(){
        click(OPTION_DELETE);
        waitClickable(CONFIRM_BUTTON_DELETE);
        click(CONFIRM_BUTTON_DELETE);
    }

    public static void deleteProject(){
        clickiconProject();
        clickIconMenuHamburguer();
        clickArchiveProject();

        clickIconMenuHamburguer();
        clickOptionDelete();
    }

}
