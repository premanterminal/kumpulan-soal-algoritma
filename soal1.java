public class ArrayResultBox {
    public static void main(String[] args) {
        int[][] array = new int[7][7];

        // Fill the array
        for (int row = 0; row < 7; row++) {
            for (int column = 0; column < 7; column++) {
                if (row == 0) {
                    array[row][column] = column;
                } else if (column == 0) {
                    array[row][column] = row;
                } else {
                    array[row][column] = (row - 1) + 1 + column;
                }
            }
        }

        // Print the array
        for (int row = 0; row < 7; row++) {
            for (int column = 0; column < 7; column++) {
                if (row > 0 && column > 0 && row < 6 && column < 6) {
                    System.out.print("* ");
                } else {
                    System.out.print(array[row][column] + " ");
                }
            }
            System.out.println();
        }
    }
}
