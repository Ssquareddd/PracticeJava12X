package ex_20_OOPs_Super_abstraction;

public class Lab187_INterface_P1 {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.drive();
    }
}

class Car1 implements Engine1,Brakes{


    void drive(){
        startEngine();
        applybreak();
        stopEngine();
    }

    @Override
    public void testEngine(){
        System.out.println("Override by the Car 1");
    }

    @Override
    public void applybreak(){
        System.out.println("Apply Break");
    }

    @Override
    public void startEngine(){
        System.out.println("Start Engine");
    }

    @Override
    public void stopEngine(){
        System.out.println("Stop Engine");
    }
}

interface Brakes{
    void applybreak();
}

interface Engine1{
    void startEngine();
    void stopEngine();
    default void testEngine(){
        System.out.println("Concrete Complete");
    }
}