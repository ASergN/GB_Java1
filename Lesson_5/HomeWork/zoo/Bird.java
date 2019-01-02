package Lesson_5.HomeWork.zoo;


import Lesson_5.HomeWork.Animal;

public class Bird extends Animal {

    public Bird(String name){
        super(name);
        this.maxRun = 5;
        this.maxSwim = 0;
        this.maxJump = 0.2;
    }

    @Override
    public void run(int length){
        if (length<=maxRun)
            System.out.println("Птица " + name + " пробежала " + length + " метров");
        else System.out.println("Птица " + name + " не может пробежать " + length + " метров");
    }

    @Override
    public void swim(int length) {
        if (length<=maxSwim)
            System.out.println("Птица " + name + " проплыла " + length + " метров");
        else System.out.println("Птица " + name + " не может проплыть " + length + " метров");
    }

    @Override
    public void jump(double height) {
        if (height<=maxJump)
            System.out.println("Птица " + name + " прыгнула на " + height + " метров");
        else System.out.println("Птица " + name + " не может прыгнуть на " + height + " метров");
    }
}
