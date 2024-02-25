package UprajneniqLekciq4;

public class American extends Person{

    public American(String name, String gender, String job, String EGN, String religion){
        trump(name, gender, "English", job, "American", religion);
    }

@Override
    public void sayHello(){System.out.println("Hello");}
    @Override
    public Boolean isAdult() {return this.age>= 21;}

    public void eatMacDonalds(){System.out.println("I am eating Mac Donalds")}
}
