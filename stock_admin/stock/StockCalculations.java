package stock;
interface StockCalculations{
    double calculateVat(double turnoverAmount);
    double markupProfit(double sellingPrice,double buyingPrice);
    double totalStockValue(int quantity,double sellingPrice);
    double restockingFee(double buyingPrice);
}