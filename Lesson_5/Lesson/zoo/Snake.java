package Lesson_5.Lesson.zoo;


import Lesson_5.Lesson.Animal;

public class Snake extends Animal {

    public Snake(int age, String color, String name) {
        super(age, color, name);
    }

    @Override
    public void voice() {
        System.out.println("ssssshhhhhhh");
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " ползает по земле");
    }
}
