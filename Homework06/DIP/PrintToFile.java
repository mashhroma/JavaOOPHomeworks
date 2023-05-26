package DIP;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PrintToFile implements PrintReport {

    public void output(List<ReportItem> items) {
        File fileName = new File("DIP/Files/report.json");
        try (FileWriter writer = new FileWriter(fileName, true)) {
            for (ReportItem reportItem : items) {
                writer.write("{\n");
                writer.write("\"description\":\"" + reportItem.getDescription() + "\",\n");
                writer.write("\"clientName\":\"" + reportItem.getAmount() + "\",\n");
                writer.write("}\n");
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
