public class Variable implements Expression {
    private String name;
    private int value;

    public Variable(String name, int value) {
        this.name=name;
        this.value = value;
        //implement this method
    }

    public void setValue(int value) {
        //implement this method
        this.value = value;
    }

    @Override
    public int evaluate() {
        //implement this method
        return this.value;
    }

    @Override
    public String toExpressionString() {
        //implement this method
        return this.name;
    }
}
