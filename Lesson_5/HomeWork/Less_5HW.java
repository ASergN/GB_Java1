package Lesson_5.HomeWork;


import Lesson_5.HomeWork.zoo.Bird;
import Lesson_5.HomeWork.zoo.Cat;
import Lesson_5.HomeWork.zoo.Dog;
import Lesson_5.HomeWork.zoo.Horse;

public class Less_5HW {
    public static void main(String[] args) {
        Dog dog = new Dog("Чарли");
        Horse horse = new Horse("Дик");
        Bird bird = new Bird("Кеша");
        Cat cat = new Cat("Мурзик");

        dog.run(100);
        dog.run(1000);
        dog.swim(5);
        dog.swim(20);
        dog.jump(0.1);
        dog.jump(1);

        horse.run(100);
        horse.run(10000);
        horse.swim(5);
        horse.swim(200);
        horse.jump(0.1);
        horse.jump(10);

        bird.run(1);
        bird.run(100);
        bird.swim(1);
        bird.swim(200);
        bird.jump(0.1);
        bird.jump(10);

        cat.run(100);
        cat.run(10000);
        cat.swim(1);
        cat.swim(200);
        cat.jump(0.1);
        cat.jump(10);
    }
}
