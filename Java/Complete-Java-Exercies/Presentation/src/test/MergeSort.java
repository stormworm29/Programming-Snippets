package test;

import java.util.Arrays;
import java.util.concurrent.RecursiveAction;

public class MergeSort extends RecursiveAction{
	static final int SEQ_THRESHOLD = 10000000;
	protected int low;
	protected int high;
	protected int[] array;
	protected int[] tempMergrr;
	public MergeSort(int arr[], int Low, int High) {
		this.array = arr;
		this.low = Low;
		this.high = High-1;
		tempMergrr = new int[High];
	}
	@Override
	protected void compute() {
		if((high-low) <= SEQ_THRESHOLD) {
			Arrays.sort(array,low, high+1);
		}
		else {
			 int mid = low + (high - low) / 2;
			 MergeSort left = new MergeSort(array, low, mid+1);
			 MergeSort right = new MergeSort(array,mid+1,high+1);
			 invokeAll(left, right);
			 mergeParts(low, mid, high);
		}
	}
	private void mergeParts(int low, int mid, int high) {
		for( int i = low; i<=high; i++) {
			tempMergrr[i] = array[i];
		}
		int i = low;
		int j = mid + 1;
		int k = low;
		while ( i <= mid && j<=high) {
			if(tempMergrr[i] <= tempMergrr[j]) {
				array[k] = tempMergrr[i++];
			}
			else {
				array[k] = tempMergrr[j++];
			}
			k++;
		}
		while(i <= mid) {
			array[k++] = tempMergrr[i++];
		}
		while( j <= high ) {
			array[k++] = tempMergrr[j++];
		}
	}
}
