package com.demo.lab1;
import java.util.*;

public class ArrayStore {
    int[] arr = new int[10];

    public void acceptElements(Scanner sc){
        System.out.println("Enter 10 integers:");
        for (int i=0; i<10;i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void displayWithWhile(){
        int i =0;
        System.out.println("Using while loop:");
        while (i < arr.length){
            System.out.println(arr[i++] + " ");
        }
        System.out.println();
    }

    public void displayWithFor(){
        System.out.println("Using for loop:");
        for (int val : arr){
            System.out.println(val + " ");
        }
        System.out.println();
    }

    public void sortArray(){ Arrays.sort(arr); }

    public int countOccurances(int num){
        int count = 0;
        for (int val : arr){
            if (val == num) count++;
        }
        return count;
    }

    public void insertAt(int num, int pos){
        if (pos <0 || pos >= arr.length){
            System.out.println("Invalid position!");
            return;
        }
        arr[pos] = num;
    }

    public int[] removeDuplicates(){
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (int val : arr){
            uniqueSet.add(val);
        }
        int[] result = new int[uniqueSet.size()];
        int i =0;
        for(int val : uniqueSet){
            result[i++] = val;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayStore store= new ArrayStore();

        store.acceptElements(sc);
        store.displayWithWhile();
        store.displayWithFor();
        store.sortArray();

        System.out.println("Occurrances of 9: " + store.countOccurances(9));

        store.insertAt(99,2);
        System.out.println("After insertion at index 2:");
        store.displayWithFor();

        System.out.println("Array after removing duplicates:");
        int[] noDup = store.removeDuplicates();
        System.out.println(Arrays.toString(noDup));
    }
}
