package edu.pdx.homework;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {

  private List<Toys> toys = new ArrayList<Toys>();

  public boolean isEmpty() {
    return toys.isEmpty();
  }

  public List<Toys> getToys() {
    return toys;
  }

  public void addToy(Toys toy) {
    toys.add(toy);
  }
}
