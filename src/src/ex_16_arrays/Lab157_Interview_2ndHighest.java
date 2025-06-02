package ex_16_arrays;

public class Lab157_Interview_2ndHighest {
    public static void main(String[] args) {

        int numbers [] = {12,45,46,33,87,64};
        int highest = 0;
        int secondhighest = 0;

        for(int num : numbers){

            if(num > highest ){
                secondhighest = highest;
                highest = num;
            }else if(num > secondhighest && num != highest){
                secondhighest = num;
            }
        }
        System.out.println(secondhighest);

    }
}
