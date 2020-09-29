package k171.polunin;

class Cart {
    Item[] products;
    int top;
    public Cart(int length) {
        products = new Item[length];
        top = 0;
    }
    public void addProduct(Item product) throws Exception {
        if (top == products.length)
            throw new Exception("Cannot add product.");
        products[top] = product;
        top += 1;
    }
    public void popProduct() throws Exception {
        if (top == 0)
            throw new Exception("Cannot remove product.");
        products[top] = null;
        top -= 1;
    }
    public float sum() {
        float s = 0;
        for (Item p : products) {
            s += p.price;
        }
        return s;
    }
    public void raisePrices(float k) {
        for (Item p : products) {
            p.raisePrice(k);
        }
    }
    public void lowerPrices(float k) {
        for (Item p : products) {
            p.lowerPrice(k);
        }
    }
}
