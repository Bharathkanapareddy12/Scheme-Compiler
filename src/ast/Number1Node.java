package ast;

public class Number1Node extends value implements ASTNode {
    private int intValue;
    private double floatValue; // Using double for flexibility

    public Number1Node(String value) {
        try {
            this.intValue = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            // Parsing as integer failed, try parsing as double
            this.floatValue = Double.parseDouble(value);
        }
    }

    @Override
    public void print() {
        if (isInteger()) {
            System.out.println("Integer Number: " + intValue);
        } else {
            System.out.println("Float Number: " + floatValue);
        }
    }

    private boolean isInteger() {
        return floatValue == 0.0; // If floatValue is zero, it's an integer
    }
}