package ex_10_for_loop;

public class Lab113_for_Loop_continue_even_numbers {
    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println("odd -> "+ i);
        }



    }
}
