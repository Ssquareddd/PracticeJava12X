package ex_06_ternery_operator;

public class Lab064_Interview_ready_question {
    public static void main(String[] args) {

        //Nested TErnary
        // result = Condition1 ? expresion1 : (condition2 ? expression2 :expression3 );

        int number = 29;
        String result = (number > 18) ? (number > 25 ? "In Goa. YOu can Drink" : "You can't Drink") : "You Cant go GOA";
        System.out.println(result);


    }

}
