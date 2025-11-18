package work5.task2;

/**
 * представляє змінну як базовий елемент
 */
public class VariableExpression implements Expression {
    private String variable;

    public VariableExpression(String variable) {
        this.variable = variable;
    }

    /**
     * передання значення змінної в context для зберігання
     * @param context
     * @return
     */
    @Override
    public boolean interpret(Context context) {
        return context.getValue(variable);
    }
}
