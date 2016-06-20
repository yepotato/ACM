package Algorithms.Fundamentals;

public class GCD {
	public static void main(String[] args){
		System.out.println(getGCD(3, 7));
	}
	public static int getGCD(int p,int q) {
		if(q==0) return p;
		int r = p%q;
		return getGCD( q, r);
		
	}
}
