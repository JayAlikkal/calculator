
public class Quadratic extends Polynomial{

	
	
		   Quadratic(){
		       super(new double[]{0,0,0});
		   }
		   Quadratic(double[] coefficientArray) {
		       super(coefficientArray);
		   }
		   private int numRealRoots(){
		       double[] coefficientArray=getCoefficients();
		       double a=coefficientArray[0];
		       double b=coefficientArray[1];
		       double c=coefficientArray[2];
		       if((b*b-4*a*c)>0)
		           return 2;
		       else if((b*b-4*a*c)==0)
		           return 1;
		       else
		           return 0;
		   }
		}
		
		
		
	


