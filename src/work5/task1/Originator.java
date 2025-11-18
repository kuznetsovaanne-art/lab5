package work5.task1;

/**
 * клас, що створює об'єкт Memento для збереження і відновлення стану
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    /**
     * метод для створення знімку стану елементів
     * @return
     */
    public Memento createMemento() {
        return new Memento(state);
    }

    /**
     * метод для відновленгя стану елементів
     * @param memento
     */
    public void restoreState(Memento memento) {
        state = memento.getState();
    }
}
