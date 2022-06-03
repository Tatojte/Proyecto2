package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class ABMFichaController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void switchToABMFicha() throws IOException {
        App.setRoot("abmficha");
    }
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}