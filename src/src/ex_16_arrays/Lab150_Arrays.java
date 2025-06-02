package ex_16_arrays;

public class Lab150_Arrays {
    public static void main(String[] args) {

        int[] marks = {1,2,3,4,5};

        // 2nd way to create the array

        int[] mark2 = new int[4];
        System.out.println(mark2);
        int mark3 [] = new int[3]; // Fixed Size
        System.out.println(mark3);

        String names[] = new String[2];
        names[0] = "Sharik";
        names[1] = "Arif";
        names[2] = "Sayyad";

        System.out.println(marks[0]);
        System.out.println(marks[1]);
    }
}
