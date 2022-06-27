package model;


public abstract class Food implements Discountable { //астракный крас с полями. выделяем абстракцией самые важные свойства обьекта. остальное будет описано в класах наследниках.
    //в абстракном класе описываем основные характеристики, поля - количество, цена, вегатарианство.
    protected int amount; //поля доступны из класов потомков\наследниках
    protected double price; //поля
    protected boolean isVegetarian; //поля
    //у абстракного класса не может быть обьектов
    protected Food(int amount, int price, boolean isVegetarian) { //конструктор абстракного класа
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public double getTotalPrice() {
        if (amount < 0 || price < 0){
            return 0;
        }
        return price * amount;
    } //если у классов наследников одинаковая реализация, то можно вынести эти методы в абстракный класс. Метод внутри абстрактного класса работает
    //для всех наследников одинаково. это не астракные методы, их можно не @Override

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double getTotalDiscountAmount() {
        return (getTotalPrice() * getDiscount() / 100);
    }

}
