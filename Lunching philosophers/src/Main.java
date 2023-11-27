import Philosopher.Philosopher;

public class Main {
    public static void main(String[] args) {
        final int numPhilosophers = 5;
        Philosopher[] philosophers = new Philosopher[numPhilosophers];
        Object[] forks = new Object[numPhilosophers];

        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Object();
        }

        for (int i = 0; i < philosophers.length; i++) {
            Object leftFork = forks[i];
            Object rightFork = forks[(i + 1) % forks.length];
            philosophers[i] = new Philosopher(i + 1, leftFork, rightFork);
            Thread t = new Thread(philosophers[i], "Философ " + (i + 1));
            t.start();
        }

        Thread monitorThread = new Thread(() -> {
            while (true) {
                for (Philosopher philosopher : philosophers) {
                    System.out.println("Философ " + philosopher.philosopherNumber + " съел " + philosopher.getRiceEaten() + " порций риса");
                }
                System.out.println("Общее количество съеденного риса: " + Philosopher.getTotalRiceEaten());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        monitorThread.setDaemon(true);
        monitorThread.start();
    }

}
