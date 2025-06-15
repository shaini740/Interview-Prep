import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Arrays {


    public int[] addArrayElements(){
        System.out.println("Enter the Index of the Array");
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        int[] arrayElements = new int[index];
        System.out.println("Enter "+index+" number of Arrays Elements : ");
        for(int i=0;i<index;i++){
            arrayElements[i] = input.nextInt();
        }
        return arrayElements;
    }

    public void printArray(int[] array){
        for(int values:array){
            System.out.print(values+" ");
        }
        System.out.println();
    }

    public void reverseOfArray(int[] array){
        int i=0;
        int j= array.length - 1;
        System.out.println("the arrays is  : ");
        printArray(array);
        while(i<j){
            int temp = array[i];
            array[i++] = array[j];
            array[j--] = temp;
        }
        System.out.println("The Reverse of the Array is  : ");
        printArray(array);
    }

    public void minMaxValuesInArray(int[] array){
        System.out.println("The array is : ");
        printArray(array);
        int min = array[0];
        int max = array[0];
        for(int values : array){
            min = Math.min(min,values);
            max = Math.max(max,values);
        }
        System.out.println("The Minimum value is :"+min);
        System.out.println("The Maximum Value is :"+max);
    }

    public void duplicateValuesInArray(int[] array){
        System.out.println("The array is : ");
        printArray(array);
        Set<Integer> addArrayValues = new HashSet<>();
        Set<Integer> duplicateValues = new HashSet<>();
        for(int values: array){
            if(!addArrayValues.add(values)){
                duplicateValues.add(values);
            }
        }
        System.out.println("The Duplicate Elements in the Array is  : ");
        for(int value : duplicateValues){
            System.out.print(value+" ");
        }
        System.out.println();
    }

    public void moveZeroesToLast(int[] array){
        System.out.println("The array Elements are : ");
       printArray(array);
        System.out.println();
        int index = 0;
        for(int values: array){
            if(values!=0){
                array[index++]= values;
            }
        }
        while(index<array.length){
            array[index++] = 0;
        }
        System.out.println("The Array After moving the zeroes to last : ");
        printArray(array);
    }

    public void reverseArrayByK(int[] array){
        System.out.println("The array is ");
        printArray(array);
        Scanner input = new Scanner(System.in);
        System.out.println("BY how much you want to reverse the array : ");
        int k = input.nextInt();
        k %=array.length;
        reverse(array,0,array.length-1);
        reverse(array,0,k-1);
        reverse(array,k,array.length-1);
        System.out.println("The array After reversing the by "+k+" is ");
        printArray(array);
    }

    public void reverse(int[] array, int start, int end){
        while(start<end){
            int temp = array[start];
            array[start++] = array[end];
            array[end--] = temp;
        }
    }
}
