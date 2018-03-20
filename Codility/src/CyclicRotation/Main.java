package CyclicRotation;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] testData = {3, 8, 9, 7, 6};
        int[] result = solution.solution(testData,3);
        System.out.println(Arrays.toString(result));
    }
}
