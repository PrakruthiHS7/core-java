class SwiggyExecutor {
    public static void main(String food[]) {
        System.out.println("main started");
        
        double price = Swiggy.search("pizza");
        System.out.println("Price of the pizza is " +price);
        
        double priceWithQuantity = Swiggy.search("pizza", 2);
        System.out.println("Price of the pizza with quantity  is " +priceWithQuantity);
    }
}
