package ex_20_OOPs_Super_abstraction;

public class Lab184_Private {

}

class XYZ{
    XYZ(){
    }
    protected int my_gold = 10;
}

class CAB extends XYZ{
    void display(){
        System.out.println(super.my_gold);
    }
}
