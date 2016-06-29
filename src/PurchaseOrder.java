package keith.lim;

public class PurchaseOrder {

    int poNumber;
    int qty;
    String uom;
    static int counter = 0;

    public int getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(int poNumber) {
        this.poNumber = poNumber;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public PurchaseOrder(int poNumber, int qty, String uom) {
        counter = counter + 1;
        this.poNumber = counter;
        this.qty = qty;
        this.uom = uom;
    }

}