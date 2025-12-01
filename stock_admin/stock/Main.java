package stock;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myscan=new Scanner(System.in);
        StockItem myobj=new StockItem(null, null, null, 0, 0, 0, 0);
        while (true) {
            try {
                System.out.println("Enter in your item code");
                String itemCode=myscan.nextLine();
                myobj.setItemCode(itemCode);
                break;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Error: "+e.getMessage());
            }
        }
        while (true) {
            try {
                
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        /*while(true){
                try {
            //item code
            System.out.println("Enter in your item code");
            String itemCode=myscan.nextLine();
            myobj.setItemCode(itemCode);
            //item name
            System.out.println("Enter in item name");
            String name=myscan.nextLine();
            myobj.setItemName(name);
            //item category
            System.out.println("Enter in Category");
            String catg=myscan.nextLine();
            myobj.setCategory(catg);
            //quantity
            System.out.println("Enter in Quantity");
            int quant=myscan.nextInt();
            myobj.setQuantity(quant);
            //turnover amount
            System.out.println("Enter in Turnover amount");
            double turn=myscan.nextDouble();
            myobj.setTurnoverAmount(turn);
            //buying price
            System.out.println("Enter in Buying price");
            double buy=myscan.nextDouble();
            myobj.setBuyingPrice(buy);
            //selling price
            System.out.println("Enter in Selling price");
            double sell=myscan.nextDouble();
            myobj.setSellingPrice(sell);


            } catch (IllegalArgumentException e) {
            System.out.println("Error: "+e.getMessage());
            }
        }*/
        
        
        
    }
}
