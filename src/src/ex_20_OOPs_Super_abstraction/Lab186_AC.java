package ex_20_OOPs_Super_abstraction;

public class Lab186_AC {
    public static void main(String[] args) {
        WagonR car = new WagonR();
        car.drive();
    }
}






class WagonR extends Engine implements Tyre,Gear{

    void drive(){
        rubberTyre();
        blackColorDoToTyre();
        startEngine();
        changeGear();
        stopEngine();

    }

    @Override
    void startEngine(){
        System.out.println("Starting the WagonR");
    }

    @Override
    public void rubberTyre(){

    }

    @Override
    public void blackColorDoToTyre(){

    }

    @Override
    public void m2(){

    }

    @Override
    public void changeGear(){

    }
}

abstract class Engine {

    abstract void startEngine();

    void stopEngine(){
        System.out.println("Stop");
    }
}

interface Tyre{
    void rubberTyre();
    void blackColorDoToTyre();

    // JDK > 11 This Feature
    default void m2(){

    }

    default void m3(){

    }

    static void m1(){

    }
}

interface Gear{
    void changeGear();
}
