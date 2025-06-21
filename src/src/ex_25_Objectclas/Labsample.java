package ex_25_Objectclas;

public class Labsample extends Object{


    @Override
    public String toString(){
        System.out.println("This is coming from object class");
        return  null;
    }


    public int hashcode(){
        System.out.println("coming from the object");
        return 0;
    }

    @Override
    public boolean equals(Object obj){
        System.out.println("This is also coming from the object class.");
        return true;
    }
}
