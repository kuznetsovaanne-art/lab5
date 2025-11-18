package work5.task1;

public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    /**
     * створення методу для збереження стану
     * @return
     */
    public String getState() {
        return state;
    }
}
