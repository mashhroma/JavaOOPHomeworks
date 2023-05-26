package DIP;

import java.util.ArrayList;

public class Report {

    private ArrayList<ReportItem> items;	// Отчетные данные

    // расчет отчетных данных
    public void calculate(GetReport getReport){
        items = getReport.reportFromConsole();
    }

    public void output(PrintReport printReport){
        printReport.output(items);
    }

}
