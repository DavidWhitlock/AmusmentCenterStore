package edu.pdx.homework;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;

public class AmusementCenterStoreTest {

    @Test
    public void makeSureThatWeCanCallHamcrest()
    {
        assertThat(true, equalTo(true));
    }

  @Test
  public void miaCannotBuyAnythingWhenSheHasNoMoney() {
    AmusementCenterStore store = new AmusementCenterStore();
    ShoppingBasket basket = store.whatCanIBuyWith(0.0);
    assertThat(basket.isEmpty(), equalTo(true));
  }

  @Test
  public void miaCannotBuyAnythingWhenSheHas50Cents() {
    AmusementCenterStore store = new AmusementCenterStore();
    ShoppingBasket basket = store.whatCanIBuyWith(0.50);
    assertThat(basket.isEmpty(), equalTo(true));
  }

  @Test
  public void miaCanBuyThePinwheelWhenSheHas87Cents() {
    AmusementCenterStore store = new AmusementCenterStore();
    ShoppingBasket basket = store.whatCanIBuyWith(0.87);
    assertThat(basket.isEmpty(), equalTo(false));
    assertThat(basket.getToys(), hasItem(Toys.PINWHEEL));
  }
}
