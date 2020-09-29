package k171.polunin;

public class Main {

    public static void main(String[] args) throws Exception {
        var cart = new Cart(5);
        cart.addProduct(new Item("Test 1", 10));
        cart.addProduct(new Item("Test 2", 5));
        cart.addProduct(new Item("Test 3", 1));
        cart.addProduct(new Item("Test 4", 15.5f));
        cart.addProduct(new Item("Test 5", 26.47f));

        System.out.println(String.format("Sum of items: %.2f", cart.sum()));

        cart.raisePrices(0.15f);
        System.out.println(String.format("Sum of items after up (15%%): %.2f", cart.sum()));

        cart.lowerPrices(0.30f);
        System.out.println(String.format("Sum of items after low (30%%): %.2f", cart.sum()));
    }
}
