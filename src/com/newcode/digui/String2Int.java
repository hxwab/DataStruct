package com.newcode.digui;
/**
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。
 * @author admin
 *要考虑输入的合法性，非法字符串一律返回0
 *首位带符号否？为空否？空字符否？含其他非数字字符否？
 *
 *
 *本题主要考察对输入字符的判断问题。永远不要相信用户的输入
 *
 */
public class String2Int {
	
	  public int StrToInt(String str) {
	        if(str==null||str.length()==0)  return 0;//为空或为空字符的情况
	        
	        int result=0;
	        int length = str.length();
	        int index=0; 
	        if(str.charAt(0)=='0') return 0;//为0字符的情况？可否出现0123？
	        
	        if(str.charAt(0)=='-'||str.charAt(0)=='+'){//带符号情况
	            index++;
	        }
	        
	        for(;index<length;index++){
	            int tmp= str.charAt(index)-'0';
	            if(tmp<10&&tmp>=0) //为数字情况
	               result = result*10+tmp;
	            else return 0;
	        }
	              
	       if(str.charAt(0)=='-'){//为负的情况
	           result = -result;
	       }
	        return result;
	        
	    }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  /**
	   * 字符转数字的源码
	   * @param s
	   * @param radix
	   * @return
	   * @throws NumberFormatException
	   */
	  
	  
	  public static int parseInt(String s, int radix)
				throws NumberFormatException
		    {
		        if (s == null) {
		            throw new NumberFormatException("null");
		        }

			if (radix < Character.MIN_RADIX) {
			    throw new NumberFormatException("radix " + radix +
							    " less than Character.MIN_RADIX");
			}

			if (radix > Character.MAX_RADIX) {
			    throw new NumberFormatException("radix " + radix +
							    " greater than Character.MAX_RADIX");
			}

			int result = 0;
			boolean negative = false;
			int i = 0, max = s.length();
			int limit;
			int multmin;
			int digit;

			if (max > 0) {
			    if (s.charAt(0) == '-') {
				negative = true;
				limit = Integer.MIN_VALUE;
				i++;
			    } else {
				limit = -Integer.MAX_VALUE;
			    }
			    multmin = limit / radix;
			    if (i < max) {
				digit = Character.digit(s.charAt(i++),radix);
				if (digit < 0) {
				    throw NumberFormatException.forInputString(s);
				} else {
				    result = -digit;
				}
			    }
			    while (i < max) {
				// Accumulating negatively avoids surprises near MAX_VALUE
				digit = Character.digit(s.charAt(i++),radix);
				if (digit < 0) {
				    throw NumberFormatException.forInputString(s);
				}
				if (result < multmin) {
				    throw NumberFormatException.forInputString(s);
				}
				result *= radix;
				if (result < limit + digit) {
				    throw NumberFormatException.forInputString(s);
				}
				result -= digit;
			    }
			} else {
			    throw NumberFormatException.forInputString(s);
			}
			if (negative) {
			    if (i > 1) {
				return result;
			    } else {	/* Only got "-" */
				throw NumberFormatException.forInputString(s);
			    }
			} else {
			    return -result;
			}
		    }

}
