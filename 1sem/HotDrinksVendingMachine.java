public class HotDrinksVendingMachine implements Vendingmachine {

    @Override

    public void getProduct() {

        // Логика получения продукта

    }

    

    public HotDrinkTemperature getProduct(String name, int volume, int temperature) {

        return new HotDrinkTemperature(name, volume, temperature);

    }

}