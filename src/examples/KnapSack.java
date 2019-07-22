package examples;

public class KnapSack {
    private int nItems;
    private int [] weights;
    private int [] values;
    private int capacityOfKnapSack;
    private int [][] knapSackTable;
    private int total;

    public KnapSack(int nItems, int[] weights, int[] values, int w) {
        this.nItems = nItems;
        this.weights = weights;
        this.values = values;
        capacityOfKnapSack = w;
        this.knapSackTable = new int [nItems+1][capacityOfKnapSack +1];
    }

    public int solve() {

        for (int i = 1; i <= nItems; i++) {
            for (int w = 1; w <= capacityOfKnapSack; w++) {

                int notIncludeItem = knapSackTable[i-1][w];

                int includeItem = 0;
                if (weights[i] <= w) {
                    includeItem = values[i] + knapSackTable[i-1][w - weights[i]];
                }
                knapSackTable[i][w] = Math.max(notIncludeItem,includeItem);
            }
        }
        total =  knapSackTable[nItems][capacityOfKnapSack];
        return total;
    }

    public void showChoosenItems() {
        System.out.println("Total: " + total);
        for (int n = nItems, w = capacityOfKnapSack; n>0; n--) {
            if ((knapSackTable[n][w] != 0) && (knapSackTable[n][w] != knapSackTable[n-1][w])) {
                System.out.println("Item #" + n);
                w = w - weights[n];
            }
        }
    }
}
