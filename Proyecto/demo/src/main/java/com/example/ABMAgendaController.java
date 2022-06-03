package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class ABMAgendaController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void switchToABMAgenda() throws IOException {
        App.setRoot("abmmagenda");
    }
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}