import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public static int solution(int[] A) {

        Integer[] array = Arrays.stream(A).boxed().toArray(Integer[]::new);
        HashSet<Integer> set = new HashSet(Arrays.asList(array));

        int minValue = 1;

        while (set.contains(minValue)) {
            minValue++;
        }

        return minValue;
    }
}