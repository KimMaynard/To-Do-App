package com.example.todoapp;

import javafx.fxml.FXML;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class HelloController {
    @FXML
    private Button doneAddBttn;

    @FXML
    private Button doneDeleteBttn;

    @FXML
    private ListView<?> doneList;

    @FXML
    private Button doneMoveBttn;

    @FXML
    private Button inProgAddBttn;

    @FXML
    private Button inProgDeleteBttn;

    @FXML
    private Button inProgMoveBttn;

    @FXML
    private ListView<String> inProgressList;

    @FXML
    private Button toDoAddBttn;

    @FXML
    private Button toDoDeleteBttn;

    @FXML
    private ListView<?> toDoList;

    @FXML
    private Button toDoMoveBttn;

    @FXML
    private Accordion toDoScene;
}