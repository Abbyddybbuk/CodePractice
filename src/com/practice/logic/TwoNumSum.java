package com.practice.logic;

public class TwoNumSum {

	public static void main(String[] args) {
		int numbers[] = {1, 3, 4, 9, 88, 33, 2};
		int targetNum = 35;
		int outputNumbers[] = TwoNumSum.twoNumberSum(numbers, targetNum);
        System.out.println(outputNumbers[0] + " " + outputNumbers[1]);
	}
	
    public static int[] twoNumberSum(int[] array, int targetSum) {
        int targetNumArray[] = new int[2];
        boolean resultFound = false;
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j <= array.length - 1; j++) {
                if (i==j)
                    continue;

                int tempSum = array[i] + array[j];
                if (tempSum == targetSum) {
                    resultFound = true;
                    targetNumArray[0] = array[i];
                    targetNumArray[1] = array[j];
                }
            }
            if (resultFound) {
                return targetNumArray;
            }
        }
        return new int[0];
    }	

}
