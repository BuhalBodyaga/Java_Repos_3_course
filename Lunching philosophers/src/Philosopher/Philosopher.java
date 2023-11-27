package Philosopher;

public class Philosopher implements Runnable {
    public final int philosopherNumber;
    private final Object leftFork;
    private final Object rightFork;
    private static int totalRiceEaten = 0;
    private int riceEaten = 0;

    public Philosopher(int philosopherNumber, Object leftFork, Object rightFork) {
        this.philosopherNumber = philosopherNumber;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    private void doAction(String action) throws InterruptedException {
        System.out.println("Философ " + philosopherNumber + ": " + action);
        Thread.sleep((int) (Math.random() * 500));
    }

    public int getRiceEaten() {
        return riceEaten;
    }

    public static int getTotalRiceEaten() {
        return totalRiceEaten;
    }

    @Override
    public void run() {
        try {
            while (true) {
                doAction("Думает");
                synchronized (leftFork) {
                    doAction("Поднял левую вилку");
                    synchronized (rightFork) {
                        doAction("Поднял правую вилку - ест");
                        riceEaten++;
                        totalRiceEaten++;
                        doAction("Положил правую вилку");

                        // Выводим количество съеденного риса философом
                        System.out.println("Философ " + philosopherNumber + " съел " + riceEaten + " порций риса");

                        // Выводим общее количество съеденного риса
                        System.out.println("Общее количество съеденного риса: " + totalRiceEaten);
                    }
                    doAction("Положил левую вилку. Снова думает");
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
