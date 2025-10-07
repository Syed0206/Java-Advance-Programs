import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] elements = new int[n];

        for (int i = 0; i < n; i++) {
            elements[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> hp = new HashMap<>();
        for (int i : elements) {
            hp.put(i, hp.getOrDefault(i, 0) + 1);
        }

        boolean found = false;
        for (int i : hp.keySet()) {
            if (hp.get(i) > n / 2) {
                System.out.println("Majority Element is: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Majority Element not found!");
        }

        sc.close();
    }
}
