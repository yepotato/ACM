package Algorithms.Fundamentals;

import java.util.Scanner;

/**
 * 二分查找的递归实现
 * @author gzm
 *
 */
public class BianrySearch {

	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7,8,11,12,13,14,15};
		int key = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("待查询数组为：");
		for(int i:a){
			System.out.print(i+"\t");
		}
		System.out.println("\n请输入需要查询的数字：");
		key = scanner.nextInt();
		int loc = rank(key,a);
		if(loc<0){
			System.out.println("数组中不存在数字："+key);
		}else {
			System.out.println("数字："+key+"在数组中的位置为："+loc);
		}
		
	}
	public static int rank(int key, int[]a){
		return rank(key, a,0,a.length-1);
	}
	private static int rank(int key, int[] a, int li, int ri) {
		if (li>ri) return -1;
		int mid=li+(ri-li)/2;
		if(key>a[mid]) return rank(key, a,mid+1,ri);
		else if(key<a[mid]) return rank(key, a,li,mid-1);
		else return mid;
	} 

}
