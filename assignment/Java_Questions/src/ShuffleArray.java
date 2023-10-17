import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] inputNumbers = input.split(" ");
        Integer[] array = new Integer[inputNumbers.length];

        for (int i = 0; i < inputNumbers.length; i++) {
            array[i] = Integer.parseInt(inputNumbers[i]);
        }

        List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);

        System.out.println("Shuffled Array: " + Arrays.toString(list.toArray()));
    }
}
