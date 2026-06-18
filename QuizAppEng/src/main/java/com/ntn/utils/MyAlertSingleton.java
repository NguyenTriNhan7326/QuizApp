/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntn.utils;

import javafx.scene.control.Alert;

/**
 *
 * @author HP 15
 */
public class MyAlertSingleton {
    private static MyAlertSingleton instance;
    private final Alert alert;
    private MyAlertSingleton(){
        alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Quizapp");
        alert.setHeaderText("Quiz App");
    }
    
    public static MyAlertSingleton getinstance(){
        if(instance == null)
            instance = new MyAlertSingleton();
        return instance;
    }
    
    public void showMsg(String content){
        alert.setContentText(content);
        alert.show();
    }
}
