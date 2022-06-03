package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class ABMClientesController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void switchToABMClientes() throws IOException {
        App.setRoot("abmclientes");
    }
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}