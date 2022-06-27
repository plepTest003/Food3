package model;

import model.constants.Discount;

public interface Discountable {
    default double getDiscount() { //Интерфейс Discountable c единственным методом getDiscount. Он возвращает размер скидки — вещественное число.
        return Discount.NO_DISCOUNT;
    }
}
