import model.Meat;
import model.Food;
import model.Apple;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100); //создаем обьекты. Черех параметр передаем данные конструктору в meat классе и.
        Food redApple = new Apple(10, 50, "red");
        Food greenApple = new Apple(8, 60, "green");

        Food[] foods = {meat, redApple, greenApple}; //обьявляем и наполняем массив, список
        ShoppingCart shoppingCart = new ShoppingCart(foods); //Создаем новый обьект через конструктор в классе shoppingCart
        System.out.println("Общая сумма всех товаров: " + shoppingCart.sumFoodPrice()); //методы, совершаем едйствие над обьектом созданым из конструктора
        System.out.println("Общая сумма  скидки для всей корзины: " + shoppingCart.sumDiscount());
        System.out.println("Общая сумма всех вегетарианских продуктов: " + shoppingCart.sumVeg());

    }
}
