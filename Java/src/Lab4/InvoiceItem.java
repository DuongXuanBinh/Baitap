package Lab4;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double uniPrice){
        this.id=id;
        this.desc=desc;
        this.qty=qty;
        this.unitPrice=uniPrice;
    }
    public String getID(){
        return id;
    }
    public String getDesc(){
        return desc;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
    public double getUnitPrice(double unitPrice){
        this.unitPrice=unitPrice;
        return unitPrice;
    }
    public void setUniPrice(double uniPrice) {
        this.unitPrice = uniPrice;
    }
    public double getTotal(){
        return unitPrice*qty;
    }
    public String toString(){
        return "InvoiceItem[id="+id+",desc="+desc+",qty="+qty+",unitPrice="+unitPrice+"]";
    }

}
