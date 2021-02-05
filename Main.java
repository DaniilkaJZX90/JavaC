package geekbrains.lesson_3.homework;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        // Задание 1.
        int [] arr = new int[]{1, 2};
        change(arr);


        //Задание 2.
        BoxWithFruit<Apple> appleBoxWithFruit = new BoxWithFruit<>();
        appleBoxWithFruit.add(new Apple(1));
        appleBoxWithFruit.add(new Apple(1));
        appleBoxWithFruit.add(new Apple(1));
        appleBoxWithFruit.add(new Apple(1));

        BoxWithFruit<Apple> appleBoxWithFruit2 = new BoxWithFruit<>();
        appleBoxWithFruit2.add(new Apple(1));
        appleBoxWithFruit2.add(new Apple(1));
        appleBoxWithFruit2.add(new Apple(1));
        appleBoxWithFruit2.add(new Apple(1));
        appleBoxWithFruit2.add(new Apple(1));

        System.out.println( appleBoxWithFruit.getWeightBox());
        System.out.println( appleBoxWithFruit2.getWeightBox());
        System.out.println(appleBoxWithFruit.compare(appleBoxWithFruit2));
        appleBoxWithFruit.shift(appleBoxWithFruit2);
    }

    public static void change(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println(Arrays.toString(arr));

    }
}
