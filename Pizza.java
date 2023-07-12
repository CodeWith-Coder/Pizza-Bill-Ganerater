public class Pizza {
    private int price;
    private boolean veg;
    
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backPackPrice = 20;
    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedTakeAway = false;

    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price = price + extraCheesePrice;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price = price + extraToppingsPrice;
    }

    public void takeAway() {
        isOptedTakeAway = true;
        this.price = price + backPackPrice;
    }

    public void getBill() {
        String bill = "";
        System.out.println("Pizza: " + basePizzaPrice);
        if (isExtraCheeseAdded) {
            bill = bill + "Extra Cheese Added: " + extraCheesePrice + "\n";
        }

        if (isExtraToppingsAdded) {
            bill = bill + "Extra Toppings Added: " + extraToppingsPrice + "\n";
        }

        if (isOptedTakeAway) {
            bill = bill + "Take Away: " + backPackPrice + "\n";
        }

        bill = bill + "Bill: " + this.price + "\n";
        System.out.println(bill);
    }
}
