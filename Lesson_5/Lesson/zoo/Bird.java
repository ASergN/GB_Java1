package Lesson_5.Lesson.zoo;


import Lesson_5.Lesson.Animal;

public class Bird extends Animal {

    int height;

    public Bird(int age, String name, int height){
        super(age, name);
        this.height = height;
    }

    @Override
    public void voice(){
        System.out.println("Птичка " + this.getName() + " чирикает");
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " ходит на лапках");
    }
}
