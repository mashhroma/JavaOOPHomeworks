package SPR;

import java.io.FileWriter;
import java.io.IOException;

public class SaveOrderToXML implements SaveOrders {

    public void saveOrder(Order order) {
        String fileName = "SPR/Files/orders.xml";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("<order>\n");
            writer.write("  <id>" + order.getId() + "</id>\n");
            writer.write("  <clientName>" + order.getClientName() + "</clientName>\n");
            writer.write("  <product>" + order.getProduct() + "</product>\n");
            writer.write("  <qnt>" + order.getQnt() + "</qnt>\n");
            writer.write("  <price>" + order.getPrice() + "</price>\n");
            writer.write("</order>\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
