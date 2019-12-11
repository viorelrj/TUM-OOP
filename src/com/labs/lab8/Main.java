package com.labs.lab8;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {
    Button button;
    TextField divisor;
    TextField divident;
    Label divisorLabel;
    Label dividentLabel;
    Label resultLabel;

    public static void main(){
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Calculator");

        button = new Button("Divide");
        button.setOnAction(this);

        divisorLabel = new Label("Divisor:");
        divisor = new TextField();
        dividentLabel = new Label("Divident:");
        divident = new TextField();
        resultLabel = new Label("Waiting");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(8);
        grid.setHgap(10);

        GridPane.setConstraints(divisorLabel, 0, 0);
        GridPane.setConstraints(divisor, 1, 0);
        GridPane.setConstraints(dividentLabel, 0, 1);
        GridPane.setConstraints(divident, 1, 1);
        GridPane.setConstraints(button, 1, 2);
        GridPane.setConstraints(resultLabel, 1, 3);

        grid.getChildren().addAll(divisorLabel, divisor, dividentLabel, divident, button, resultLabel);

        Scene scene = new Scene(grid, 320, 320);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        double result = 0;
        StringBuilder message = new StringBuilder();

        try {
            double divisorVal = Double.parseDouble(divisor.getText());
            double dividentVal = Double.parseDouble(divident.getText());

            result = divisorVal / dividentVal;
            message.append(Double.toString(result));

            if (dividentVal == 0) {throw new ArithmeticException();}
            if (dividentVal == 13) {throw new Unlucky();}

        } catch (ArithmeticException e) {
            message.setLength(0);
            message.append("We don't divide by 0 in this universe\n");

        } catch(NumberFormatException e) {
            message.setLength(0);

            if (!isNumber((divident))) {
                message.append("Divident is not a number.\n");
            }
            if (!isNumber((divisor))) {
                message.append(("Divisor is not a number.\n"));
            }

        } catch (Unlucky e) {

            message.setLength(0);
            message.append("So unlucky today\n");

        } finally {

            resultLabel.textProperty().setValue(message.toString());
        }
    }

    private boolean isNumber(TextField input) {
        try {
            double val = Double.parseDouble(input.getText());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
