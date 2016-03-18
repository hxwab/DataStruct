package com.leetcode;
/**
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * @author csdc
 *
 *1、先排序，在取前k个
 *2、采用最小堆，遍历取K次
 */
public class FindKNum {
	
	
	
	public static void main(String[] args) {
		
		int []a = new int []{5,2,6,8,7,9};
		new FindKNum().getKth(a, 3);
		
	}
	public void getKth(int [] a ,int k){
		if(a.length<k) return;  //注意边界条件
		sort(a,0,a.length-1);
		for(int i=0;i<k;i++){
			System.out.print(a[i]+"  ");
		}
	}
	
	
	public void sort(int [] a,int low,int high){
		
		if(low<high){
			
			int mid = (low+high)/2;
			sort(a,low,mid);
			sort(a,mid+1,high);
			merge(a, low, mid, high);
		}
		
		
	}
	
	public void merge(int [] a,int low,int mid,int high){
		
		int right = high;
		int midd =mid+1;
		int left = low;
		int [] tmp = new int [high-low+1];
		int index=0;
		
		while(left<=mid&&midd<=right){
			
			if(a[left]<a[midd]){
				tmp[index++]=a[left++];
			}else{
				tmp[index++] = a[midd++];
			}
		}
		
		while(left<=mid){
			tmp[index++]=a[left++];
		}
		
		while(midd<=right){
			tmp[index++] = a[midd++];
		}
		
		for(int i =0;i<tmp.length;i++){
			a[low+i]=tmp[i];
		}
	}

}
