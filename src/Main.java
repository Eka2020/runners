public class Main {

    public static void main(String[] args) {

        Runner r1 = new Runner("Runner 1",
                new Runner("Runner 2",
                        new Runner("Runner 3",
                                new Runner("Runner 4",
                                        new Runner("Runner 5")))));
        r1.start();

    }
}
