package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;

import static lippia.web.constants.ClockifyConstants.*;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginService extends ActionManager {

    public static void navegarWeb() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickTextLogin() {
        click(TEXT_LOGIN);
    }

    public static void sendLoginCredential() {
        setInput(INPUT_EMAIL, "agustinbarreto2022@hotmail.com");
        setInput(INPUT_PASSWORD,"BBAt&P$M2uS.^.u");
    }
    public static void clickButtonLogin() {
        click(BUTTON_LOGIN);
    }
    public static void clickAlert(){
        click(TEXT_ALERT);
    }

    public static void clickButtonLogout(){
        click(BUTTON_PERFIL);
        click(BUTTON_LOGOUT);
    }

}
