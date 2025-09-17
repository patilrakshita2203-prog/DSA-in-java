public class Main {

    public static int searchInArray(int[] intArray, int valueToSearch) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == valueToSearch) {
                return i; 
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6};
        int valueToSearch = 1;

        int result = searchInArray(intArray, valueToSearch);

        if (result >= 0) {
            System.out.println(valueToSearch + " found at index " + result);
        } else {
            System.out.println(valueToSearch + " not found in array");
        }
    }
}
