import java.util.Scanner;

public class SearchForSpecificValue {

    public static void main(String[] args){
    	//instantiate a new scanner object to read input
    	Scanner read = new Scanner(System.in);
    	
        // string array of programming languages
        String[] programmingLanguages = {"java","javascript","python","c++","c#","go"};
        
        //ask user what to search for
        System.out.print(">>> ");
        
        //store user's input 
        String userInput = read.nextLine();
        
        // invoke method by passing array and user's input to search 
        //display a message whether user's input was found in array or not
        if(searchForValue(userInput,programmingLanguages)) {
        	System.out.println(userInput +" was found!");
        }else {
        	System.out.println(userInput +" was not found!");
        }
    
        //close the scanner for security
        read.close();
    }
    
    /* Methods */
    
    public static boolean searchForValue(String searchValue, String[] array){
    	/* returns a true or false value whether provided string in array */
    	
        //instantiate foundValue as false because we do know yet
        boolean foundValue=false;
        //traverse the given array for value
        for(String item: array){
        	//does current item of given array equal searchValue
            if( item.equals(searchValue) ){
            	//change boolean to true - we found it
                foundValue = true;
            }
        }

        //return result
        return foundValue; 
    }



    
}
