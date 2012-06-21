package de.saxsys.calculator.javafx;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        launch(args);
    }

    @Override
    public void start(final Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX Calculator");

        final GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        final Label display = new Label("0");
        display.setMinHeight(30.0);
        GridPane.setHalignment(display, HPos.RIGHT);
        grid.add(display, 0, 0, 4, 1);

        final Button buttonPlus = new Button("+");
        grid.add(buttonPlus, 0, 1);

        final Button buttonMinus = new Button("-");
        grid.add(buttonMinus, 1, 1);

        final Button buttonDivide = new Button("/");
        grid.add(buttonDivide, 2, 1);

        final Button buttonMultiply = new Button("*");
        grid.add(buttonMultiply, 3, 1);

        final Button buttonC = new Button("C");
        buttonC.setMinHeight(70.0);
        grid.add(buttonC, 3, 2, 1, 2);

        final Button buttonEnter = new Button("=");
        buttonEnter.setMaxHeight(70.0);
        grid.add(buttonEnter, 3, 4, 1, 2);

        final Button button0 = new Button("0");
        button0.setMinWidth(70.0);
        grid.add(button0, 0, 5, 2, 1);

        final Button button1 = new Button("1");
        grid.add(button1, 0, 4);

        final Button button2 = new Button("2");
        grid.add(button2, 1, 4);

        final Button button3 = new Button("3");
        grid.add(button3, 2, 4);

        final Button button4 = new Button("4");
        grid.add(button4, 0, 3);

        final Button button5 = new Button("5");
        grid.add(button5, 1, 3);

        final Button button6 = new Button("6");
        grid.add(button6, 2, 3);

        final Button button7 = new Button("7");
        grid.add(button7, 0, 2);

        final Button button8 = new Button("8");
        grid.add(button8, 1, 2);

        final Button button9 = new Button("9");
        grid.add(button9, 2, 2);

        final Button buttonDot = new Button(".");
        grid.add(buttonDot, 2, 5);

        final Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
