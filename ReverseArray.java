public class ReverseArray {
	
    public static void main(String[] args){
        int[] values = {22,33,55,66,77,88,12,3};
        
        //display values in original positions
        for(int item:values){
            System.out.print(item+" ");
        }
        
        //add new line for better display
        System.out.println("");
        
        //invoke method and display values from returned array
        for(int item:reverseArray(values)){
            System.out.print(item+" ");
        }
        

    }
    
    /* Method */
    
    public static int[] reverseArray(int[] array){
        /* Reverse items in array backwards */
    	
        // Initialize an array to have the same length value as given array
        int[] reversedArray = new int[array.length]; 
        //Initialize index to be 0 to add new values to reversedArray
        int index = 0;
        //traverse the given array starting at the last item
        for(int i = array.length - 1; i >= 0; i--){
            //stop the loop when i is 0 to avoid incrementing index further
            if(i == 0){
                //add last item to reversedArray and escape loop
                reversedArray[index] = array[i];
                break;
            }else{
                //add items to reversed array when i is not 0;
                reversedArray[index] = array[i];
                //increment index by one
                index++;
            }
            
        }
        //return result
        return reversedArray;
    }
}
