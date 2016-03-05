package com.datastruct.sort;

/**
 * 快速排序法：
 * 1、找枢纽pvoit，将原数组划分为左边的比枢纽小，右边的比枢纽大
 * 2、利用自身递归调用左边子数组
 * 3、利用自身递归调用右边的子数组
 * 
 * @author csdc
 *
 *
 *想: 
* 通过一趟排序将待排记录分割成独立的两部分,其中一部分记录的关键字均比另一部分的关键字小,
* 则可以分别对这两部分记录继续进行排序,已达到整个序列有序的目的
* 
* 本质就是,找一个基位(枢轴,分水岭,作用是左边的都比它小,右边的都比它大.可随机,取名base
* 首先从序列最右边开始找比base小的
* ,如果小,换位置,从而base移到刚才右边(比较时比base小)的位置(记为临时的high位),这样base右边的都比base大
* 然后,从序列的最左边开始找比base大的
* ,如果大,换位置,从而base移动到刚才左边(比较时比base大)的位置(记为临时的low位),这样base左边的都比base小
* 循环以上两步,直到 low == heigh, 这使才真正的找到了枢轴,分水岭. 返回这个位置,分水岭左边和右边的序列,分别再来递归
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
