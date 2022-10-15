package ua.hillelit.lms.generics.model.boxes;

import java.util.LinkedList;
import java.util.List;
import ua.hillelit.lms.generics.model.fruits.Fruit;

public class Box<T extends Fruit> {

  private final List<T> fruitList = new LinkedList<>();
  private float boxWeight = 0;

  public Box() {
  }

  public Box(T fruit) {
    this.add(fruit);
  }

  public boolean add(T fruit) {
    fruitList.add(fruit);
    boxWeight += fruit.getWeight();
    return true;
  }

  public boolean add(T fruit, int amount) {
    for (int i = 0; i < amount; i++) {
      fruitList.add(fruit);
      boxWeight += fruit.getWeight();
    }
    return true;
  }

  public boolean compare(Box<?> box) {
    return boxWeight == box.getWeight();
  }

  public boolean merge(Box<T> box) {
    fruitList.addAll(box.getFruitList());
    box.getFruitList().clear();
    box.boxWeight = 0;
    return true;
  }

  public List<T> getFruitList() {
    return fruitList;
  }

  public float getWeight() {
    return boxWeight;
  }
}
