import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application {

    // Text field to display the result
    private TextField display;

    // Variables to store the first and second numbers and the operator
    private double firstNumber;
    private double secondNumber;
    private String operator;

    @Override
    public void start(Stage stage) {
        // Create the display field
        display = new TextField();
        display.setAlignment(Pos.CENTER_RIGHT);
        display.setEditable(false);

        // Create the buttons
        Button btn0 = new Button("0");
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");
        Button btnDot = new Button(".");
        Button btnEqual = new Button("=");
        Button btnPlus = new Button("+");
        Button btnMinus = new Button("-");
        Button btnMultiply = new Button("*");
        Button btnDivide = new Button("/");
        Button btnClear = new Button("C");

        // Add event handlers to the buttons
        btn0.setOnAction(event -> addToDisplay("0"));
        btn1.setOnAction(event -> addToDisplay("1"));
        btn2.setOnAction(event -> addToDisplay("2"));
        btn3.setOnAction(event -> addToDisplay("3"));
        btn4.setOnAction(event -> addToDisplay("4"));
        btn5.setOnAction(event -> addToDisplay("5"));
        btn6.setOnAction(event -> addToDisplay("6"));
        btn7.setOnAction(event -> addToDisplay("7"));
        btn8.setOnAction(event -> addToDisplay("8"));
        btn9.setOnAction(event -> addToDisplay("9"));
        btnDot.setOnAction(event -> addToDisplay("."));
        btnEqual.setOnAction(event -> {
            secondNumber = Double.parseDouble(display.getText());
            display.setText(String.valueOf(calculateResult()));
        });
        btnPlus.setOnAction(event -> {
            operator = "+";
            firstNumber = Double.parseDouble(display.getText());
            display.setText("");
        });
        btnMinus.set
