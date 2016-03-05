package com.newcode;
/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个非递减序列的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * @author csdc
 *
 *题目的关键点在于找到转折点。该转折点具有的特性：从前面看是递减的，从后面看是递增的
 *首中尾
 *1、遍历
 *2、二分查找
 */
public class FindMinElement {

	public static void main(String[] args) {
		int a[] = {4,5,6,7,8,1 ,2,3};
		new FindMinElement().findNum(a);
	}
	
	
	/**
	 * 二分查找法,总会在a[mid]=num时结束或low=high结束
	 * @param a
	 * @param num
	 * @return
	 */
	public int  findNum(int []a ,int num){
		
		int low =0;
		int high = a.length-1;
		int index = 0;
		while(low<=high){
			int mid = (low+high)/2;
			if(a[mid]<num){
				low = mid+1;
			}else if(a[mid]>num){
				high=mid-1;
			}else{
				index = mid;
				break;
			}
		}
		System.out.println(a[index]);
		return a[index];
	}
	
	
	/**
	 * 
	 * @param a
	 */
	public void findNum(int [] a ){
		int low =0;
		int high = a.length-1;
		int index = 0;
		while(low<high-1){
			int mid =(low+high)/2;
			if(a[mid]>a[low]){//说明前半段递增，拐点一定在后面
				low =mid+1;
			}else if(a[mid]<a[low]){//在前半段
				high=mid;
			}else{
				if(a[low]>a[high]){
					index = high;
				}else{
					index =low;
				}
			}
			
		}
		
		System.out.println(a[index]);
		
	}
}
