package Lesson_5.Lesson.zoo;


public class Parrot extends Bird{

    public Parrot(int age, String name, int height){
        super(age, name, height);
    }

    @Override
    public void voice(){
        System.out.println(this.getName() + " хочет печенье!");
    }
}
