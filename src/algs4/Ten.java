package algs4;

import edu.princeton.cs.algs4.Shell;

public class Ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// 希尔排序
	public static int[] shellSort(int arr[]) {
		int len = arr.length;
		int gap = 1;
		int tmp;
		
		// 最大区间划分
		while (gap < len / 3) {
			gap = gap * 3 + 1;

		}
		while (gap > 0) {
			for (int i = gap; i < len; i++) {
				int j = i - gap;
				int temp = arr[i];
				for (; j > 0 && arr[j] > temp; j =j- gap) {
					arr[j + gap] = arr[j];
				}
				arr[j + gap] = temp;
			}
			gap = (gap - 1) / 3;

		}
		return arr;

	}
}
