package org.example;

public class FlowerPack {
    private Flower flower;
    private int quantity;

    public double getPrice() {
        return flower.getPrice()*quantity;
    }
}
