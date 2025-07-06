package ex_20_OOPs_Super_abstraction;

public class Lab185_Abstract {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.loan50K();

        //Father f1 = new Father(); // Still invalid: abstract class can't be instantiated
    }
}

class Normal {
    // Concrete class -> complete class
}

abstract class Father {
    abstract void loan50K(); // capital K
}

class Son extends Father {
    @Override
    void loan50K() {
        System.out.println("Loan given!");
    }
}
