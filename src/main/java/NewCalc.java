import java.util.Scanner;

public class NewCalc {
 
	
	
	public static void iprint(int k,int x) {
		if(k==1) System.out.printf("Operation to be done is Addition and value is = %d",x);
		else if(k==2) System.out.printf("Operation to be done is Subtraction and value is = %d",x);
		else if(k==3) System.out.printf("Operation to be done is Multiplication and value is = %d",x);
	}
	
	public static void fprint(int k,float x) {
		if(k==1) System.out.printf("Operation to be done is Addition and value is = %.2f",x);
		else if(k==2) System.out.printf("Operation to be done is Subtraction and value is = %.2f",x);
		else if(k==3) System.out.printf("Operation to be done is Multiplication and value is = %.2f",x);
		else System.out.printf("Operation to be done is Division and value is = %f",x);
	}
	
	public static void op(String s,int i,int j,int a,int b,float c,float d){
	    if(s.charAt(i)=='+'){
        if(j==1) iprint(1,a+b);
        else fprint(1,c+d);

	
	    }
	    else if(s.charAt(i)=='-'){
	    	 if(j==1) iprint(2,a-b);
	         else fprint(2,c-d);
	    	 
	    }
	    else if(s.charAt(i)=='*'){
	          if(j==1) iprint(3,a*b);
	         else fprint(3,c*d);
	       
	    }
	    else{
	    	 if(j==1) fprint(4,(float)a/b);
	         else fprint(4,c/d);
	    
	    }
	}
	
	public static int check(String s) {
		int i;
		for(i=0;i<s.length();i++) {
			if(s.charAt(i)=='.') return 1;
		}
			return 0;
	}
	
	  public static void main(String args[]) {
		  Scanner in=new Scanner(System.in);
         System.out.println("Enter addition or subtration or multiplication or division operation for simple claculator in String form:");
        System.out.println("\nExample= a + b ,where a&b need to be same datatype");
        String s=in.next();
         int k=check(s);
      int a=0,b=0;
      float c=0,d=0;
         int i;
         for(i=0;i<s.length();i++) {
        	 if((s.charAt(i)<48||s.charAt(i)>57)&&s.charAt(i)!='.') {
        		 if(k==1) {
        		 c=Float.valueOf(s.substring(0,i));
        		 d=Float.valueOf(s.substring(i+1));
        		 break;
        		 }
        		 else {
        			 a=Integer.valueOf(s.substring(0,i));
        			 b=Integer.valueOf(s.substring(i+1));
        		 break;
        		 }
        	 }
         }
         int j=0;
         if(a!=0&&b!=0) j=1;
         op(s,i,j,a,b,c,d);
	  }
}
