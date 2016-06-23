package Algorithms.Fundamentals;
/**
 * 二分查找的递归实现
 * @author gzm
 *
 */
public class BianrySearch {

	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7,8,11,12,13,14,15};
		System.out.print(rank(12,a));
		
	}
	public static int rank(int key, int[]a){
		return rank(key, a,0,a.length);
	}
	private static int rank(int key, int[] a, int li, int ri) {
		if (li>ri) return -1;
		int mid=(li+ri)/2;
		if(key>a[mid]) return rank(key, a,mid,ri);
		if(key<a[mid]) return rank(key, a,li,mid);
		else return mid;
	} 

}
