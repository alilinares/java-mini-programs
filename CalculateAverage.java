//import ArrayList class
import java.util.ArrayList;


public class CalculateAverage {
	
    public static void main(String[] args){
    	//instantiate values, a new ArrayList object of Integer Type  
        ArrayList<Integer> values = new ArrayList<Integer>();
        //add values 
        values.add(45);
        values.add(55);
        values.add(3432);
        values.add(12);
        values.add(5);
        values.add(112);
    
        //invoke method,round its value and display result
        System.out.println("Average = "+ Math.round(whatIsAverage(values))+" ~");
      }  
    
    /* Methods */
    public static double whatIsAverage(ArrayList<Integer> array){
    	/* returns average of the given numeric array */
    	
    	// instantiate a variable to hold the sum of values from given array
    	int sum = 0;
    	// instantiate a variable to hold the average of values from given array
        double avg = 0;
        // instantiate a variable to hold number of values from given array
        int howManyValues = 0;
        //traverse the given array
        for(int item:array){
        	//add item's value to sum
        	sum += item;
        	//add 1 to keep track of number of values
        	howManyValues++;
        }
        //calculate average and make sure value is double
        avg = (double) sum / howManyValues;
        //return calculated avg
        return avg;
            
    }
}
