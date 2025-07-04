package ex_21_static;

public class Lab192_static {
    public static void main(String[] args) {
        Student s1 = new Student(25);
        Student s2 = new Student(35);

        System.out.println(s1.age);
        System.out.println(s2.age);
        System.out.println(Student.course_name);
        System.out.println(s1.course_name);
        System.out.println(s2.course_name);

        Student.m1();
    }
}

class Student{
    int age;
    static String course_name = "ATB";

    public Student(int age_c){
        this.age = age_c;
    }

    static void m1(){
        System.out.println("I am static Method");

    }
}