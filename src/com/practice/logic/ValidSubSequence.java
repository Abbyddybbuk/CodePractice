package com.practice.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidSubSequence {

	public static void main(String[] args) {
		List<Integer> inputArrayList = Arrays.asList(new Integer[] {1, 2, 1, 88, 91, 90, 65, 76, 99});
		List<Integer> sequence = Arrays.asList(new Integer[] {88, 65, 99});
		System.out.println(ValidSubSequence.isValidSubsequence(inputArrayList, sequence));
	}

	  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
	        if (array.size() < sequence.size()) {
	            return false;
	        }
	        String arrayString = array.stream().map(Object::toString)
	                .collect(java.util.stream.Collectors.joining(", "));

	        String sequenceString = sequence.stream().map(Object::toString)
	                .collect(java.util.stream.Collectors.joining(", "));

	        if (arrayString.contains(sequenceString))
	            return true;

	        List<Integer> allIdx = new ArrayList<>();

	        for (Integer a : sequence) {
	            Integer idx = array.indexOf(a);
	            if (idx < 0) {
	                return false;
	            }
	            allIdx.add(idx);
	        }

	        if(allIdx.size()==1) {
	            return true;
	        }

	        for (int i = 0; i < allIdx.size(); i++) {
	            int j=i+1;
	            if (j >= allIdx.size()) {
	                return true;
	            }
	            if (allIdx.get(i).compareTo(allIdx.get(j)) >= 0) {
	                return false;
	            }
	        }
	        return true;
	  }	
}
