package com.company;

public class HealthyHamburger extends Hamburger{
    private String additionName5 = "";
    private double additionPrice5;

    private String additionName6 = "";
    private double additionPrice6;

    public HealthyHamburger(double price, String name, String meat) {
        super(price, name, "BrownRyeBread", meat);
    }
    public double AddAddition5(String name, double price){
        this.additionName5 = name;
        this.additionPrice5 = price;
        this.fullprice += additionPrice5;
        return this.fullprice;
    }
    public double AddAddition6(String name, double price){
        this.additionName5 = name;
        this.additionPrice5 = price;
        this.fullprice += additionPrice5;
        return this.fullprice;
    }

    @Override
    public void showPrice() {
        super.showPrice();
        System.out.println(additionName5 + additionName6);
    }
}
