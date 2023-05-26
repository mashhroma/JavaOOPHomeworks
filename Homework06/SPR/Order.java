package SPR;

public class Order {

    private static int count;
    private int id;
    protected String clientName;
    protected String product;
    protected int qnt;
    protected int price;

    {
        count++;
        id = count;
    }

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Order %d by %s, product %s, qnt - %d, price - %d", id, clientName, product, qnt, price);
    }

}