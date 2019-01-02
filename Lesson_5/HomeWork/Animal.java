package Lesson_5.HomeWork;


public abstract class Animal {

    protected String name;
    protected int maxRun;
    protected int maxSwim;
    protected double maxJump;

    protected Animal(String name){this.name = name;}

    public abstract void run(int length);
    public abstract void swim(int length);
    public abstract void jump(double height);

}
