package com.newcode;

/**
 * 统计一个数字在排序数组中出现的次数。
 * @author csdc
 *
 *1.二分找到该数，然后前后计数
 *2.二分找到第一个和最后一个，然后相减
 */
public class GetNumberOfK {

	
	public static void main(String[] args) {
		GetNumberOfK g = new GetNumberOfK();
		int re= g.getNum(new int[]{1,2,3,3,4}, 5);
		System.out.println(re);
		System.out.println(g.getFirst(new int[]{1,2,3,3,3,4}, 3));
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
	
	
	public int getFirst(int [] arr ,int k){
		int left = 0;
		int right = arr.length;
		int mid=0;
		while(left<=right&&right>=0){
			 mid =(left+right)/2;

			if(arr[mid]==k){
				if(mid>0&&arr[mid-1]!=arr[mid]){
					return mid;
				}else{
					
					right= mid-1;
				}
			}else if(arr[mid]<k){
				left=mid+1;
			}else{
				right=mid-1;
			}
			
		}
		
		return mid;
	}
	
}
