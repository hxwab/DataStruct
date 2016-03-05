package com.datastruct.sort;
/**
 *桶排序:前提是所有元素都小于N,类似于bitmap的映射，把i放到数组下表为i的位置。时间复杂度O(M+N),空间复杂度O(N)
 * @author csdc
 *若有负数，则找出最小的负数，加上之前的值使之成为非负数。输出时所有的值都减去这个数
 */
public class Buket  extends Sort{

	@Override
	public void order(int[] a) {
		buketSort(a);
	}
	
	
	public void buketSort(int [] a){
	    int [] b = new int [100];//假设所有元素都小于100
	    for(int i=0;i<a.length;i++){
	    	b[a[i]]++;
	    }
	    
	   for(int i=0;i<b.length;i++){
		   if(b[i]>0){
			   for(int j =b[i];j>0;j--)
				   System.out.print(i + " ");
		   }
	   }
	}

}
