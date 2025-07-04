package ex_21_static;

public class Lab193_Static_P2 {
    public static void main(String[] args) {
        ATB sharik = new ATB(821310282, "Sharik");
        ATB sayyad = new ATB(92758422, "Sayyad");
        System.out.println(sharik.phone_np);
        System.out.println(sayyad.name);
        System.out.println(ATB.course_name);
        System.out.println(ATB.course_name);
        ATB.markAttendance();
    }
}

class ATB{

    int phone_np;
    String name;
    static String course_name = "ATB";

    public ATB(int phone_no, String name){
        this.phone_np = phone_np;
        this.name = name;
    }

    void display(){
        System.out.println(this.phone_np + this.name + course_name);
    }

    static void markAttendance(){
        System.out.println("Mark Attendance");

    }
}
