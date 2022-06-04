package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class ReportesController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void switchToHacereportes() throws IOException {
        App.setRoot("emitereporte");
    }
}
