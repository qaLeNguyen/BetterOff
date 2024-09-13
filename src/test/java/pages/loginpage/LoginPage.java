package pages.loginpage;

import common.BuiltInAction;
import object.common_object.CommonLocators;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginPage extends BuiltInAction {
    private static final Logger logger = LogManager.getLogger(LoginPage.class);

    public LoginPage() {
        super();
    }

    public void inputUsername(String username) {

        input(CommonLocators.USER_ID_FIELD.getBy(), username);

    }

    public void inputPassword(String password) {

        input(CommonLocators.PASSWORD_FIELD.getBy(), password);

    }

    public void clickLogOnButton() {

        click(CommonLocators.LOGIN_BUTTON.getBy());

    }

    public void loginSESWeb(String username, String password) {
        inputUsername(username);
        inputPassword(password);
        clickLogOnButton();
    }

}
