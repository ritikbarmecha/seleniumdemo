package dd;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
   
//   try {
//	   System.out.println(" start 1");
//	   int i=1/0;
//	   System.out.println("end ");   
//   }catch(Exception e) {
//	   System.out.println("end  catch"); 
//	   System.out.println(e.getMessage()); 
//	   System.out.println(e.getCause()); 
//	   e.printStackTrace();
//   }finally{
//	   System.out.println("finally ");    
//   }
   
   try {
	demo();
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	System.out.println("end2 ");
}
	}
	
	public static void demo() throws Exception{
		   System.out.println(" start 1");
		   throw new ArithmeticException("Not valid");
//		   int i=1/0;
//		   System.out.println("end ");
	}

}
