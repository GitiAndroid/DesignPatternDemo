package com.mike.designpattern.factory;

public class PizzaTest {
	public static void main(String[] args) {
		NYStylePizzaStore nyStylePizzaStore = new NYStylePizzaStore();
		nyStylePizzaStore.orderPizza("cheese");
		
		ChicagoStylePizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();
		chicagoStylePizzaStore.orderPizza("clam");
	}

}
