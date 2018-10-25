package algs4;

public class Ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// 冒泡
	public static int[] bubbleSort(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) { // 相邻元素两两对比
					int temp = arr[j + 1]; // 元素交换
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	// 选择排序
	public static int[] selectionSort(int[] arr) {
		int len = arr.length;
		int minIndex, temp;
		for (int i = 0; i < len - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < len; j++) {
				if (arr[j] < arr[minIndex]) { // 寻找最小的数
					minIndex = j; // 将最小数的索引保存
				}
			}
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		return arr;
	}

	// 插入排序
	public static int[] insertionSort(int[] arr) {
		int len = arr.length;
		int preIndex, current;
		for (int i = 1; i < len; i++) {
			preIndex = i - 1;
			current = arr[i];
			while (preIndex >= 0 && arr[preIndex] > current) {
				arr[preIndex + 1] = arr[preIndex];
				preIndex--;
			}
			arr[preIndex + 1] = current;
		}
		return arr;
	}

	// 希尔排序
	public static int[] shellSort(int arr[]) {
		int tmp;
		int len = arr.length;
		int gap = 1;
		while (gap < len / 3) {
			gap = gap * 3 + 1;

		}
		while (gap > 0) {
			for (int i = gap; i < len; i++) {
				if (arr[i] < arr[i - gap]) {
					int j = i - gap;
					tmp = arr[i];
					for (; j > 0 && arr[j] > tmp; j = j - gap) {
						arr[j + gap] = arr[j];
					}
					arr[j + gap] = tmp;
				}
			}
			gap = gap / 3;
		}
		return arr;
	}

	// 归并排序
	public static int[] mergeSort(int[] arr) {
		// TODO Auto-generated method stub
		if (arr.length < 2) {
			return arr;
		}

		return arr;
	}

	public static void mergeSort(int[] arr, int left, int right, int[] temp) {
		// TODO Auto-generated method stub
		if (left < right) {

		}

	}

	public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
		int i = left;
		int j = mid + 1;
		int k = 0;

		// 区间排序
		while (i <= mid && j <= right) {
			if (arr[i] > arr[j]) {
				temp[k++] = arr[j++];
			} else {
				temp[k++] = arr[i++];
			}
		}
	}
}
