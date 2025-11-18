package work5.task1;
/**
 * клас для збереження і відновлення memento
 */
public class Caretaker {
    private Memento memento;

    /**
     * збереження Memento
     * @param originator
     */
    public void saveState(Originator originator) {
        memento = originator.createMemento();
    }

    /**
     * відновлення Memento
     * @param originator
     */
    public void restoreState(Originator originator) {
        originator.restoreState(memento);
    }
}
