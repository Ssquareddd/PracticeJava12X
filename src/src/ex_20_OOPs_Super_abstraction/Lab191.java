package ex_20_OOPs_Super_abstraction;

public class Lab191 {
    public static void main(String[] args) {

        Sharik d = new Sayyad();
        Sayyad d1 = new Sayyad();
        d.display();
        System.out.println(d.a);
    }
}

class Sayyad implements Sharik{

    @Override
    public void display(){
        System.out.println(a);
    }
}

interface Sharik{
    int a = 10;
    void display();
}
