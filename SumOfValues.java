//import ArrayList class
import java.util.ArrayList; 


public class SumOfValues {
	
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
    
	  //invoke method and display total sum of array values
	  System.out.println("Sum = "+ whatIsSum(values));
  }  
  
  /* Methods */
  
  public static int whatIsSum(ArrayList<Integer> array){
	  /* returns a total sum from a given array */
	  
	  // instantiate a variable to hold the sum of values from given array
      int sum = 0;
      //traverse the given array
      for(int item:array){
    	  // add values to the sum via shorthand operator
    	  sum += item;
        }
      //return total sum
      return sum;    
  }
}
