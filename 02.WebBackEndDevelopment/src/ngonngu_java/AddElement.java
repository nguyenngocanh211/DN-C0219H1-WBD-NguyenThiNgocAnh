package ngonngu_java;

import java.util.Scanner;

public class AddElement {
 public static void main(String[] args){
     int[] array = {1,3,4,3,2};
     int[] result = insertElement(array,3,1000);
     for (int elm : result) {
         System.out.print(elm + ", ");
     }
 }

    public static int[] insertElement(int[] array, int k, int x) {

        if (k <0 || k > array.length) {
            return null;
        }
        int[] result = new int[array.length + 1];

        for (int i = 0 ; i < result.length ;i++) {
            if (i < k) result[i] = array[i];
            if (i == k) result[i] = x;
            if (i > k) result[i] = array[i-1];
        }
        return result;
    }
}







