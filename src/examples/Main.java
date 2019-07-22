package examples;

public class Main {

    public static void main(String[] args) {
        case1();
        System.out.println("******");
        case2();
    }

    private static void case2() {
        int nItems = 3;
        int capacityOfKnapSack = 50;

        int[] weights = new int[nItems+1];
        weights[1] = 10;
        weights[2] = 20;
        weights[3] = 30;

        int[] values = new int[nItems+1];
        values[1] = 60;
        values[2] = 100;
        values[3] = 120;

        KnapSack knapSack = new KnapSack(nItems, weights, values, capacityOfKnapSack);
        knapSack.solve();
        knapSack.showChoosenItems();
    }

    private static void case1() {
        int nItems = 3;
        int capacityOfKnapSack = 5;

        int[] weights = new int[nItems+1];
        weights[1] = 4;
        weights[2] = 2;
        weights[3] = 3;

        int[] values = new int[nItems+1];
        values[1] = 10;
        values[2] = 4;
        values[3] = 7;

        KnapSack knapSack = new KnapSack(nItems, weights, values, capacityOfKnapSack);
        knapSack.solve();
        knapSack.showChoosenItems();

    }
}
