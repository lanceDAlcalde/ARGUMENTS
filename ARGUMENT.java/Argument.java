
public class Argument {
public static void main(String[] args) {

    int x;
    //totalPriceOrder
    int totalOrder = 0;
    //softdrinks Price
    int coke = 15;
    //sizes Price
    int smallPrice = 10;
    int mediumPrice = 20;
    int largePrice = 30;
    //addOnsPrice
    int marshmallowPrice = 13;
    int cheesePrice = 15;
    int chocolatePrice = 18;
    int None = 0;
    //quantityPrice
    int qty1 = 1;
    int qty2 = 2;
    int qty3 = 3;
    //sizesName
    String small = "Small";
    String medium = "Medium";
    String large = "Large";
    //addOnsName
    String marshmallow = "Marshmallow";
    String cheese = "Cheese";
    String chocolate = "Chocolate";
    String none = "None";
    //quantityName
    String quantity2 = "1";
    String quantity4 = "2";
    String quantity6 = "6";
    String quantityNone = "None";

    //NameAbsorber
    String sizes = "";
    String adds = "";
    String qty = "";

    System.out.println("Softdrinks: | Coke-15 | Royal-15 | Sprite-15 | Rc-15 | ");
    System.out.println("Size: | 1. Small-10p | 2. Medium-20p | 3. Large-30p | ");
    System.out.println("AddOns: | 1. Marshmallow-13 | 2. Chesse-15 | 3. Chocolate-18 | 4. None |");
    System.out.println("Quantity: | 1. 1 | 2. 2 | 3. 3 | ");
    System.out.println("------------------------------------------------------------------------");
    System.out.print("Enter your Softdrinks: "); String softdrinks = (args[0]);

    switch(softdrinks) {

        case "Coke":
            totalOrder = coke;
            System.out.print("Size: "); int size = Integer.parseInt(args[1]);
            if (size == 1) { sizes = small; totalOrder += smallPrice; }
            else if (size == 2) { sizes = medium; totalOrder += mediumPrice; }
            else if (size == 3) { sizes = large; totalOrder += largePrice; }
            else { System.out.println("Invalid Input");
            }
            System.out.print("AddOns: "); int addOns = Integer.parseInt(args[2]);
            if (addOns == 1) { adds = marshmallow; totalOrder += marshmallowPrice; }
            else if (addOns == 2) { adds = cheese; totalOrder += cheesePrice; }
            else if (addOns == 3) { adds = chocolate; totalOrder += chocolatePrice; }
            else if (addOns == 4) { adds = none; totalOrder += None; }
            else { System.out.println("Invalid Input");
            }
            System.out.print("Quantity: "); int quantity = Integer.parseInt(args[3]);
            if (quantity == 1) { qty = quantity2; totalOrder *= qty1; }
            else if (quantity == 2) { qty = quantity4; totalOrder *= qty2;}
            else if (quantity == 3) { qty = quantity6; totalOrder *= qty3;}
            else { qty = quantityNone; totalOrder += None;
            }
            for (x=1; x <= 5; x++) { System.out.println(". "); }  
            System.out.println("Softdrinks: " + softdrinks);
            System.out.println("Size: " + sizes);
            System.out.println("AddOns: " + adds);
            System.out.println("Quantity: " + qty);
            System.out.println("Total: " + totalOrder);
            break;


    }

  }
}

