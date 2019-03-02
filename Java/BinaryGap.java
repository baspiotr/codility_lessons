class Solution {
  public static int solution(int N) {

        String binaryRepresentation = Integer.toBinaryString(N);
        int biggestGap = 0;
        int lastGap = 0;

        for (char bit : binaryRepresentation.toCharArray()) {
            if (bit == '0') {
                lastGap++;
            } else {
                if (lastGap > biggestGap) {
                    biggestGap = lastGap;
                }
                lastGap = 0;
            }
        }
        return biggestGap;
    }
}