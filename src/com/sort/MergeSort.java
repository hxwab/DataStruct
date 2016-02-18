package com.sort;

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
		int index=first;
		
		while(left<=mid&&midd<=right){
			if(a[left]<a[midd]){
				temp[index++]=a[left++];
			}else if(a[left]>a[midd]){
				temp[index++]=a[midd++];
			}
		}
		
		while(left<midd){
			temp[index++]=a[left++];
		}
		
		while(midd<right){
			temp[index++]=a[midd++];
		}
		
		for(int i=first;i<right+1;i++){
			a[i]=temp[i];
		}
	}
	
	
	public void mergeSort(int a[],int first,int last){
		if(first<last){
			int mid = (first+last)/2;
			mergeSort(a, first, mid);
			mergeSort(a, mid+1, last);
			mergeArray(a, first, mid, last);
			
		}
	}
	
}
