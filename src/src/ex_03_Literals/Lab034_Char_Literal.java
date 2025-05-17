package ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {

        char c1 = 'a'; // A to Z, a-z, !@#$%^&*()_+
        //char c = "b"; -> String = bunch of Char

        char c2 = 'b';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' ';

        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char forward_space = '\f';
        char carriage_return = '\r';

        System.out.println("SharikSayyad");
        System.out.println("Sharik"+new_line+ "Sayyad");
        System.out.println("Sharik"+tab_line+ "Sayyad");
        System.out.println("Sharik"+back_space+ "Sayyad");
        System.out.println("Sharik"+carriage_return+ "Sayyad");

        char c10 = 'A';
        // Ascii, (Limited Numbers) for A is 65 you can view the ascii code on web

        char rupees = '₹';
        System.out.println(rupees);

        char laugh_smiley = '\u1f60';
        System.out.println(laugh_smiley);


    }
}
