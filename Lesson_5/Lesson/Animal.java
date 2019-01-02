package Lesson_5.Lesson;


public abstract class Animal {

    private int age;
    private String color;
    private String name;

    protected Animal(int age, String color, String name){
        this.age = age;
        this.color = color;
        this.name = name;
    }

    protected Animal(int age, String name){
        this.age = age;
        this.name = name;
        this.color = "белый";
    }

    public void wolk(){
        System.out.println(this.color + " " + this.name + " " + this.age + " лет отроду пошел прогуляться");
    }

    public void voice(){
        System.out.println(this.name + " открывает пасть...");
    }

    public  abstract void move();

    protected String getColor(){
        return this.color;
    }

    protected String getName(){
        return this.name;
    }
}
