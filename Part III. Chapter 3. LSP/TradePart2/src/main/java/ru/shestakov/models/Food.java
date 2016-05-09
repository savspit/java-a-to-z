package ru.shestakov.models;

public abstract class Food {

    public String name;
    public long expaireDate;
    public long createDate;
    public double price;
    public int discount;
    
    public Food(String name, long expaireDate) {
        this.name = name;
        this.expaireDate = expaireDate;
        this.createDate = System.nanoTime();
    }

    public long getExpaireDate() {
        return this.expaireDate;
    }

    public long getCreateDate() {
        return this.createDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public abstract boolean canReproduct();
}
