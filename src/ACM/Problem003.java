package ACM;

import java.util.Scanner;

public class Problem003 {
	public static void main(String[] args){
	    Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String str[]=new String[num];
        for(int i=0;i<num;i++){
            str[i] = in.next();
        }
        for(int i=0;i<num;i++){
            char[] ch= str[i].toCharArray();
            ch = sort(ch);
            for(int l=0;l<ch.length;l++){
                System.out.print(ch[l]+" ");
            }
            System.out.println();
        }
        
	}
	private static  char[] sort(char str[]) {
	    for(int i=0;i<str.length;i++){
	        for(int j=i;j<str.length;j++){
	            if(str[i]>str[j]){
	                switchChar(str,i,j);
	            }
	        }
	    }
	    return str;
    }
    private static void switchChar(char[] str, int i, int j) {
           char temp;
           temp =str[i];
           str[i]=str[j];
           str[j]=temp;
    }

}
