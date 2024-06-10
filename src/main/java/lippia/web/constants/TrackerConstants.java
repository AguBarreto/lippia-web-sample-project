package lippia.web.constants;

public class TrackerConstants {
    public static final String NAME_INPUT = "xpath://input[@name=\"autocomplete-input\"]";
    public static final String START_BUTTON = "xpath://button[@class='cl-btn cl-btn-primary cl-d-none cl-d-lg-custom-block']";
    public static final String STOP_BUTTON = "xpath://button[@class='cl-btn cl-btn-danger cl-d-none cl-d-lg-custom-block']";
    public static final String MANAGE_BUTTON = "xpath://img[@class=\"cl-px-2\"]";
    public static final String DISCARD_OPTION = "xpath://a[contains( text(), 'Discard')]";
    public static final String DISCARD_BUTTON = "xpath://button[contains( text(), 'Discard')]";
    public static final String MANUAL_OPTION = "xpath://img[@alt='Add time manually not selected']";
    public static final String TIMER_OPTION = "xpath://img[@alt='Track time using timer selected']";
    public static final String HOUR_START_INPUT = "xpath:(//input[@autocomplete='off'])[2]";
    public static final String HOUR_FINISH_INPUT = "xpath:(//input[@autocomplete='off'])[3]";
    public static final String DATE_INPUT = "xpath:(//input[@autocomplete='off'])[4]";
    public static final String DESCRIPTION_GRID = "xpath:(//input[@type='text'])[2]";
    public static final String HOUR_START_GRID = "xpath:(//input[@autocomplete='off'])[3]";
    public static final String HOUR_FINISH_GRID = "xpath:(//input[@autocomplete='off'])[4]";
    public static final String BILLABLE_GRID = "xpath:(//span[contains(.,'$')])[2]";
    public static final String PROJECT_OPTION = "xpath:(//img[@alt='assets/ui-icons/plus-blue.svg'])[2]";
    public static final String PROJECT_INPUT = "xpath://input[@placeholder='Search project or client']";
    public static final String PROJECT_CREATE = "xpath://a[@class='cl-text-break']";
    public static final String TASK = "xpath://div[contains(text(),'%s')]";
    public static final String TAG_OPTION = "xpath:(//img[@class='tag-icon'])[2]";
    public static final String TAG_INPUT = "xpath://input[@placeholder='Add/Search tags']";
    public static final String TAG_CREATE = "xpath://a[@class='cl-color-blue']";
}
