package basic;


/**
 * @author Jin
 * @Description
 * @date 9/15/2023 11:35 PM
 */

public class Basic02 {
    public static void main(String[] args){
        Person Wang = new Person();
        Person Liu = new Person();
        Wang.number = 666;
        System.out.println(Wang.number);
        Liu.number = 888;
        System.out.println(Wang.number);
    }




}


// each class can have multiple fields
class Person {
    //use private to reject external access
    protected String name;
    protected int age;
    public static int number;

//    public Person(String name, int age){
//        this.name = name;
//        this.age = age;
//    }

    public String getName() {
        return this. name;
    }

    public int getAge(){
        return this.age;
    }

    public void run(){
        System.out.println("Person.run");
    }

}

class Student extends Person{
    protected int score;

//    public Student(String name, int age, int score){
//        super(name, age);
//        this.score = score;
//    }
    public int getScore(){
        return this.score;
    }

    @Override
    public void run(){
        System.out.println("student.run");
    }
}

class PrimaryStudent extends Student{
    protected int grade;

    //    public PrimaryStudent(){
//
//    }

    public void setGrade(int grade) {
        this.grade = grade;
    }



}


