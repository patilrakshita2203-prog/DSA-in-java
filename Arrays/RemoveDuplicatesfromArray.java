import java.util.Arrays;
public class Main {
  public static int[] removeDuplicates(int[] array) {
   int n = array.length;
   int[] uniqueArray = new int[n];
   int index = 0;
   
   for(int i = 0; i < n; i++ ){
       boolean isDuplicate = false;
       for(int j = i+1 ; j<n ; j++){
           if(array[i] == array[j]){
               isDuplicate = true;
           }
       }
       if (!isDuplicate){
           uniqueArray[index++] = array[i];
       }
   }
   return Arrays.copyOf(uniqueArray,index);
  }
  public static void main(String[]args){
      int[] array = {1, 1, 2, 2, 3, 4, 5};
      int[] unique = removeDuplicates(array);
      System.out.println("Duplicate Elements are = " + Arrays.toString(unique));
  }
}
//Output = [1,2,3,4,5]

