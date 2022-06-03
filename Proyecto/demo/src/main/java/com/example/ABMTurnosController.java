package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class ABMTurnosController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void switchToABMTurnos() throws IOException {
        App.setRoot("abmturnos");
    }
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}