package edu.pdx.homework;


import java.util.Collections;
import java.util.List;

public class AmusementCenterStore
{

  public List<ShoppingBasket> whatCanIBuyWith(double amountOfMoney) {
    ShoppingBasket basket = new ShoppingBasket();

    if (amountOfMoney >= 0.87) {
      basket.addToy(Toys.PINWHEEL);
    }

    return Collections.singletonList(basket);
  }
}
