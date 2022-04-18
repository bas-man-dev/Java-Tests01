import java.util.Arrays;  
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 5, 1, 99, 3, 12, 8, 2};
        // Testing if the methods work:
        
        
       /* System.out.println("Smallest: " + smallest(array));
        System.out.println("Index: " + indexOfSmallest(array));
        System.out.println("Index from 0: " + indexOfSmallestFrom(array, 0));
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(swap(array,2,6)));*/
    }
    
    //Method to find the smallest
    public static int smallest(int[] array){
        int small= array[0];
    
        for(int num : array){
            if (num < small){
                small = num;
            }
        }
        
        return small;
        
                
    }
    // Method to find the smallest and return the index.
    public static int indexOfSmallest(int[] array){
        int small = array[0];
        int index = 0;
        for (int i = 0; i <array.length; i++){
            if(array[i] < small){
                small = array[i];
                index = i;
            }
        }
        return index;
    }
    
    // Method to find the smallest from a particular point in the array
    // and return the index
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int small = array[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < array.length; i++){
            if(array[i] < small){
                small = array[i];
                index = i;
            }
        }
        return index;
    
    }
    
    public static void swap(int[] array, int index1, int index2) {
    
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        
        
    }
    
    public static void sort(int[] array) {

        int n = array.length;
        int x = 0;
        
        while(n>0){
            swap(array,(indexOfSmallestFrom(array, x)), x);
            x++;
            n--;
        }
    }

}
