package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class ABMMecanicosController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void switchToABMMecanicos() throws IOException {
        App.setRoot("abmmecanicos");
    }
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}