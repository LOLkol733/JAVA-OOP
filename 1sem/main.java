public class main {
    public static void main(String[] args) {

    HotDrinkTemperature HotDrink1 = new HotDrinkTemperature("tea", 200, 80);

    HotDrinkTemperature HotDrink2 = new HotDrinkTemperature("coffee", 150, 70);

    HotDrinkTemperature HotDrink3 = new HotDrinkTemperature("cocoa", 250, 60);



    HotDrinksVendingMachine HotDrinksVendingMachine = new HotDrinksVendingMachine();

    HotDrinkTemperature product1 = HotDrinksVendingMachine.getProduct("tea", 200, 80);

    HotDrinkTemperature product2 = HotDrinksVendingMachine.getProduct("coffee", 150, 70);

    HotDrinkTemperature product3 = HotDrinksVendingMachine.getProduct("cocoa", 250, 60);


}
}