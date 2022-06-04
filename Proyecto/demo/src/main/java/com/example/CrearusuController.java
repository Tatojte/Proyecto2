package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class CrearusuController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void switchToConfirmaalta() throws IOException {
        App.setRoot("confirmaalta");
    }
}
