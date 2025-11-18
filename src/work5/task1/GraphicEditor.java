package work5.task1;
/**
 * комплексний елемент, що дозволяє зберігати і відновлювати стан графічних об'єктів
 */

import java.util.ArrayList;
import java.util.List;

public class GraphicEditor {
    private List<GraphicElement> elements = new ArrayList<>();

    /**
     * додавання елементу
     * @param element
     */
    public void addElement(GraphicElement element) {
        elements.add(element);
    }

    /**
     * зберігає стан елементів
     */
    public void saveState() {
        System.out.println("Збереження стану всіх елементів.");
        for (GraphicElement element : elements) {
            element.createMemento();
        }
    }

    /**
     * відновлює стан елементів
     */
    public void restoreState() {
        System.out.println("Відновлення стану всіх елементів.");
        for (GraphicElement element : elements) {
            element.restoreFromMemento();
        }
    }
}
