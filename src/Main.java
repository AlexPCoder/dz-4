//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Клас з методом main
public class Main {
    public static void main(String[] args) {
        // Створення екземпляру другого класу
        MyClass myObject = new MyClass();

        // Виклик методу та виведення результату у консоль
        int value = myObject.printAndReturn();
        System.out.println("~~~ " + value + " ~~~");
    }
}

// Другий клас
class MyClass {
    // Поле з заданим значенням
    private int number = 13;

    // Метод, який друкує значення поля та повертає його
    public int printAndReturn() {
        System.out.println("---" + number + "---");
        return number;
    }
}
