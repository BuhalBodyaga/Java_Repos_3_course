public class main {
    public static void main(String[] args) {
        Sandwich cheeseburger = new Sandwich("Cheeseburger", 2.75);
        Salad spinachSalad = new Salad("Spinach Salad", 1.25);
        Drink orangeSoda = new Drink("Orange Soda", 1.25);
        Drink cappuccino = new Drink("Cappuccino", 3.50);

        Trio trio1 = new Trio(cheeseburger, spinachSalad, orangeSoda);
        Trio trio2 = new Trio(cheeseburger, spinachSalad, cappuccino);

        System.out.println(trio1.getName()); // Выведет "Cheeseburger/Spinach Salad/Orange Soda Trio"
        System.out.println(trio1.getPrice()); // Выведет 4.0

        System.out.println(trio2.getName()); // Выведет "Cheeseburger/Spinach Salad/Cappuccino Trio"
        System.out.println(trio2.getPrice()); // Выведет 6.25
    }
}
