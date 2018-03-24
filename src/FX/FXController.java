package FX;

import java.awt.TextField;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class FXController {
	
	Operations operation;
	private boolean equalsState;
	
	@FXML
	private Button button1;
	@FXML
	private Button button2;
	@FXML
	private Button button3;
	@FXML
	private Button button4;
	@FXML
	private Button button5;
	@FXML
	private Button button6;
	@FXML
	private Button button7;
	@FXML
	private Button button8;
	@FXML
	private Button button9;
	@FXML
	private Button button0;
	@FXML
	private Button multiply;
	@FXML
	private Button divide;
	@FXML
	private Button add;
	@FXML
	private Button subtract;
	@FXML
	private Button decimal;
	@FXML
	private Button result;
	@FXML
	private Button negative;
	@FXML
	private TextField display;
	
	@FXML
	public void onClick(Button b) {
		String id = b.getId();
        try {
           /* if (equalsState) {
                disp.setText("");
                equalsState = false;
            } else {

            }*/
            if (display.getText().equals("NO DATA")) {
            	display.setText("");
            }
                switch (id) {
                    case "0":
                            if (display.getText().equals("")) {
                            	display.setText("");
                            } else {
                            	display.setText(display.getText() + "0");
                            }
                        break;
                    case "1":

                        display.setText(display.getText() + "1");
                        break;
                    case "2":
                        display.setText(display.getText() + "2");
                        break;
                    case "3":
                        display.setText(display.getText() + "3");
                        break;
                    case "4":
                        display.setText(display.getText() + "4");
                        break;
                    case "5":
                        display.setText(display.getText() + "5");
                        break;
                    case "6":
                        display.setText(display.getText() + "6");
                        break;
                    case "7":
                        display.setText(display.getText() + "7");
                        break;
                    case "8":
                        display.setText(display.getText() + "8");
                        break;
                    case "9":
                        display.setText(display.getText() + "9");
                        break;
                    case ".":
                        display.setText(display.getText() + ".");
                        decimal.setDisable(true);;
                        break;
                    case "+":
                        if (operation.getOperand() == 'x') {
                            operation.add(Double.parseDouble("" + display.getText()), display);
                            decimal.setDisable(false);
                        } else {
                            result.fire();;
                            operation.add(Double.parseDouble("" + display.getText()), display);
                            decimal.setDisable(false);
                        }
                        break;
                    case "-":
                        if (operation.getOperand() == 'x') {
                            operation.subtract(Double.parseDouble("" + display.getText()), display);
                            decimal.setDisable(false);
                        } else {
                            result.fire();
                            operation.subtract(Double.parseDouble("" + display.getText()), display);
                            decimal.setDisable(false);
                        }
                        break;
                    case "x":
                        if (operation.getOperand() == 'x') {
                            operation.multiply(Double.parseDouble("" + display.getText()), display);
                            decimal.setDisable(false);
                        } else {
                            result.fire();
                            operation.multiply(Double.parseDouble("" + display.getText()), display);
                            decimal.setDisable(false);
                        }
                        break;
                    case "/":
                        if (operation.getOperand() == 'x') {
                            operation.divide(Double.parseDouble("" + display.getText()), display);
                            decimal.setDisable(false);
                        } else {
                            result.fire();
                            operation.divide(Double.parseDouble("" + display.getText()), display);
                            decimal.setDisable(false);
                        }
                        break;
                    case "c":
                        if (display.getText().equals("")) {

                        } else {
                            display.setText((String) display.getText().subSequence(0, display.getText().length() - 1));
                        }
                        break;
                    case "ac":
                        display.setText("");
                        operation.setDouble();
                        decimal.setDisable(false);
                        break;
                    case "=":
                        BigDecimal bd = new BigDecimal(operation.opResult(Double.parseDouble("" + display.getText()), display));
                        bd = bd.setScale(2, RoundingMode.HALF_EVEN);
                        display.setText("" + bd);
                        decimal.setDisable(true);
                        equalsState = true;
                        //AC.performClick();
                        break;
                    case "neg":
                        display.setText("" + Double.parseDouble("" + display.getText()) * -1);
                        break;
                    case "root":
                        //BigDecimal bdR = new BigDecimal(m.squareRoot(Double.parseDouble("" + disp.getText()), pastOp, disp));
                        //bdR = bdR.setScale(2, BigDecimal.ROUND_HALF_EVEN);
                        display.setText("" + operation.squareRoot(Double.parseDouble("" + display.getText()), display));
                        decimal.setDisable(false);
                        break;
                    default:
                        break;
                }
            }catch(NumberFormatException e){
                display.setText("NO DATA");
            }

        }

	
	@FXML
	public void initialize() {
		operation = new Operations();
	}
}
