// CommandLineArray.java
public class CommandLineArray {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Error: Please provide exactly 3 command-line arguments.");
            return;
        }

        try {
            int size = Integer.parseInt(args[0]);
            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            if (size <= 0) {
                System.out.println("Error: Array size must be greater than zero.");
                return;
            }

            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = initialValue + (i * increment);
            }

            System.out.println("Array values:");
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("Error: All arguments must be integers.");
        }
    }
}
