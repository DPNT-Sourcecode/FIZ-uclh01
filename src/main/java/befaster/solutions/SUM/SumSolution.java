package befaster.solutions.SUM;

import befaster.runner.SolutionNotImplementedException;

public class SumSolution {

    public int compute(int x, int y) throws Exception {
    	if(x<0 || x > 100 || y > 0 || y > 100){
    		throw new Exception("x or y are out of bounds");
    	}
    	return x+y;
    }

}
