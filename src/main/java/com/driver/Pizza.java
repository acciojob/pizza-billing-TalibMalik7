package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean ischeese;
    private boolean istopping;
    private boolean isbill;
    private int topping;
    private boolean isbag;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            this.topping = 70;
        }
        else{
            this.price = 400;
            this.topping = 120;
        }
        this.ischeese = false;
        this.isbag = false;
        this.istopping  = false;
        this.isbill = false;
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        if (!this.ischeese) {
            this.ischeese = true;
            this.price += 80;
        }
    }

    public void addExtraToppings(){
        // your code goes here

        if(!this.istopping){
            this.istopping = true;
            this.price += this.topping;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(!this.isbag) {
            this.isbag = true;
            this.price += 20;
        }
    }

    public String getBill(){
        // your code goes here
        if(!this.isbill) {
            if (ischeese) this.bill += "Extra Cheese Added: 80\n";
            if (istopping) this.bill += "Extra Toppings Added: " + this.topping + "\n";
            if (isbag) this.bill += "Paperbag Added: 20\n";

            this.bill += "Total Price: " + this.price;
            this.isbill = true;
            return this.bill;
        }
        return "";
    }


}
