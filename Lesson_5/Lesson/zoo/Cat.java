package Lesson_5.Lesson.zoo;


import Lesson_5.Lesson.Animal;

public class Cat extends Animal {

    public Cat(int age, String color, String name){
        super(age, color, name);
    }

    @Override
    public void voice(){
        super.voice();
        System.out.println("Котик " + this.getName() + " мяукает");
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " ходит на лапках");
    }
}
