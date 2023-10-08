import java.util.Arrays;

public class SkyView {
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned) {
        if (numRows <= 0 || numCols <= 0 && Arrays.stream(scanned).count() != (long) numCols * numRows) {
            return;
        }
        this.view = new double[numRows][numCols];
        boolean flag = true;
        int count = 0;
        while (count != numCols * numRows) {
            for (int i = 0; i < numRows; i++) {
                if (flag) for (int j = 0; j < numCols; j++) {
                    this.view[i][j] = scanned[count];
                    count++;
                }
                else for (int j = numCols - 1; j >= 0; j--) {
                    this.view[i][j] = scanned[count];
                    count++;
                }
                flag = !flag;
            }

        }
        for (int i = 0; i < this.view.length; i++) {
            System.out.println(Arrays.toString(this.view[i]));
        }

    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        if (!(0 <= startRow && startRow <= endRow && endRow < view.length) ||
                !(0 <= startCol && startCol <= endCol && endCol < view[0].length)) {
            return 0;
        }
        double summ = 0;
        int count = (endRow - startRow+1) * (endCol - startCol+1);
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                summ+=view[i][j];
            }
        }
        return summ/count;
    }

    public static void main(String[] args) {
        int rows = 4;
        int cols = 3;
        double[] scanned = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1, 0.2, 0.5, 0.1, 1.6, 0.6, 0.9};
        SkyView res= new SkyView(rows, cols, scanned);
    System.out.print(res.getAverage(0,2,0,2));
    }


}
