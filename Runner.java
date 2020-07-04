package Exception;

public class Runner {

	public static void main(String[] args) {
		
		
		int x = 10;    // this is unchecked exception
		int y = 2;
	
		
		//System.out.println(x/y);
       // System.out.println("End");
        
        int [] data = { 1, 2, 3};
        
        int counter = 0;
        try {
        	counter++;
        	 System.out.println(data[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
        	System.out.println("the index number does not exist" + e);
        	System.out.println(data[counter]);
        	System.out.println("first catch");
        }catch (Exception e) {
        	System.out.println("second catch");
        	
        	try {
        		System.out.println(12/0);
        	}catch (ArithmeticException q) {
        		System.out.println("the second catch block is causing an arithmatic exception");
        	}
        }finally {
        	counter = 0;
        }
        	System.out.println(x/y);
        	System.out.println("END");
        	
        	}
        
  
       
		
		
	}


