import java.util.*;

class Solution {
    public int totalFruit(int[] fruits) {

        int low = 0;
        int res = 0;

        Map<Integer, Integer> freq = new HashMap<>();

        for (int high = 0; high < fruits.length; high++) {

            int fruit = fruits[high];

            freq.put(fruit, freq.getOrDefault(fruit, 0) + 1);

            while (freq.size() > 2) {

                int leftFruit = fruits[low];

                freq.put(leftFruit, freq.get(leftFruit) - 1);

                if (freq.get(leftFruit) == 0) {
                    freq.remove(leftFruit);
                }

                low++;
            }

            res = Math.max(res, high - low + 1);
        }

        return res;
    }
}