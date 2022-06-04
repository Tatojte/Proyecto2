package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class OlvideController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    @FXML
    private void switchToPidocorreo() throws IOException {
        App.setRoot("pidocorreo");
    }
}
