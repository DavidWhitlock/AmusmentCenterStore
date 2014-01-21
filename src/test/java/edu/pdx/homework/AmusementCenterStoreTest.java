package edu.pdx.homework;

import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static edu.pdx.homework.Toys.PINWHEEL;
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
    List<ShoppingBasket> baskets = store.whatCanIBuyWith(0.0);
    assertThat(baskets.size(), equalTo(1));
    assertThat(baskets.get(0).isEmpty(), equalTo(true));
  }

  @Test
  public void miaCannotBuyAnythingWhenSheHas50Cents() {
    AmusementCenterStore store = new AmusementCenterStore();
    List<ShoppingBasket> baskets = store.whatCanIBuyWith(0.50);
    assertThat(baskets.size(), equalTo(1));
    assertThat(baskets.get(0).isEmpty(), equalTo(true));
  }

  @Test
  public void miaCanBuyThePinwheelWhenSheHas87Cents() {
    AmusementCenterStore store = new AmusementCenterStore();
    List<ShoppingBasket> baskets = store.whatCanIBuyWith(0.87);
    assertThat(baskets.size(), equalTo(1));

    ShoppingBasket basket = baskets.get(0);
    assertThat(basket.isEmpty(), equalTo(false));
    assertThat(basket.getToys(), hasItem(PINWHEEL));
  }

  @Ignore
  @Test
  public void miaCanBuyAPinwheelOrAWhistleWith1Dollar() {
    AmusementCenterStore store = new AmusementCenterStore();
    List<ShoppingBasket> baskets = store.whatCanIBuyWith(1.00);
    assertThat(baskets.size(), equalTo(2));

    assertThat(baskets, hasItem(ShoppingBasket.with(1, PINWHEEL)));
    assertThat(baskets, hasItem(ShoppingBasket.with(1, Toys.WHISTLE)));
  }
}
