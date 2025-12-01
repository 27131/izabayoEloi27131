package stock;

public class StockItem {
    private String itemCode;
    private String itemName;
    private String category;
    private int quantity;
    private double buyingPrice;
    private double sellingPrice;
    private double turnoverAmount;
    //contsructor
    public StockItem(String itemCode, String itemName, String category, int quantity, double buyingPrice,
            double sellingPrice, double turnoverAmount) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.category = category;
        this.quantity = quantity;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.turnoverAmount = turnoverAmount;
    }
    //getters and setters
    public String getItemCode() {
        return itemCode;
    }
    public void setItemCode(String itemCode) {
        if (itemCode==null) {
            throw new IllegalArgumentException("Item code must not be empty");
        }
        this.itemCode = itemCode;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        if (itemName==null) {
            throw new IllegalArgumentException("Item name must not be empty");
        }
        this.itemName = itemName;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        if (category==null) {
            throw new IllegalArgumentException("Item category must not be empty");
        }
        this.category = category;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        if (quantity<=0) {
            throw new IllegalArgumentException("Quntity must be postive");
        }
        this.quantity = quantity;
    }
    public double getBuyingPrice() {
        return buyingPrice;
    }
    public void setBuyingPrice(double buyingPrice) {
        if (buyingPrice<=0) {
            throw new IllegalArgumentException("Buying prica must be greater than 0");
        }
        this.buyingPrice = buyingPrice;
    }
    public double getSellingPrice() {
        return sellingPrice;
    }
    public void setSellingPrice(double sellingPrice) {
        if (sellingPrice<buyingPrice) {
            throw new IllegalArgumentException("Selling price must be greater than Buying price");
        }
        this.sellingPrice = sellingPrice;
    }
    public double getTurnoverAmount() {
        return turnoverAmount;
    }
    public void setTurnoverAmount(double turnoverAmount) {
        if (turnoverAmount<=0) {
            throw new IllegalArgumentException("Turnover amount must be postive");
        }
        this.turnoverAmount = turnoverAmount;
    }

    
}
