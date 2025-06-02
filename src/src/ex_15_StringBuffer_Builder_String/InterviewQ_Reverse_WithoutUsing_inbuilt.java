package ex_15_StringBuffer_Builder_String;

public class InterviewQ_Reverse_WithoutUsing_inbuilt {
    public static void main(String[] args) {

        String input = "Sharik";

        for (int i = input.length(); i >=0; i--);
        {
            //System.out.println(input.charAt(i));

        }
        System.out.println(" ");

        StringBuffer sb = new StringBuffer(input);
        System.out.println(sb.reverse());
    }
}
