package com.datastruct.sort;
/**
 * 归并法排序：（分治思想）
 * 1、左边数组分解
 * 2、右边数组分解
 * 3、合并成大数组
 * @author csdc
 *归并排序
*分到最细了,就剩两个数,归并,依次类推
*  本质是靠归并(有序的merge)排的序
 */
public class MergeSort extends Sort {

	@Override
	public void order(int[] a) {

		mergeSort(a, 0, a.length-1);
	}
	
	
	public  void mergeArray(int []a,int first ,int mid,int last){
		
		int [] temp = new int[last-first+1];
		int left = first;
		int right = last;
		int midd = mid+1;
		int index=0;
		
		while(left<=mid&&midd<=right){
			if(a[left]<a[midd]){
				temp[index++]=a[left++];
			}else {
				temp[index++]=a[midd++];
			}
		}
		
		while(left<=mid){
			temp[index++]=a[left++];
		}
		
		while(midd<=right){
			temp[index++]=a[midd++];
		}
		
		for(int i=0;i<temp.length;i++){
			a[i+first]=temp[i];
		}
	}
	
	
	public void mergeSort(int a[],int first,int last){
		if(first<last){
			int mid = (first+last)/2;
			mergeSort(a, first, mid);
			mergeSort(a, mid+1, last);
			mergeArray(a, first, mid, last);
			display(a);
			System.out.println("");
			
		}
	}
	
}
