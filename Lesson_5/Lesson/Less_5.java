package Lesson_5.Lesson;


import Lesson_5.Lesson.zoo.*;

public class Less_5 {
    public static void main(String[] args) {
        Cat cat = new Cat(2, "чёрный", "Мурзик");
//        cat.wolk();
//        cat.voice();
        Dog dog = new Dog(5, "серый", "Тузик");
//        dog.wolk();
//        dog.voice();
        Bird bird = new Bird(3, "Кеша", 50);
//        bird.wolk();
//        bird.voice();
        Parrot p = new Parrot(4, "Полли", 10);
//        p.voice();
//        p.voice();
        Snake s = new Snake(10, "Гадя", "рыжий");

        Animal[] zoo = {cat, dog, bird, p, s};

        for (int i=0; i<zoo.length; i++){
            zoo[i].voice();
            zoo[i].move();
        }
    }
}
