package ex_16_arrays;

public class Lab156_Sum_of_arrays {
    public static void main(String[] args) {

        int numbers[] = {5,4,3,2,1,9};

        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}
