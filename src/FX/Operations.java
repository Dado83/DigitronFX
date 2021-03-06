package FX;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Dado on 27.12.2016.
 */

public class Operations {
    private double numA = 0;
    private char operand = 'x';

    public void setDouble(){
        numA = 0;
    }

    public char getOperand(){
        return operand;
    }

    public void add(double i, TextField t, Label l) {
        numA = i;
        BigDecimal bd = new BigDecimal(numA);
        bd = bd.setScale(2, RoundingMode.HALF_EVEN);
        numA = bd.doubleValue();
        operand = '+';
        l.setText("" + numA);
        t.setText("");
    }

    public void subtract(double i, TextField t, Label l) {
        numA = i;
        BigDecimal bd = new BigDecimal(numA);
        bd = bd.setScale(2, RoundingMode.HALF_EVEN);
        numA = bd.doubleValue();
        operand = '-';
        l.setText("" + numA);
        t.setText("");
    }

    public void multiply(double i, TextField t, Label l) {
        numA = i;
        BigDecimal bd = new BigDecimal(numA);
        bd = bd.setScale(2, RoundingMode.HALF_EVEN);
        numA = bd.doubleValue();
        operand = '*';
        l.setText("" + numA);
        t.setText("");
    }

    public void divide(double i, TextField t, Label l) {
        numA = i;
        BigDecimal bd = new BigDecimal(numA);
        bd = bd.setScale(2, RoundingMode.HALF_EVEN);
        numA = bd.doubleValue();
        operand = '/';
        l.setText("" + numA);
        t.setText("");
    }

    public double squareRoot(double i, TextField l) {
        numA = Math.sqrt(i);
        BigDecimal bd = new BigDecimal(numA);
        bd = bd.setScale(2, RoundingMode.HALF_EVEN);
        numA = bd.doubleValue();
        return numA;
    }

    public double opResult(double i, TextField t, Label l) {

        switch (operand) {
            case '+':
                numA += i;
                l.setText("" + numA);
                break;
            case '-':
                numA -= i;
                l.setText("" + numA);
                break;
            case '*':
                numA *= i;
                l.setText("" + numA);
                break;
            case '/':
                numA /= i;
                l.setText("" + numA);
                break;
            default:
                break;
        }
        if (operand=='x') {

        } else {
            BigDecimal bd = new BigDecimal(numA);
            bd = bd.setScale(2, RoundingMode.HALF_EVEN);
            operand = 'x';
        }
        return numA;
    }
}
