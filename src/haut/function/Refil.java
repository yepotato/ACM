package haut.function;

public class Refil {
	
	public void main(String[] args){
		String dateString = "java.util.Date";
		try {
			Object d = Class.forName(dateString).newInstance();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	 

}
