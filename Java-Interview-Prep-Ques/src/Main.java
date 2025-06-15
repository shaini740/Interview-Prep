import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        ///////////////////////////////Array/////////////////////////////////////////////
        Arrays array = new Arrays();
        int[] arrayElements = array.addArrayElements();
      array.reverseOfArray(arrayElements);
        array.minMaxValuesInArray(arrayElements);
        array.duplicateValuesInArray(arrayElements);
        array.moveZeroesToLast(arrayElements);
        array.reverseArrayByK(arrayElements);
    }
}