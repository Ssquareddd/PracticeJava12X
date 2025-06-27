package ex_18_oops_constructors;


public class Lab168_oops {
    public static void main(String[] args) {

        Baby b1 = new Baby();
        new Baby();
        new Baby();
        Baby b2;
    }

}

class Baby{
    String name;

    Baby(){
        System.out.println("I am Called, Object is created");
    }
}