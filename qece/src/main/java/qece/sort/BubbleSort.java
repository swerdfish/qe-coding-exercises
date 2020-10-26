package qece.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {
	
	public static <T extends Comparable<T>> List<T> bubbleSort(List<T> input) {
		List<T> output = new ArrayList<>(input);
		boolean swapped;
		do {
			swapped = false;
			for (int i=0; i<output.size()-1; i++) {
				if (output.get(i).compareTo(output.get(i+1)) > 0) {
					T temp = input.get(i);
					output.set(i, output.get(i+1));
					output.set(i+1, temp);
					swapped = true;
				}
			}
		} while(swapped);
		
		return output; 
	}
	
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1, 2, 4, 3, 5);
		System.out.println(bubbleSort(l1));
	}

}
