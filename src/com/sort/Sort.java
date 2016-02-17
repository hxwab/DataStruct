package com.sort;

public abstract class Sort {
	
	public void sort(int[] a){
		order(a);
		display(a);
	}
	
	public abstract void order( int [] a);
	
	public int getMaxIndex(int[] a){
		int maxIndex =0;
		for(int i=0;i<a.length;i++){
			if(a[maxIndex]<a[i]){
				maxIndex=i;
			}
		}
		
		return maxIndex;
	}
	
	public int getMinIndex(int[] a){
		int minIndex =0;
		for(int i=0;i<a.length;i++){
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
