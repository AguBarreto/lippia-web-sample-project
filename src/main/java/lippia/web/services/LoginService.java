package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;


public class LoginService extends ActionManager {

    public static void clickLoginManually() {
        WebActionManager.click(LoginConstants.LOGIN_MANUALLY_BUTTON);
    }

    public static void setEmail(String mail) {
        WebActionManager.setInput(LoginConstants.EMAIL_INPUT,mail);
    }
    public static void setPassword(String pass) {
        WebActionManager.setInput(LoginConstants.PASSWORD_INPUT,pass);
    }

    public static void clickLoginButton() {
        WebActionManager.click(LoginConstants.LOGIN_BUTTON);
    }
}
