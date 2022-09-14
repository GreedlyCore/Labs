package lab1;

import java.util.Arrays;

public class LabOne {

    public static void printMatrix(double[][] matrix) {
        //System.out.println(Arrays.toString(matrix));
        for (int row = 0; row < matrix.length; row++) {
        for (int col = 0; col < matrix[row].length; col++) {
        System.out.printf("%.5f", matrix[row][col]);
        System.out.print(" ");
        }
        System.out.println();
        }
    }

    public static void main(String[] args) {

        short[] a = new short[12];
        int j = 0;
        boolean flag = false;

        for (short i = 1; i <= 23; i++) {

            if (i % 2 != 0) {
                a[j] =  i;
                j++;
            }

        }

        double[] x = new double[19];

        for (int i = 0; i < x.length; i++) {
            x[i] = -5 + (13 * Math.random());
            // System.out.println(x[i]);

        }

        double[][] matrixA = new double[12][19];
        short[] helper = { 1, 9, 13, 15, 17, 21 };

        for (int i = 0; i < matrixA.length; i++) {

            for (int k = 0; k < matrixA[i].length; k++) {

                flag = false;
                
                if (a[i] == 5) {

                    matrixA[i][k] = Math.pow( (Math.cos(Math.cbrt(x[k])) / 2) , 2);

                } else {

                    for (int k2 = 0; k2 < helper.length; k2++) {
                        if (a[i] == helper[k2]) {

                            matrixA[i][k] = Math.pow(Math.E, Math.pow(Math.E, Math.tan(x[k])));
                            flag = true;
                            break;
                            
                        }
                    }
                    if (!flag) {
                        double h = Math.tan( Math.atan(((2*(x[k]+1.5)))/(3*13)) );
                        double g = (1 / 3) * (Math.cbrt(Math.pow(Math.E, Math.cos(x[k]))) + 0.5);
                        matrixA[i][k] = Math.pow(g, h);
                    }

                }
            }

        }

        LabOne.printMatrix(matrixA);

    }
}
