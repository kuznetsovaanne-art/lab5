package work5.task2;

/**
 * Інтерфейс Expression визначає спільний метод interpret(), який використовують всі вирази
 */
public interface Expression {
    boolean interpret(Context context);
}
