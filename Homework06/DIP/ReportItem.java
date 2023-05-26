package DIP;

public class ReportItem {

    private static int counter;
    private String description;
    private float amount;

    {
        counter++;
    }

    public ReportItem(String description, float amount) {
        this.description = description;
        this.amount = amount;
    }

    public int getCounter() {
        return counter;
    }
    
    public float getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return String.format("printer %s - %f \n", description, amount);
    }
}
