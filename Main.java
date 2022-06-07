import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputWords = sc.nextLine().split(" ");
        int[] inputInts = stringArrayToIntArray(inputWords);
        System.out.println(Arrays.toString(inputInts));
        
    }

    static int[] stringArrayToIntArray(String[] stringArray) {
        int stringArrayLength = stringArray.length; 
        int[] intArray = new int[stringArrayLength];
        for (int i=0; i<stringArrayLength; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }
}