package com.sort;

/**
 * 快速排序法：
 * 1、找枢纽pvoit，将原数组划分为左边的比枢纽小，右边的比枢纽大
 * 2、利用自身递归调用左边子数组
 * 3、利用自身递归调用右边的子数组
 * 
 * @author csdc
 *
 */
public class QuickSort extends Sort {

	@Override
	public void order(int[] a) {
		recQuickSort(a, 0, a.length-1);
	}
	
	
	public void recQuickSort(int[]a,int left , int right){
		
		if(right-left<0){
			return;
		}else{
			int pivot =a[right];
			int partition = partitionInt(a, left, right, pivot);
			recQuickSort(a, left, partition-1);
			recQuickSort(a, partition+1, right);
		}
		
	}
	
	/**
	 * 划分排序，左边的小于pivot，右边的 大于pivot(左右指针)
	 * @param a
	 * @param left
	 * @param right
	 * @param pivot
	 * @return  返回枢纽的位置，已排好序的
	 */
	public int partitionInt(int [] a, int left , int right,int pivot){
		
		int leftStr = left;
		int rightStr = right-1;
		while(true){
			while(a[leftStr]<pivot)
				leftStr++;
			while(rightStr>0&&a[rightStr]>pivot)
				rightStr--;
			if(leftStr>=rightStr)
				break;
			else
				swap(a, leftStr, rightStr);
		}
		swap(a, leftStr, right);
		return leftStr;
	}
	
	public int partitionInt1(int [] a, int left , int right,int pivot){
		
		int leftStr = left-1;
		int rightStr = right;
		while(true){
			while(a[--leftStr]<pivot)
				;
			while(rightStr>0&&a[--rightStr]>pivot)
				;
			if(leftStr>=rightStr)
				break;
			else
				swap(a, leftStr, rightStr);
		}
		swap(a, leftStr, right);
		return leftStr;
	}

}
