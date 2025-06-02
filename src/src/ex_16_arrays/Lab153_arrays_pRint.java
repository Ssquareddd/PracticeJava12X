package ex_16_arrays;

import org.w3c.dom.ls.LSOutput;

public class Lab153_arrays_pRint {
    public static void main(String[] args) {

    int [] array = {52,14,23,35,42,55,68,78,89,91,99};
    int max = array[0];
    int min = array[0];

    for(int i = 0; i < array.length;i++){
        if(array[i]> max)
            max = array[i];

        }
    for(int i = 0; i < array.length;i++){
        if(array[i]<min)
            min = array[i];
    }
        System.out.println("max: " + max);
    System.out.println("min: " + min);
    }
       // System.out.println("max is ->" + max);



}
