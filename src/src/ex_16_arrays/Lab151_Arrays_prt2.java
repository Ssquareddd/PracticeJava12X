package ex_16_arrays;

public class Lab151_Arrays_prt2 {
    public static void main(String[] args) {

        String []names = { "Sharik", "Arif", "Sayyad" };
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        String[] name_atb12x = new String[3];
        name_atb12x[0] = "Sharik";
        name_atb12x[1] = "Arif";
        name_atb12x[2] = "Sayyad";

        System.out.println(name_atb12x.length);
        System.out.println(name_atb12x[0]);
        System.out.println(name_atb12x[1]);
        System.out.println(name_atb12x[2]);

        boolean is_male_data [] = new boolean[2];
        is_male_data[0] = true;
        is_male_data[1] = false;
        System.out.println(is_male_data.length);

    }
}
