package ex_16_arrays;

public class Lab149_Arrays {
    public static void main(String[] args) {

        int a = 21;
        int [] marks = {95,24,56,23,99,41,65,73,12};
        boolean [] is_sharik_married = {true, false,true,false};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[5]);
       // System.out.println(marks[-1]);   // ArrayIndexOutofBoundsException
        // System.out.println(marks[10]); // ArrayIndexOutofBoundsException




        char c = 'a';
        String name = "Sayyad";
        String[] name_with_space = name.split(" ");
         // ["s", "h", "a" , "r", "i", "k"]
    }

}
