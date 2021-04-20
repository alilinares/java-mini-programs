//import ArrayList for use
import java.util.ArrayList;

public class ArrayOfNumbersAndStrings {

	public static void main(String[] args) {
		
		// Part 1 - Sorting a numeric array
		
		//instantiate listOfNumbers, a new ArrayList object of Integer Type  
        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
        
        // fill listOfNumbers with values
        listOfNumbers.add(45);
        listOfNumbers.add(55);
        listOfNumbers.add(3432);
        listOfNumbers.add(12);
        listOfNumbers.add(5);
        listOfNumbers.add(112300);

        //invoke method and display newly sorted list
        System.out.println(sortNumericArray(listOfNumbers));
        
        
        // Part 2 - Sorting a string array
		
     	//instantiate listOfStrings, a new ArrayList object of String Type 
        ArrayList<String> listOfStrings = new ArrayList<String>();

        //programming languages added to listOfStrings
        listOfStrings.add("java");
        listOfStrings.add("javascript");
        listOfStrings.add("python");
        listOfStrings.add("go");
        listOfStrings.add("c#");
        listOfStrings.add("c++");
        
        //Invoke method and Display newly sorted list
        System.out.println(sortStringArray(listOfStrings));

	}
	
	/* Custom Methods  */
	
	// Part 1 - Sorting a numeric array
	public static ArrayList<Integer> sortNumericArray(ArrayList<Integer> array){
        /* Method sorts an array of numeric values in ascending order */
		
		//instantiate sorted, a new ArrayList object of Integer Type  
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        
        //While given array still has values
        while( !(array.isEmpty()) ){
            //Store first value in given array for comparison
            int smallerValue = array.get(0);
            //store the current index of smallerValue
            int indexOfSmallerValue = 0;

            //traverse the given array
            for(int i= 0; i < array.size(); i++){
                //check if first value in given array is smaller than smallerValue 
                if(array.get(i) < smallerValue){
                    //assign smaller value to smallerValue 
                    smallerValue = array.get(i);
                    //assign newly smallerValue's index
                    indexOfSmallerValue = i;
                }
            }
            //Once the for loop has traversed 
            //add the current smallerValue to sorted array
            sorted.add(smallerValue);
            //remove current smallerValue from given array
            array.remove(indexOfSmallerValue);     
        }  
        //return newly sorted array
        return sorted;  
}

	// Part 2 - Sorting a string array
	
	public static ArrayList<String> sortStringArray(ArrayList<String> array){
		/* Method sorts an array of string values in alphabetical order */
		
		//instantiate sorted, a new ArrayList object of String Type  
		ArrayList<String> sorted = new ArrayList<String>();
		
		//While given array still has values
		while(!(array.isEmpty())){
			//store ASCII value of the first letter of first item of given array 
			int letterToCompare = array.get(0).codePointAt(0);
			//store the index of the first item of given array
			int indexOfItem = 0;
			
			//traverse the given array
			for(int i = 0; i < array.size();i++){
				//Compare the first string's letter ASCII value in given array to letterToCompare
				if(array.get(i).codePointAt(0) < letterToCompare ){
                //store new string letter's ASCII value to letterToCompare
                letterToCompare = array.get(i).codePointAt(0);
                //store new string's index 
                indexOfItem = i;
            }
        }
			
			//once given array is done traversing
			//add string from given array to the sorted array, a-z
			sorted.add(array.get(indexOfItem));
			//remove that string from given array
			array.remove(indexOfItem);
		}
		
		//return newly alphabetically sorted array
		return sorted;

}


}
