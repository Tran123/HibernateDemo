package impl;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
	  public static List<Integer> getFactors(int number) {
	        List<Integer> factors = new ArrayList<Integer>();
	        for(int i = 2; i <= number; i++){
	          while((number%i) == 0){
	            factors.add(i);
	            number = number/i;
	          }
	        }
	        return factors;
	    }

	    public static String printFactors(int number) {
	    	if(number < 0){
	    		throw new IllegalArgumentException("Please input positive integer.");
	    	}
	        List<Integer> result = getFactors(number);
	        String factorList = "";
	        for(int i = 0; i < result.size(); i++) {
	           factorList += result.get(i) + " ";
	        }
	        return factorList;
	    }
}
