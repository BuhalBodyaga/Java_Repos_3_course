import java.util.Arrays;
public class Trio implements MenuItem {
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;

    public Trio(Sandwich sandwich, Salad salad, Drink drink) {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }

    @Override
    public String getName() {
        return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
    }

    @Override
    public double getPrice() {
        double[] prices = {sandwich.getPrice(), salad.getPrice(), drink.getPrice()};
        Arrays.sort(prices); // Сортируем цены по возрастанию
        return prices[1] + prices[2]; // Суммируем две наибольшие цены
    }
}