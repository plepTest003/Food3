package service;

import model.Food;

public class ShoppingCart {
    private final Food[] foods; //поле — массив элементов из объектов типа Food

    public ShoppingCart(Food[] foods) { // конструктор с одним параметром — массивом элементов Food. С его помощью ты создашь объект корзины.
        this.foods = foods;
    }

    public double sumFoodPrice() {

        double sumPrice = 0;

        for (int i = 0; i < foods.length; i++) {
            sumPrice = sumPrice + foods[i].getTotalPrice();
        }
        return sumPrice;

    }

    public double sumDiscount() {
        double sumDiccountPrice = 0;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].getDiscount() != 0) {
                sumDiccountPrice = sumDiccountPrice + foods[i].getTotalDiscountAmount();
            }
        }
        return sumDiccountPrice;
    }

    public double sumVeg() {
        double sumVegetarianPrice = 0;

        for (int i = 0; i < foods.length; i++) {
            if (foods[i].isVegetarian()) {
                sumVegetarianPrice = sumVegetarianPrice + foods[i].getTotalPrice();
            }
        }
        return sumVegetarianPrice;

    }


}
