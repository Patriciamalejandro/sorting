
public class insertion {
  static int step = 1;

    public static void main(String[] args) {

        int[] input = { 3, 15, 81, 90, 13, 27, 54, 4, 1 };
        insertionSort(input);
    }

    private static void printNumbers(int[] input) {

      System.out.println("Step "+step);
      System.out.println("-----------------------------");
      step++;

        for (int p = 0; p < input.length; p++) {

            System.out.print(input[p] + ", ");

        }

        System.out.println("\n");
    }

    public static void insertionSort(int array[]) {

        int m = array.length;

        for (int a = 1; a < m; a++) {

            int key = array[a];
            int p = a-1;

            while ( (p > -1) && ( array [p] > key ) ) {

                array [p+1] = array [p];
                p--;

            }

            array[p+1] = key;
            printNumbers(array);
        }
    }
}
