package com.assignment.tictactoe.service.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class loginController {
    @FXML
    private Pane login_panel;

    @FXML
    void start_btn_onAction(ActionEvent event) throws IOException {
        login_panel.getChildren().clear();
        AnchorPane load = FXMLLoader.load(getClass().getResource("/view/BoardView.fxml"));
        login_panel.getChildren().add(load);
    }

}