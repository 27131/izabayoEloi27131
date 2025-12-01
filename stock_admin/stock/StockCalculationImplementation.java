package stock;
public class StockCalculationImplementation implements StockCalculations{

    @Override
    public double calculateVat(double turnoverAmount) {
        double vat=(turnoverAmount*18/100);
        System.out.println("Vat= "+vat);
        return vat;
    }

    @Override
    public double markupProfit(double sellingPrice, double buyingPrice) {
        double markup=sellingPrice-buyingPrice;
        System.out.println("Markup profit= "+markup);
        return markup;
    }

    @Override
    public double totalStockValue(int quantity, double sellingPrice) {
        double value=quantity*sellingPrice;
        System.out.println("Total Stock value= "+value);
        return value;
    }

    @Override
    public double restockingFee(double buyingPrice) {
        double restock=buyingPrice*5/100;
        System.out.println("Restoking value= "+restock);
        return restock;
    }



    
}
