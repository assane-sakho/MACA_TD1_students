package td1.refractor.api.general;

import static td1.refractor.api.general.Meat.MeatType.*;
import static td1.refractor.api.general.Restaurant.MeatSize.*;
import static td1.refractor.api.general.Restaurant.MenuType.*;
import static td1.refractor.api.general.Restaurant.Product_Type.*;
import static td1.refractor.api.general.Sauce.SauceType.*;

public class BigBurger extends Restaurant {
    public BigBurger(int w1, int w2, int w3, int w4, int w5, int w6, int w7) {
        super(w1, w2, w3, w4, w5, w6, w7);
        setMenus();
    }

    public void setMenus() {
        menus.put(
                MEAT_MENU,
                new Menu("BigMarcel", this)
                        .addProduct(new Meat(BEEF, meatWeight.get(BIG)))
                        .addProduct(new Sauce(BURGER, productsWeight.get(SAUCE)))
                        .addProduct(new DeepFriedOnions(productsWeight.get(ONION)))
                        .addProduct(new Tomato(productsWeight.get(CHEESE))));
        menus.put(FISH_MENU,
                new Menu("FiletO'Poisson", this)
                        .addProduct(new Meat(WHITEFISH, meatWeight.get(AVERAGE)))
                        .addProduct(new Sauce(BEARNAISE, productsWeight.get(SAUCE))));
        menus.put(CHEESE_MENU,
                new Menu("MaxeeCheesee", this)
                        .addProduct(new Meat(BEEF, meatWeight.get(AVERAGE)))
                        .addProduct(new Cheddar(productsWeight.get(CHEESE)))
                        .addProduct(new DeepFriedOnions(productsWeight.get(ONION))));
        menus.put(OWN_STYLE_MENU,
                new Menu("Own style", this));
    }
}
