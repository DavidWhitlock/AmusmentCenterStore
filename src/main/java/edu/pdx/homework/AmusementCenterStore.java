package edu.pdx.homework;


public class AmusementCenterStore
{

  public ShoppingBasket whatCanIBuyWith(double amountOfMoney) {
    ShoppingBasket basket = new ShoppingBasket();

    if (amountOfMoney >= 0.87) {
      basket.addToy(Toys.PINWHEEL);
    }

    return basket;
  }
}
