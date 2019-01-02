package Lesson_5.HomeWork.zoo;


import Lesson_5.HomeWork.Animal;

public class Horse extends Animal {

    public Horse(String name){
        super(name);
        this.maxRun = 1500;
        this.maxSwim = 100;
        this.maxJump = 3;
    }

    @Override
    public void run(int length){
        if (length<=maxRun)
            System.out.println("Лошадь " + name + " пробежала " + length + " метров");
        else System.out.println("Лошадь " + name + " не может пробежать " + length + " метров");
    }

    @Override
    public void swim(int length) {
        if (length<=maxSwim)
            System.out.println("Лошадь " + name + " проплыла " + length + " метров");
        else System.out.println("Лошадь " + name + " не может проплыть " + length + " метров");
    }

    @Override
    public void jump(double height) {
        if (height<=maxJump)
            System.out.println("Лошадь " + name + " прыгнула на " + height + " метров");
        else System.out.println("Лошадь " + name + " не может прыгнуть на " + height + " метров");
    }

}
