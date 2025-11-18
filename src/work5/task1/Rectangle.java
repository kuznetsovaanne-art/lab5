package work5.task1;

/**
 * клас, що створює елемент Circle з атрибутами
 */
public class Rectangle implements GraphicElement {
    private String color;
    private String position;
    private int width;
    private int height;

    public Rectangle(String color, String position, int width, int height) {
        this.color = color;
        this.position = position;
        this.width = width;
        this.height = height;
    }

    /**
     * надання елементу властивостей
     */
    @Override
    public void edit() {
        System.out.println("Метод edit для Rectangle. Колір: " + color + ", Позиція: " + position + ", Ширина: " + width + ", Висота: " + height);
    }

    /**
     * створення знімка стану
     */
    @Override
    public void createMemento() {
        System.out.println("Створення знімка стану для Rectangle");
    }

    /**
     * відновлення знімку стану
     */
    @Override
    public void restoreFromMemento() {
        System.out.println("Відновлення знімка стану для Rectangle");
    }
}
