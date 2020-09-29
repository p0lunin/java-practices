package k171.polunin;

public class Item {
    public String name;
    public float price;

    public Item(String name, float price) {
        this.name = name;
        this.price = price;
    }
    public void raisePrice(float k) {
        price = price * (1 + k);
        validatePrice();
    }
    public void lowerPrice(float k) {
        price = price - (price * k);
        validatePrice();
    }
    private void validatePrice() {
        if (price < 0) price = 0;
    }
}
