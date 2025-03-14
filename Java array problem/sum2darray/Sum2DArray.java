
package sum2darray;

public class Sum2DArray {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;

        for (int[] row : array) {
            for (int element : row) {
                sum += element;
            }
        }

        System.out.println("The sum of all elements in the 2D array is: " + sum);
    }
}
