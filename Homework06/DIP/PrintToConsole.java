package DIP;

import java.util.List;

public class PrintToConsole implements PrintReport {
    
    public void output(List<ReportItem> items) {
        System.out.println("Output to printer");
        for (ReportItem item : items) {
            System.out.print(item);
        }
    }

}
