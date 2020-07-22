package com.company;

public class DeluxeHamburger extends Hamburger{
    public DeluxeHamburger(double price, String name, String rolltype, String meat) {
        super(price, name, rolltype, meat);
    }

    @Override
    public double AddAddition1(String name , double price) {
        return super.AddAddition1("", 0);
    }

    @Override
    public double AddAddition2(String name, double price) {
        return super.AddAddition2("", 0);
    }

    @Override
    public double AddAddition3(String name, double price) {
        return super.AddAddition3("", 0);
    }

    @Override
    public double AddAddition4(String name, double price) {
        return super.AddAddition4("", 0);
    }
    public void addChips(){
        this.fullprice += 5;
        System.out.print("Drinks ");
    }
    public void addDrinks(){
        this.fullprice += 5;
        System.out.print("Chips ");
    }
    @Override
    public void showPrice() {
        super.showPrice();
        addChips();
        addDrinks();
        System.out.print("and full price is " + this.fullprice + ". ");

    }
}
