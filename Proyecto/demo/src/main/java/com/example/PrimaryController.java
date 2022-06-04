package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void switchToCrearusu() throws IOException {
        App.setRoot("crearusu");
    }
    @FXML
    private void switchToOlvide() throws IOException {
        App.setRoot("olvide");
    }
}
