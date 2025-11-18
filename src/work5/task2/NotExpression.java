package work5.task2;

/**
 * представляє операцію NOT як базовий елемент
 */
public class NotExpression implements Expression {
    private Expression expr;

    public NotExpression(Expression expr) {
        this.expr = expr;
    }

    /**
     * передання значення даного параметра в context для зберігання
     * @param context
     * @return
     */
    @Override
    public boolean interpret(Context context) {
        return !expr.interpret(context);
    }
}
