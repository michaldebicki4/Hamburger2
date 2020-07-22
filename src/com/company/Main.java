package com.company;

public class Main {

    public static void main(String[] args) {
	Hamburger hamburgerZwykly = new Hamburger(15,"Cheeseburger","WhiteRoll","Beef");
	hamburgerZwykly.AddAddition1("Pomidorek ",5);
	hamburgerZwykly.showBasePrice();
	hamburgerZwykly.showPrice();

	Hamburger hamburgerZwykly2 = new Hamburger(15, "Hamburger", "WhiteRoll", "Pork");
	hamburgerZwykly2.AddAddition1("Pomidorek ", 5);
	hamburgerZwykly2.AddAddition2("Sałata ",3);
	hamburgerZwykly2.AddAddition3("Ziemniaczek ", 4);
	hamburgerZwykly2.AddAddition4("Ketchup ",1);
	hamburgerZwykly2.showPrice();

	HealthyHamburger hamburgerZdrowy = new HealthyHamburger(20,"VegeBurger","NotMeat");
	hamburgerZdrowy.AddAddition1("Pomidorek ",5);
	hamburgerZdrowy.AddAddition5("Ogórek ",4);
	hamburgerZdrowy.showPrice();
	hamburgerZdrowy.showBasePrice();

	DeluxeHamburger hamburgerDelux = new DeluxeHamburger(15,"Drwalowy","WhiteRoll","Human");
	hamburgerDelux.AddAddition1("szynka", 5);
	hamburgerDelux.showPrice();
	hamburgerDelux.showBasePrice();


    }
}
