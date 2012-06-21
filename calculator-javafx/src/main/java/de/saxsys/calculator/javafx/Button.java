package de.saxsys.calculator.javafx;

public class Button extends javafx.scene.control.Button {

    public Button() {
        super();
        initialize();
    }

    public Button(final String arg0) {
        super(arg0);
        initialize();
    }

    private void initialize() {
        this.setMinWidth(30.0);
        this.setMinHeight(30.0);
    }

}
