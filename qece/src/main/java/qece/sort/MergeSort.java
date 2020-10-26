package qece.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
	
	public static <T extends Comparable<T>> List<T> sort(List<T> input) {
		if (input.size()==0 || input.size()==1) return new ArrayList<>(input);
		if (input.size()==2) {
			if (input.get(0).compareTo(input.get(1)) > 0) return new ArrayList<>(Arrays.asList(input.get(1), input.get(0)));
			else return new ArrayList<>(input);
		}
		// sort the left
		List<T> left = sort(input.subList(0, input.size()/2));
		// sort the right
		List<T> right = sort(input.subList(input.size()/2, input.size()));
		// merge left and right
		List<T> output = new ArrayList<>();
		while (left.size() > 0 && right.size() > 0) {
			// if first element of left greater than first element of right
			if (left.get(0).compareTo(right.get(0)) > 0) {
				output.add(right.get(0));
				right.remove(0);
			// else first element of right greater than first element of left
			} else {
				output.add(left.get(0));
				left.remove(0);
			}
		}
		// Afterwards either left or right has 0 elements in it.
		// All elements in left or right are greater than the end of the output
		output.addAll(left);
		output.addAll(right);
		return output;
	}
	
	public static void main(String[] args) {
		System.out.println(sort(Arrays.asList(54, 232, 33, 1, 94, 42456)));
	}

}
