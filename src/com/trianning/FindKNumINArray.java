package com.trianning;
/**
 * 
 * @author admin
 * 方法一：直接快排nlogN
 * 方法二： K^2logK * (n-K)
 *1、将数组前k个数放到一个copy到一个数组int[] temp中；
2、将temp数组快排；
3、取从原数组第k个元素开始，逐个与temp数组中最大的元素temp[k－1]进行比较；
4、如果temp[k-1]比原数组小，则原数组取下一个，如果temp[k-1],大于原数组中元素，则两个数进行交换，temp数组快排；
5、最后输出temp数组；
 */
public class FindKNumINArray {

}
