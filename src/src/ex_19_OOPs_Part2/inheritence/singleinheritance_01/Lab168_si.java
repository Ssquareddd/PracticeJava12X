package ex_19_OOPs_Part2.inheritence.singleinheritance_01;

public class Lab168_si {
    public static void main(String[] args) {


        Son sharik = new Son();
        System.out.println(sharik.gold_f);
        sharik.bhk2();
        sharik.bhk3();

        Cousin c = new Cousin();
        c.bhk3();
    }
}
