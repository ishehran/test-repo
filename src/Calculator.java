package src;

public class Calculator {
    int num1;
    int num2;
    String operator;

    void setNum1(int num1) {
        this.num1 = num1;
    }
    void setNum2(int num2) {
        this.num2 = num2;
    }
    void setOperator(String operator) {
        this.operator = operator;
    }
    int getNum1() {
        return num1;
    }
    int getNum2() {
        return num2;
    }
    String getOperator() {
        return operator;
    }

    
    double add(double a, int b) {
        return a + b;
    }
    double add(int a, double b) {
        return a + b;
    }
}

