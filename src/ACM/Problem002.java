package ACM;

import java.util.Scanner;
import java.util.Stack;

public class Problem002 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if (num >= 100) {
			System.out.println("No");
		}
////		StringBuffer stringBuffer=new StringBuffer();
////		for(int k=0;k<10000;k++){
////			stringBuffer.append("[{}]");
////			
////		}
//		int num=2;
		for (int i = 0; i < num; i++) {
			String string = in.next();
//			String string =stringBuffer.toString();
			if(check(string)){
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			
		}

	}
	
	
	private static Boolean checkStrong(String string){
		if(!string.matches("^[\\[\\]\\(\\)]{1,}")){
			return false;
		}
		Stack<Character> stack = new Stack<Character> (); // 创建堆栈对象
		for (int j = 0; j < string.length(); j++) {
			char c = string.charAt(j);
			if(c=='['||c=='('){
				stack.push(c);
			}else if(c==']') {
				if(stack.isEmpty()){
					return false;
				}
				char stack_c = stack.pop();
				if (stack_c!='[') {
					return false;
				}
			}
		}
		return true;
		
	}
	
	private static Boolean check(String string ){
		if(string==null ||string.equals("")){
			return false;
		}
		Stack<Character> stack = new Stack<Character> (); // 创建堆栈对象
		for (int j = 0; j < string.length(); j++) {
			char cString = string.charAt(j);
			if (cString == '[' || cString == '(') {
				stack.push(string.charAt(j));
			} else if (cString == ']') {
				if(stack.isEmpty()){
					return false;
				}
				char stackChar = (char) stack.pop();
				if (stackChar == '[') {
					continue;
				} else {
					return false;
				}
			} else if (cString == ')') {
				if(stack.isEmpty()){
					return false;
				}
				char stackChar =  stack.pop();
				if (stackChar == '(') {
					continue;
				} else {
					return false;
				}
			} else {
				return false;
			}

		}
		if(!stack.isEmpty()){
			return false;
		}
		return true;
	} 
}
