package ex_18_oops_constructors;

public class Lab170_car {
    public static void main(String[] args) {


        Car tesla = new Car();
        tesla.name = "Tesla Model 3";
        tesla.year = 2025;
        System.out.println(tesla.name);
        System.out.println(tesla.year);
        System.out.println(tesla.model);

        Car nano = new Car();
        nano.name = "Tata Nano";
        System.out.println(nano.name);
        System.out.println(nano.year);
        System.out.println(nano.model);

        LoginPage a1 = new LoginPage();

    }
}

// If we not assign value then it will check default constructor & assign from there
