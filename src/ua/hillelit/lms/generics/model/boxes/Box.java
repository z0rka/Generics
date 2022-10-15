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
    if (fruit == null) {
      return false;
    }

    fruitList.add(fruit);
    boxWeight += fruit.getWeight();
    return true;
  }

  public boolean add(T fruit, int amount) {
    if (fruit == null || amount <= 0) {
      return false;
    }

    for (int i = 0; i < amount; i++) {
      fruitList.add(fruit);
      boxWeight += fruit.getWeight();
    }
    return true;
  }

  public boolean compare(Box<?> box) {
    if (box == null) {
      return false;
    }

    return boxWeight == box.getWeight();
  }

  public boolean merge(Box<T> box) {
    if (box == null) {
      return false;
    }

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
