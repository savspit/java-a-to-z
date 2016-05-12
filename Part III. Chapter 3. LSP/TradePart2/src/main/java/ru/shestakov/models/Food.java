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

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getExpaireTimeInPercents() {
        long expaireDate = this.expaireDate;
        long createDate = this.createDate;
        long currentDate = System.nanoTime();

        long expaireTime = expaireDate - createDate;
        long expaireTimeGone = currentDate - createDate;

        return (int) (long) (100 * expaireTimeGone / expaireTime);
    }

}
