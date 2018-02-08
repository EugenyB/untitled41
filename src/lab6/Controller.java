package lab6;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.util.Scanner;

public class Controller {

    @FXML
    private TextField field;

    public void exit(ActionEvent actionEvent) {
//        System.exit(0);
        Platform.exit();
    }

    public void about(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Про програму");
        alert.setContentText("Наша класна програма");
//        alert.setHeaderText("Інформація про програму");
        alert.setHeaderText(null);
        alert.show();
    }

    public void calc(ActionEvent actionEvent) {
        String text = field.getText();
        Scanner scanner = new Scanner(text);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a + b;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sum");
        alert.setHeaderText(null);
        alert.setContentText(
                String.format("%d + %d = %d", a, b, c));
        alert.show();
    }
}
