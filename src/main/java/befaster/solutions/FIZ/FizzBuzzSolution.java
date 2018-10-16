package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    	String nr = ""+number;
    	if( (number % 3 == 0 || nr.contains("3")) && (number % 5 == 0 || nr.contains("5")) ){
        	return "fizz buzz";
        }
        if(number % 3 == 0 || nr.contains("3")){
        	return "fizz";
        }
        if(number % 5 == 0 || nr.contains("5")){
        	return "buzz";
        }
        if(number > 10){
        	int c = number % 10;
        	int copy = number/10;
        	boolean t = true;
        	while(copy > 0){
        		if(copy % 10 != c){
        			t = false;
        		}		
        	}
        	if(t == true){
        		return "deluxe";
        	}
        }
        return ""+number;
    }

}
