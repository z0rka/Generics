package ua.hillelit.lms.generics.model;

import ua.hillelit.lms.generics.model.boxes.Box;
import ua.hillelit.lms.generics.model.fruits.Apple;
import ua.hillelit.lms.generics.model.fruits.Orange;

public class BoxesFruitsTest {

  public static void main(String[] args) {
    Box<Apple> box = new Box<>();
    box.add(new Apple());
    box.add(new Apple(), 5);

    Box<Orange> box1 = new Box<>();
    box1.add(new Orange(), 4);

    Box<Apple> box2 = new Box<>();
    box2.add(new Apple(), 3);

    System.out.println(box.getWeight());
    System.out.println(box.compare(box1));
    System.out.println(box.compare(box2));
    System.out.println(box.merge(box2));
    
  }
}
