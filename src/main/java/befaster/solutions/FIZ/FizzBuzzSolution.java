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
        return ""+number;
    }

}
