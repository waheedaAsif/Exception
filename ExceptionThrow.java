package Exception;

public class ExceptionThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int x = 10;
		 int[] y = {2, 3, 0, 10};
		 
		 try {
			 System.out.println(x/y[2]);
		 }catch (ArrayIndexOutOfBoundsException e) {
			 System.out.println("index is not valid");
		 }catch(ArithmeticException e) {
			 System.out.println("you are trying to divide by 0, dont!");
		 }catch (Exception e) {
			 throw e;
		 }
	}

}
