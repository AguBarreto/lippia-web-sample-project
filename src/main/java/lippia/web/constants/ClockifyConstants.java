package lippia.web.constants;

public class ClockifyConstants {
    //Login Constans
    public static final String TEXT_LOGIN = "xpath://a[@data-test-id='login-manual']";
    public static final String INPUT_EMAIL = "xpath://input[@id='email']";
    public static final String INPUT_PASSWORD = "xpath://input[@name='password']";
    public static final String BUTTON_LOGIN = "xpath://button[@type='submit']";
    public static final String INPUT_PLACEHOLDER = "xpath://input[contains(@placeholder,'¿En qué estás trabajando?')]";
    public static final String TEXT_ALERT = "xpath://*[contains(text(),'No, thanks')]";
    public static final String BUTTON_PERFIL = "xpath://span[contains(.,'AF')]";
    public static final String BUTTON_LOGOUT = "xpath://a[@data-cy='logout']";
    public static final String BUTTON_WORKSPACE = "xpath://div[contains(@data-cy,'workspace-dropdown')]";

    public static final String TEXT_MANAGE = "xpath://a[@routerlink='/workspaces']";
    public static final String TEXT_BUTTON_CREATE_WORKSPACE = "xpath://span[contains(.,'espacio de trabajo')]";

    public static final String INPUT_NAME_WORKSPACE = "xpath://input[@formcontrolname='name']";

    public static final String BUTTON_CREATE = "xpath://button[@class='cl-btn cl-btn-primary']";
    public static final String LIST_WORKSPACE = "xpath://workspace-row[contains(.,'(Global')]";
    public static final String ALERT_CONFIRM_CREATE_WORSKSPACE = "xpath:(//div[contains(.,'Se ha creado el espacio de trabajo')])[4]";
    public static final String ICON_DELETE_WORKSPACE = "xpath:(//img[@data-cy='delete-workspace'])[1]";
    public static final String INPUT_DELETE_WORKSPACE = "xpath://input[contains(@formcontrolname,'confirmationModel')]";
    public static final String BUTTON_DELETE_WORKSPACE = "xpath://button[@type='submit'][contains(.,'Eliminar Espacio de trabajo')]";

    public static final String ALERT_CONFIRM_CREATE_PROJECT = "xpath:(//div[contains(.,'Se ha creado el Proyecto')])[2]";
    public static final String ICON_PLUS = "xpath:(//img[@src='assets/ui-icons/plus-blue.svg'])[1]";
    public static final String TEXT_CREATE_NEW_PROJECT = "xpath://span[contains(.,'Crear nuevo proyecto')]";
    public static final String INPUT_NAME_NEW_PROJECT = "xpath://input[@data-cy='project-name']\n";
    public static final String ICON_LIST_PROJECT = "xpath://img[@alt='View Projects']";
    public  static final String ICON_LIST_DESPLEGABLE = "xpath:(//img[@alt='Down arrow symbol'])[3]";
    public  static final String ICON_MENU_HAMBURGUER = "xpath://img[@alt='Edit menu dark theme']";
    public  static final String OPTION_ARCHIVAR = "xpath://a[contains(.,'Archivar')]";
    public  static final String POP_UP_BUTTON_ARCHIVAR = "xpath://button[contains(.,'Archivar')]";
    public  static final String OPTION_DELETE = "xpath://a[contains(.,'Eliminar')]";
    public  static final String CONFIRM_BUTTON_DELETE = "xpath://button[contains(.,'Eliminar')]";
    public  static final String CLOSE_ALERT_DELETE_PROJECT = "xpath://span[contains(.,'×')]";

}

