package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class ABMAutosController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void switchToABMAutos() throws IOException {
        App.setRoot("abmautos");
    }
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}