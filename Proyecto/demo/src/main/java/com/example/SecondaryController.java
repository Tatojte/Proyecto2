package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    @FXML
    private void switchToABMClientes() throws IOException {
        App.setRoot("abmclientes");
    }
    @FXML
    private void switchToABMConvenios() throws IOException {
        App.setRoot("abmconvenios");
    }
    @FXML
    private void switchToABMAutos() throws IOException {
        App.setRoot("abmautos");
    }
    @FXML
    private void switchToABMMecanicos() throws IOException {
        App.setRoot("abmmecanicos");
    }
    @FXML
    private void switchToABMAgenda() throws IOException {
        App.setRoot("abmagenda");
    }
    @FXML
    private void switchToABMTurnos() throws IOException {
        App.setRoot("abmturnos");
    }
    @FXML
    private void switchToABMFicha() throws IOException {
        App.setRoot("abmficha");
    }
    @FXML
    private void switchToReportes() throws IOException {
        App.setRoot("reportes");
    }
}
