import java.util.Scanner;

public class MaxValueInArray {
    public static void main(String[] args) {
        double array[][] = new double[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + array.length + " rows and " +
                array[0].length + " columns: ");

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print("Array[" + row + "][" + column + "] = ");
                array[row][column] = scanner.nextDouble();
            }
        }
        double maxValue = array[0][0];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column] > maxValue) {
                    maxValue = array[row][column];
                }
            }
        }
        System.out.println("Max value is: " + maxValue);
    }
}
