package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.google.api.client.util.Sleeper;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;
import static lippia.web.constants.ClockifyConstants.*;

public class WorkspaceService extends ActionManager {

    public static void clickButtonWorkspace() {
        getElement(BUTTON_WORKSPACE).click();

    }

    public static void clickButtonManage() {
        click(TEXT_MANAGE);
    }

    public static void buttonCreateNewWorkspace() {
        click(TEXT_BUTTON_CREATE_WORKSPACE);
    }
    public static String generateRandomName() {
        int length = new Random().nextInt(10) + 4;
        return new Random().ints(length, 'a', 'z' + 4)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public static void sendNameWorkspaceRandom(){
        String randomName = generateRandomName();
        setInput(INPUT_NAME_WORKSPACE, randomName);

    }
    public static void clickButtonCreate()  {
        click(BUTTON_CREATE);
    }

    public static void selectWorkspace() {
        List<WebElement> workspaceElements = getElements(LIST_WORKSPACE);

        WebElement elementToClick = null;
        for (WebElement element : workspaceElements) {
            if (!element.getText().contains("Activo")) {
                elementToClick = element;
                break;
            }
        }
    }

    public static void clickIconx(){
        waitClickable(ICON_DELETE_WORKSPACE).click();
    }
    public static void deleteWorkspace(){
        selectWorkspace();
        clickIconx();
        setInput(INPUT_DELETE_WORKSPACE,"DELETE");
        click(BUTTON_DELETE_WORKSPACE);
    }
}
