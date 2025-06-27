package ex_18_oops_constructors;

public class Lab169_OOPS_con {
    public static void main(String[] args) {

        A a1 = new A();
        System.out.println(a1);
    }
}

class A{
    A(){
        System.out.println("I want to read a CSV file");
        System.out.println("Open the page before loading the Scripts");
        System.out.println("You can do anything which you want to do, when object is created ");

        // FileInputStream fileInputStream = new FileInputStream("C://a.txt");
    }
}
