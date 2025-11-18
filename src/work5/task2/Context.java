package work5.task2;
/**
 * об'єкт що містить поточний стан вхідних даних і зберігає інформацію
 */

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<String, Boolean> variables = new HashMap<>();

    /**
     * встановлення значення змінної в контексті
     * @param variable
     * @param value
     */
    public void setValue(String variable, boolean value) {
        variables.put(variable, value);
    }

    /**
     * отримання значення змінної з контексту
     * @param variable
     * @return
     */
    public boolean getValue(String variable) {
        return variables.get(variable);
    }
}
