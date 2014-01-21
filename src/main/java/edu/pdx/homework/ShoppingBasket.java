package edu.pdx.homework;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {

  private final List<Toys> toys = new ArrayList<Toys>();

  public boolean isEmpty() {
    return toys.isEmpty();
  }

  public List<Toys> getToys() {
    return toys;
  }

  public void addToy(Toys toy) {
    toys.add(toy);
  }

  public static ShoppingBasket with(int numberOfToys, Toys toy) {
    ShoppingBasket basket = new ShoppingBasket();

    for (int i = 0; i < numberOfToys; i++) {
      basket.addToy(toy);
    }

    return basket;
  }

  @Override
  public String toString() {
    return "A ShoppingBasket with " + toys;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof ShoppingBasket)) {
      return false;
    }

    ShoppingBasket other = (ShoppingBasket) obj;
    return this.getToys().equals(other.getToys());
  }
}
