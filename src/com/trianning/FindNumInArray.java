package com.trianning;
/**
 * 题目描述

在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。 
输入描述:
array： 待查找的二维数组
target：查找的数字


输出描述:
查找到返回true，查找不到返回false
 * @author admin
 *
 *思路一： 以第一行最后一个元素为基准元a[0][length-1]，若待查找元素比基准元大，则基准元更新为a[y++][length-1];若比基准元小则更新为a[0][length-x],以此类推
 *
 */
public class FindNumInArray {

	
	
	
	
	
	public static void main(String[] args) {
		FindNumInArray f =new FindNumInArray();
		System.out.println(f.replaceSpace(new StringBuffer("helloworld ")));
		System.out.println("hello world ".replace(" ", "%20"));
	}
	
	
	
	
	public String replaceSpace(StringBuffer str) {
	        
	        StringBuffer string = new StringBuffer();
	    	String s = str.toString();
	        String [] ss = s.split(" ");
	        int length=ss.length;
	        for(int i=0;i<length-1;i++){
	            string.append(ss[i]);
	            string.append("%20");
	        }
	        string.append(ss[length-1]);
	        return string.toString();
	        
	    }
		
	//遍历
	 public String replaceSpace1(StringBuffer str) {
	        StringBuffer out=new StringBuffer();
	        for (int i = 0; i < str.toString().length(); i++) {
	            char b=str.charAt(i);
	            if(String.valueOf(b).equals(" ")){
	                out.append("%20");
	            }else{
	                out.append(b);
	            }
	        }
	        return out.toString();     
	    }
	
	
	
	/**
	 *  *思路一： 以第一行最后一个元素为基准元a[0][length-1]，若待查找元素比基准元大，则基准元更新为a[y++][length-1];若比基准元小则更新为a[0][length-x],以此类推
	 * @param array
	 * @param target
	 * @return
	 */
	public boolean Find(int [][] array,int target) {
	        
	        
	        int lines = array.length;
	        int rows = array[0].length;
	        
	        if(lines==0||rows==0)  return false; //一定要输入的考虑边界条件
	        
	        int xIndex=1;
	        int yIndex =0;
	        int tmp =array[0][rows-1];
	        
	        while(xIndex<=rows&&yIndex<lines){
	            
	            if(target<tmp){
	                xIndex++;
	                if(xIndex>rows) break;//防止越界
	                tmp=array[yIndex][rows-xIndex];
	            }else if(target>tmp){
	                yIndex++;
	                if(yIndex>=lines) break;//防止数组越界
	                tmp=array[yIndex][rows-xIndex];
	                
	            }else{
	                break;
	            }
	            
	        }
	        
	        //符合条件表明是正常退出，找到该元素
	        if(xIndex<=rows&&yIndex<lines) return true;
	        else return false;
	        
	
	    }
}
