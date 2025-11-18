package work5;

public class Main {
    public static void main(String[] args) {
        // Запуск Завдання 1: Векторний редактор
        System.out.println("Запуск Завдання 1: Векторний редактор");
        task1();

        // Запуск Завдання 2: Система для розбору логічних виразів
        System.out.println("Запуск Завдання 2: Система для розбору логічних виразів");
        task2();
    }

    public static void task1() {
        // Створення елементів для векторного редактора
        work5.task1.GraphicEditor editor = new work5.task1.GraphicEditor();

        work5.task1.GraphicElement circle = new work5.task1.Circle("Red", "0,0", 5);
        work5.task1.GraphicElement triangle = new work5.task1.Triangle("Blue", "1,1", 10);
        work5.task1.GraphicElement rectangle = new work5.task1.Rectangle("Green", "2,2", 15, 20);

        editor.addElement(circle);
        editor.addElement(triangle);
        editor.addElement(rectangle);

        // Збереження та відновлення стану
        editor.saveState();
        editor.restoreState();
    }

    public static void task2() {
        // Створення контексту для логічних виразів
        work5.task2.Context context = new work5.task2.Context();
        context.setValue("x", true);
        context.setValue("y", false);
        context.setValue("z", true);

        // Створення виразу (x AND y) OR (NOT z)
        work5.task2.Expression expression = new work5.task2.OrExpression(
                new work5.task2.AndExpression(new work5.task2.VariableExpression("x"), new work5.task2.VariableExpression("y")),
                new work5.task2.NotExpression(new work5.task2.VariableExpression("z"))
        );

        // Обчислення значення виразу
        System.out.println("Вираз (x AND y) OR (NOT z) має значення: " + expression.interpret(context));
    }
}