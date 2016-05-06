package com.algorithm.classic;

/**
 * 最长公共子串
 * 
 * 子序列：不要求连续
 * 子串：连续
 * 
 * 
 * 
 * 
 * @author csdc
 *
 *abdefcab
 *abcdefg
 *2113210
 */
public class LongestCommonSubstring {
	
	
	public static void main(String[] args){
		LongestCommonSubstring lcs = new LongestCommonSubstring();
		
		int re = lcs.getLCS("abdefcab", "abcdefg");
		re =lcs.getLCS( "abcdefg","abdefcab");
		re =lcs.getLCS2( "abcdefg","abdefcab");
		re =lcs.getLCS2( "YXXXXXY ","YXYXXYYYYXXYYYYXYYXXYYXXYXYYYYYYXYXYYXYXYYYXXXXXX");
		re =lcs.getLCS2( "YXXXXY ","XXXXXXYXX");
		System.out.println(re);
		while(true);
		
	}
	
	/*在s2中找到s1[i],然后以此为基准向后比较，得到相同子串长度cnt.若cnt大于1,s1[++i] = --cnt(cnt>1),这样就可以省去s1[i]
	 * 之后的cnt-1个元素的比较。下一个就从s[i+cnt-1]开始
	 * 
	 * 还要检验s2中是否存在s1[i]~s1[i+cnt-1]在其他位置
	 * 
	 * s2为基元
	 * s1待匹配序列
	 */
	
	
	
	
	public int getLCS(String s1,String s2){
		
		int length = s1.length();
		int length2 = s2.length();
		int [] p = new int[length];
		
		for(int i=0;i<length;i++){
		
			int index = s2.indexOf(s1.charAt(i));
			int cnt=0;
			if(index!=-1){
				int tmp1=i;
				int tmp2=index;
				while(tmp1<length&&tmp2<length2&&(s1.charAt(tmp1++)==s2.charAt(tmp2++))){
						cnt++;
					}
				}
			
			p[i]=cnt;
			
			while(cnt>1){
				p[++i]=--cnt;
			}
			
		}
		
		int max =0;
		for(int i =0;i<p.length;i++){
		 
			if(p[i]>max) max = p[i];
		}
		return max;
	}

	
public int getLCS1(String s1,String s2){
		
		int length = s1.length();
		int length2 = s2.length();
		int max = 0;
		
		for(int i=0;i<length;i++){
		
			int index = s2.indexOf(s1.charAt(i));
			int cnt=0;
			if(index!=-1){
				int tmp1=i;
				int tmp2=index;
				while(tmp1<length&&tmp2<length2&&(s1.charAt(tmp1++)==s2.charAt(tmp2++))){
						cnt++;
					}
				}
			
			if(max<cnt) max=cnt;
			
			while(cnt>1){
				--cnt;
				i++;
			}
			
		}
	
		return max;
	}


public int getLCS2(String s1,String s2){
	
	int length = s1.length();
	int length2 = s2.length();
	int [] p = new int[length];
	
	for(int i=0;i<length;i++){
	
		int index = s2.indexOf(s1.charAt(i));
		int cnt=0;
		 /*if(index!=-1){
			int tmp1=i;
			int tmp2=index;
			while(tmp1<length&&tmp2<length2&&(s1.charAt(tmp1++)==s2.charAt(tmp2++))){
					cnt++;
				}
			}
		*/
		
		while((index = s2.indexOf(s1.substring(i, i+cnt+1)))!=-1){
				cnt=0;
				int tmp1=i;
				int tmp2=index;
				while(tmp1<length&&tmp2<length2&&(s1.charAt(tmp1++)==s2.charAt(tmp2++))){
						cnt++;
					}
		}
		
		
		p[i]=cnt;
		
		while(cnt>1){
			p[++i]=--cnt;
		}
		
	}
	
	int max =0;
	for(int i =0;i<p.length;i++){
	 
		if(p[i]>max) max = p[i];
	}
	return max;
}
}
