package geekbrains.lesson_3.homework;

import java.util.ArrayList;

public class BoxWithFruit<T extends Fruit> {
    private ArrayList<T> fruits;

    public BoxWithFruit() {
        this.fruits =  new ArrayList<>();
    }

    public void add(T fruit){
        this.fruits.add(fruit);
    }

    public int getWeightBox(){
        return !fruits.isEmpty() ? fruits.get(0).getWeight() * fruits.size() : 0;
    }
    public  boolean compare(BoxWithFruit<?> anotherBox){
        return this.getWeightBox() == anotherBox.getWeightBox();
    }

    public void shift(BoxWithFruit<T> anotherBox){
        for (int i = 0; i < this.fruits.size(); i++) {
            anotherBox.add(this.fruits.get(i));
            this.fruits.remove(i);
        }
    }
}
