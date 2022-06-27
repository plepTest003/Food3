package model;

public class Meat extends Food { //наследник класса Food.public class Meat extends Food  //наследник класса Food.
    public Meat(int amount, int price) {
        super(amount, price, false); // Конструктор принимает два входных параметра — количество и цену. И устанавливает для флага isVegetarian правильное значение.
        //отправляем через супер, аргументы в конструктор к классе родитель
        // можно сделать это и здесь, но это займет много места. Тут параметры и боди соответствуют конструктуру, это короткая передача данных.
    }
}
//В классах-наследниках нужно обязательно реализовать все абстрактные методы класса-родителя, но у нас тут их нет.
//Чтобы не дублировать код родительского класса, или суперкласса, используют
//ключевое слово super с точечной нотацией. Через него можно обратиться к полю
//или вызвать метод класса-родителя: