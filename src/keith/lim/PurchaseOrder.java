package keith.lim;

public class PurchaseOrder {
Item item1 = new Item();
    int poNumber;
    int qty;
    int uom;

    public int getTotalPOAmount() {
        return item1*qty;
    }
}
