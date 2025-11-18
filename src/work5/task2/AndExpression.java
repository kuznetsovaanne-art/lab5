package work5.task2;

/**
 * представляє операцію AND як базовий елемент
 */
public class AndExpression implements Expression {
    private Expression expr1;
    private Expression expr2;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    /**
     * передання значення даного параметра в context для зберігання
     * @param context
     * @return
     */
    @Override
    public boolean interpret(Context context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
