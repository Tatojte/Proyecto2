package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class ABMConveniosController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void switchToABMConvenios() throws IOException {
        App.setRoot("abmconvenios");
    }
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}