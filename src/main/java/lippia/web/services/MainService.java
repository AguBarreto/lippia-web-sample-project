package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainService extends ActionManager {
    public static void wait(int seg) {
        try {
            Thread.sleep(seg * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    public static String getDescription(String DescriptionName) {
        String name;
        LocalDateTime actualDate = LocalDateTime.now();
        switch (DescriptionName) {
            case "new": {
                DescriptionName = "Ticket_" + actualDate.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
                break;
            }
            case "update": {
                DescriptionName = "UpdateTicket_" + actualDate.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
                break;
            }
            case "project": {
                DescriptionName = "Project_" + actualDate.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
                break;
            }
            case "tag": {
                DescriptionName = "Tag_" + actualDate.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
                break;
            }
            default: {
                DescriptionName = "TimeStart_" + actualDate.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
            }
        }
        return DescriptionName;
    }
}
