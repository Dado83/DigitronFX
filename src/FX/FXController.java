package FX;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXController implements Initializable{
	
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
	public void onClick(ActionEvent event) {
		String id = ((Button)event.getSource()).getId();
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
                    case "button0":
                        display.setText(display.getText() + "0");
                        break;
                    case "button1":
                        display.setText(display.getText() + "1");
                        break;
                    case "button2":
                        display.setText(display.getText() + "2");
                        break;
                    case "button3":
                        display.setText(display.getText() + "3");
                        break;
                    case "button4":
                        display.setText(display.getText() + "4");
                        break;
                    case "button5":
                        display.setText(display.getText() + "5");
                        break;
                    case "button6":
                        display.setText(display.getText() + "6");
                        break;
                    case "button7":
                        display.setText(display.getText() + "7");
                        break;
                    case "button8":
                        display.setText(display.getText() + "8");
                        break;
                    case "button9":
                        display.setText(display.getText() + "9");
                        break;
                    case "decimal":
                        display.setText(display.getText() + ".");
                        decimal.setDisable(true);;
                        break;
                    case "add":
                        if (operation.getOperand() == 'x') {
                            operation.add(Double.parseDouble("" + display.getText()), display);
                            decimal.setDisable(false);
                        } else {
                            result.fire();;
                            operation.add(Double.parseDouble("" + display.getText()), display);
                            decimal.setDisable(false);
                        }
                        break;
                    case "subtract":
                        if (operation.getOperand() == 'x') {
                            operation.subtract(Double.parseDouble("" + display.getText()), display);
                            decimal.setDisable(false);
                        } else {
                            result.fire();
                            operation.subtract(Double.parseDouble("" + display.getText()), display);
                            decimal.setDisable(false);
                        }
                        break;
                    case "multiply":
                        if (operation.getOperand() == 'x') {
                            operation.multiply(Double.parseDouble("" + display.getText()), display);
                            decimal.setDisable(false);
                        } else {
                            result.fire();
                            operation.multiply(Double.parseDouble("" + display.getText()), display);
                            decimal.setDisable(false);
                        }
                        break;
                    case "divide":
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
                    case "result":
                        BigDecimal bd = new BigDecimal(operation.opResult(Double.parseDouble("" + display.getText()), display));
                        bd = bd.setScale(2, RoundingMode.HALF_EVEN);
                        display.setText("" + bd);
                        decimal.setDisable(true);
                        equalsState = true;
                        //AC.performClick();
                        break;
                    case "negative":
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
	public void Proba(ActionEvent event) {
		String string = ((Button)event.getSource()).getId();
		display.setText(string);
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		operation = new Operations();
		
	}
}
