package Lesson_5.HomeWork.zoo;


import Lesson_5.HomeWork.Animal;

public class Dog extends Animal {

    public Dog(String name){
        super(name);
        this.maxRun = 500;
        this.maxSwim = 10;
        this.maxJump = 0.5;
    }

    @Override
    public void run(int length){
        if (length<=maxRun)
            System.out.println("Собака " + name + " пробежала " + length + " метров");
        else System.out.println("Собака " + name + " не может пробежать " + length + " метров");
    }

    @Override
    public void swim(int length) {
        if (length<=maxSwim)
            System.out.println("Собака " + name + " проплыла " + length + " метров");
        else System.out.println("Собака " + name + " не может проплыть " + length + " метров");
    }

    @Override
    public void jump(double height) {
        if (height<=maxJump)
            System.out.println("Собака " + name + " прыгнула на " + height + " метров");
        else System.out.println("Собака " + name + " не может прыгнуть на " + height + " метров");
    }
}
