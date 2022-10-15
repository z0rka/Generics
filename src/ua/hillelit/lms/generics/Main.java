package ua.hillelit.lms.generics;

import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Integer[] arr = {5, 2, 5, 1, 5, 3, 1, 6};

    List<Integer> list = toList(arr);

    for (Integer integer : list) {
      System.out.println(integer);
    }
  }

  public static <T> List<T> toList(T[] arr) {
    return Arrays.stream(arr).toList();
  }
}


