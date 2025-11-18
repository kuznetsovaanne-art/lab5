package work5.task2;

/**
 * представляє константу як базовий елемент
 */
public class ConstantExpression implements Expression {
    private boolean value;

    public ConstantExpression(boolean value) {
        this.value = value;
    }

    /**
     * передання значення константи в context для зберігання
     * @param context
     * @return
     */
    @Override
    public boolean interpret(Context context) {
        return value;
    }
}
