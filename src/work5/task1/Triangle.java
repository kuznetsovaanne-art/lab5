package work5.task1;

public class Triangle implements GraphicElement {
    private String color;
    private String position;
    private int size;

    public Triangle(String color, String position, int size) {
        this.color = color;
        this.position = position;
        this.size = size;
    }

    /**
     * надання елементу властивостей
     */
    @Override
    public void edit() {
        System.out.println("Метод edit для Triangle. Колір: " + color + ", Позиція: " + position + ", Розмір: " + size);
    }

    /**
     * створення знімка стану
     */
    @Override
    public void createMemento() {
        System.out.println("Створення знімка стану для Triangle");
    }

    /**
     * відновлення знімка стану
     */
    @Override
    public void restoreFromMemento() {
        System.out.println("Відновлення знімка стану для Triangle");
    }
}
