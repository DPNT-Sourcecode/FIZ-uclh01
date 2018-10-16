package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    	String print = "";
    	String nr = ""+number;
    	if(number % 3 == 0 && nr.contains("3")){
    		print = print + "fizz deluxe";
    	}else if(number % 3 == 0 || nr.contains("3")){
        	print = print + "fizz";
        }
    	if( (number % 5 == 0 && nr.contains("5")) && print.equals("fizz") ){
        	print = print + " buzz deluxe";
        }else if( (number % 5 == 0 || nr.contains("5")) && print.equals("fizz") ){
        	print = print + " buzz";
        }else if(number % 5 == 0 || nr.contains("5")){
        	print = print + "buzz";
        }
        if(number > 10){
        	int c = number % 10;
        	int copy = number/10;
        	boolean deluxe = true;
        	boolean fakeDeluxe = false;
        	while(copy > 0){
        		if(copy % 10 != c){
        			deluxe = false;
        			break;
        		}	
        		copy = copy / 10;
        	}
        	if(deluxe == true && number % 2 == 1){
        		fakeDeluxe = true;
        		deluxe = false;
        	}
        	if(deluxe == true && print == "" && number % 2 == 1){
        		fakeDeluxe = true;
        		deluxe = false;
        		print = "fake deluxe";
        	}else if (deluxe == true && print == "" && number % 2 == 0){
        		print = "deluxe";
        	}else if (deluxe == true && print.equals("fizz buzz")){
        		print = "fizz buzz deluxe";
        	}else if (deluxe == true && print.equals("fizz")){
        		print = "fizz deluxe";
        	}else if (deluxe == true && print.equals("buzz")){
        		print = "buzz deluxe";
        	}else if (fakeDeluxe == true && print.equals("fizz buzz")){
        		print = "fizz buzz fake deluxe";
        	}else if (fakeDeluxe == true && print.equals("fizz")){
        		print = "fizz fake deluxe";
        	}else if (fakeDeluxe == true && print.equals("buzz")){
        		print = "buzz fake deluxe";
        	}else if (fakeDeluxe == true && print.equals("")){
        		print = "fake deluxe";
        	}
        }
        if(print == "")
        	return nr;
        return print;
    }

}
