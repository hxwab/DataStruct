package com.newcode;

/**
 * 统计一个数字在排序数组中出现的次数。
 * @author csdc
 *
 *1.
 */
public class GetNumberOfK {

	
	public static void main(String[] args) {
		GetNumberOfK g = new GetNumberOfK();
		int re= g.getNum(new int[]{1,2,3,3,4}, 5);
		System.out.println(re);
		
	}
	
	public int getNum(int[] arr,int k){
		
		int left = 0;
		int right = arr.length;
		int mid =(left+right)/2;
		int index=-1;
		int count=0;
		
		while(left<=right&&right>=1&&left<arr.length){
		
			if(arr[mid]==k){
				index =mid;
				break;
			}else if(arr[mid]<k){
				left=mid+1;
				mid=(left+right)/2;
			}else{
				
				right=mid-1;
				mid=(left+right)/2;
			}
			
		}
		
		if(index!=-1){
			count++;
			int tmp=index;
			while(--tmp>=0&&arr[tmp]==k)
				count++;
			tmp=index;
			while(++tmp<=arr.length-1&&arr[tmp]==k)
				count++;
		}
		
		return count;
	}
	
	
}
