package work5.task1;

/**
 * клас, що створює елемент Circle з атрибутами
 */
public class Circle implements GraphicElement {
    private String color;
    private String position;
    private int radius;

    public Circle(String color, String position, int radius) {
        this.color = color;
        this.position = position;
        this.radius = radius;
    }

    /**
     * надання елементу властивостей
     */
    @Override
    public void edit() {
        System.out.println("Метод edit для Circle. Колір: " + color + ", Позиція: " + position + ", Радіус: " + radius);
    }

    /**
     * створення знімку стану
     */
    @Override
    public void createMemento() {
        System.out.println("Створення знімка стану для Circle");
    }

    /**
     * відноалеення знімка стану
     */
    @Override
    public void restoreFromMemento() {
        System.out.println("Відновлення знімка стану для Circle");
    }
}
