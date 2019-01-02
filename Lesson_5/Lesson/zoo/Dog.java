package Lesson_5.Lesson.zoo;


import Lesson_5.Lesson.Animal;

public class Dog extends Animal {

    public Dog(int age, String color, String name){
        super(age, color, name);
    }

    @Override
    public void voice(){
        System.out.println("Собачка " + this.getName() + " гавкает");
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " ходит на лапках");
    }
}
