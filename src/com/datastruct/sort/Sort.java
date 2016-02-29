package com.datastruct.sort;

public abstract class Sort {
	
	public void sort(int[] a){
		order(a);
		display(a);
	}
	
	public abstract void order( int [] a);
	
	/**
	 * 找出索引截止end的最大值
	 * @param a
	 * @param end
	 * @return
	 */
	public int getMaxIndex(int[] a,int end){
		int maxIndex =0;
		for(int i=0;i<end;i++){
			if(a[maxIndex]<a[i]){
				maxIndex=i;
			}
		}
		
		return maxIndex;
	}
	
	/**
	 * 找出索引从start开始的最小值
	 * @param a
	 * @param start
	 * @return
	 */
	public int getMinIndex(int[] a,int start){
		int minIndex =start;
		for(int i=start;i<a.length;i++){
			if(a[minIndex]>a[i]){
				minIndex=i;
			}
		}
		return minIndex;
	}
	
	
	public void display(int [] a){
		for (int i= 0; i<a.length;i++){
			System.out.print(a[i]+"  ");
		}
	}

	public void swap(int[] a,int i,int j){
		int temp =a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
