
public class Expressions {

    public static Variable var(String name, int value) {
        //implement this method
        return new Variable(name, value);
    }

    public static Expression val(int value) {
        //implement this method
        return new Expression() {
            @Override
            public int evaluate() {
                return value;
            }

            @Override
            public String toExpressionString() {
                if (value < 0)
                    return "(" + value + ")";
                else return Integer.toString(value);
            }
        };
    }

    public static Expression sum(Expression... members) {
        //implement this method
        return new Expression() {
            @Override
            public int evaluate() {
                int result = 0;
                for (int i = 0; i < members.length; i++) {
                    result += members[i].evaluate();
                }
                return result;
            }

            @Override
            public String toExpressionString() {
                String result = "(";
                for (int i = 0; i < members.length - 1; i++) {
                    result += members[i].toExpressionString() + " + ";
                }
                result += members[members.length - 1].toExpressionString() + ")";
                return result;
            }
        };
    }

    public static Expression product(Expression... members) {
        //implement this method
        return new Expression() {
            @Override
            public int evaluate() {
                int result = 1;
                for (int i = 0; i < members.length; i++) {
                    result *= members[i].evaluate();
                }
                return result;
            }

            @Override
            public String toExpressionString() {
                String result = "(";
                for (int i = 0; i < members.length -1; i++) {
                    result += members[i].toExpressionString() + " * ";
                }
                result += members[members.length - 1].toExpressionString() + ")";
                return result;
            }
        };
    }

    public static Expression difference(Expression minuend, Expression subtrahend) {
        //implement this method
        return new Expression() {
            @Override
            public int evaluate() {
                return minuend.evaluate() - subtrahend.evaluate();
            }

            @Override
            public String toExpressionString() {
                return "(" + minuend.toExpressionString() + " - " + subtrahend.toExpressionString() + ")";
            }
        };
    }

    public static Expression fraction(Expression dividend, Expression divisor) {
        //implement this method
        return new Expression() {
            @Override
            public int evaluate() {
                return dividend.evaluate() / divisor.evaluate();
            }

            @Override
            public String toExpressionString() {
                return "("+ dividend.toExpressionString() + " / " + divisor.toExpressionString() + ")";
            }
        };
    }

}
