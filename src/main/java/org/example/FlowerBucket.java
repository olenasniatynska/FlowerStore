package org.example;
import java.util.ArrayList;

public class FlowerBucket {
    private double price = 0.0;
    private ArrayList<FlowerPack> bucketPack = new ArrayList<FlowerPack>();

    public void add(FlowerPack flowerpk) {
        this.bucketPack.add(flowerpk);
    }
    public ArrayList<FlowerPack> getBucket() {
        return bucketPack;
    }
    public double getPrice() {
        for (FlowerPack flowerpk : bucketPack){
            price += flowerpk.getPrice();
        }
        return price;
    }
}
