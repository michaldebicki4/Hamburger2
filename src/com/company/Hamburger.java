package com.company;

public class Hamburger {
    public double price;
    private String name;
    private String rolltype;
    private String meat;

    private String additionName1 = "";
    private double additionPrice1;

    private String additionName2 = "";
    private double additionPrice2;

    private String additionName3 = "";
    private double additionPrice3;

    private String additionName4 = "";
    private double additionPrice4;

    public double fullprice;

    public Hamburger(double price, String name, String rolltype, String meat) {
        this.price = price;
        this.name = name;
        this.rolltype = rolltype;
        this.meat = meat;
        this.fullprice = price;
    }
    public void showBasePrice(){
        System.out.println("Base price is " + this.price);
    }
    public double AddAddition1(String name, double price){
        this.additionName1 = name;
        this.additionPrice1 = price;
        this.fullprice += additionPrice1;
        return this.fullprice;
    }

    public double AddAddition2(String name, double price){
        this.additionName2 = name;
        this.additionPrice2 = price;
        this.fullprice += additionPrice2;
        return this.fullprice;
    }
    public double AddAddition3(String name, double price){
        this.additionName3 = name;
        this.additionPrice3 = price;
        this.fullprice += additionPrice3;
        return this.fullprice;
    }
    public double AddAddition4(String name, double price){
        this.additionName4 = name;
        this.additionPrice4 = price;
        this.fullprice += additionPrice4;
        return this.fullprice;
    }
    public void showPrice(){
        System.out.println();
        System.out.println("You choose " + this.name + " on the roll type " + this.rolltype + " with " +
                "meet type " + this.meat + ". Total price is: " + this.fullprice +"." );
        System.out.print("The additions are: " + this.additionName1 +
                this.additionName2 + this.additionName3 + this.additionName4 );
    }


}
