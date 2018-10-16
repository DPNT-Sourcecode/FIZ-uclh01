package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    	String print = "";
    	String nr = ""+number;
        if(number % 3 == 0 || nr.contains("3")){
        	print = print + "fizz";
        }
        if( (number % 5 == 0 || nr.contains("5")) && (number % 3 == 0 || nr.contains("3")) ){
        	print = print + " buzz";
        }else if(number % 5 == 0 || nr.contains("5")){
        	print = print + "buzz";
        }
        if(number > 10){
        	int c = number % 10;
        	int copy = number/10;
        	boolean t = true;
        	while(copy > 0){
        		if(copy % 10 != c){
        			t = false;
        			break;
        		}	
        		copy = copy / 10;
        	}
        	if(t == true){
        		print = print + "deluxe";
        	}
        }
        return print;
    }

}
