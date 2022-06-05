package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class HacerreportesController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void switchToHacerreportes() throws IOException {
        App.setRoot("emitereporte");
    }
}
