package Task1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через пробел:");
        String[] userInput = scanner.nextLine().split(" ");
        int[] userNumbers = new int[userInput.length];
        for (int i = 0; i < userInput.length; i++) {
            userNumbers[i] = Integer.parseInt(userInput[i]);
            list.add(userNumbers[i]);
        }
        System.out.println(list);
    }
}
