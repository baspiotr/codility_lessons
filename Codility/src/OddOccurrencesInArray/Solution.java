package OddOccurrencesInArray;

public class Solution {

    public int solution(int[] A) {
        int val = 0;
        for (int item : A) {
            val = val ^ item;
        }
        return val;
    }
}
