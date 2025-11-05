package org.baltimorecityschools.miresturaunt;

public class Burger {
    private boolean lettuceSlice;
    private boolean tomatoSlice;
    private final double BASE_PRICE = 5.45;
    private double price;
    private int quantity;


    public Burger() {
        lettuceSlice = false;
        tomatoSlice = false;
        price = BASE_PRICE;
        quantity = 1;

    }

    public Burger(boolean lettuceSlice, boolean tomatoSlice, int quantity) {
        this.lettuceSlice = lettuceSlice;
        this.tomatoSlice = tomatoSlice;
        this.quantity = quantity;
    }
    private void calculatePrice(){


    }
}
