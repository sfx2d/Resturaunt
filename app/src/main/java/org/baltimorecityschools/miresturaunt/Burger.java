package org.baltimorecityschools.miresturaunt;

import androidx.annotation.NonNull;

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
        calculatePrice();

    }

    public Burger(boolean lettuceSlice, boolean tomatoSlice, int quantity) {
        this.lettuceSlice = lettuceSlice;
        this.tomatoSlice = tomatoSlice;
        this.quantity = quantity;
        calculatePrice();
    }

    public void setLettuceSlice(boolean lettuceSlice) {
        this.lettuceSlice = lettuceSlice;
        calculatePrice();
    }

    public void setTomatoSlice(boolean tomatoSlice) {
        this.tomatoSlice = tomatoSlice;
        calculatePrice();
    }



    public void setQuantity(int quantity) {
        this.quantity = quantity;
        calculatePrice();
    }

    public boolean isLettuceSlice() {
        return lettuceSlice;
    }

    public boolean isTomatoSlice() {
        return tomatoSlice;
    }

    public double getBASE_PRICE() {
        return BASE_PRICE;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    private void calculatePrice(){
        price = BASE_PRICE;
        if (lettuceSlice){
            price += 0.90;
        }
        if (tomatoSlice){
            price += 0.85;
        }
        price = price * quantity;

    }

    @NonNull
    @Override
    public String toString() {
        return "Your total is " + price + " for " + quantity + " burgers.";
    }
}
