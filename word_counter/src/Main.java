package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sentence: ");
        String str = sc.nextLine();

        System.out.println("Enter count: ");
        int n = sc.nextInt();

        String[] words = str.split("\\s+");
        Map<String, Integer> countMap = new HashMap<>();

        for (String word : words) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == n) {
                System.out.println(entry.getKey());
            }
        }
    }
}
