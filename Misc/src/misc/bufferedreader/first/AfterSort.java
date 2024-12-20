package misc.bufferedreader.first;

import java.util.Arrays;

public class AfterSort {
	public static void main(String[] args) {
		BubbleSort bs=new BubbleSort();
	     int[] arr = {64, 34, 25, 12, 22, 11, 90};
	        bs.bubbleSort(arr);
	        System.out.println(Arrays.toString(arr));
	        System.out.println("Sorted array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	}
	}
