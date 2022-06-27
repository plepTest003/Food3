package model;

import model.Food;
import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {
    String colour; //добавляем поле которого нету в родительском абстракном классе, в отличии от других полей.

    public Apple(int amount, int price, String colour) {
        super(amount, price, true);//вызов конструктора суперкласса с три параметра: количество, цену и цвет яблок — и устанавливает флаг isVegetarian.
        this.colour = colour; //дописываем переназначение, которого нет в абстракном классе
    }

    @Override
    public double getDiscount() {
        if (colour.equals(Colour.RED_COLOR)) {
            return Discount.DISCOUNT_FOR_RED_APPLES;
        }
        return Discount.NO_DISCOUNT;
    }
}
