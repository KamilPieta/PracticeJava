package predicateExample;

/**
 * Created by k on 20.06.2016.
 */
public class Furniture {



    private int price=0;
    private String color="";

    public Furniture(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "predicateExample.Furniture{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
