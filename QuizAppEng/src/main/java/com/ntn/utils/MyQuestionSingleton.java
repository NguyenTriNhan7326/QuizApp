/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntn.utils;

import com.ntn.utils.Themes.ThemeManager;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import quizappv1.quizappeng.App;

/**
 *
 * @author admin
 */
public class MyQuestionSingleton {
    private static MyQuestionSingleton instance;
    private final Stage stage;
    private MyQuestionSingleton(){
        this.stage = new Stage();
        this.stage.setTitle("Quiz App");
    }
    
    public static MyQuestionSingleton getInstance(){
        if(instance == null){
            instance = new MyQuestionSingleton();
            
        }
        
        return instance;
    }
    public void showMsg(String fxml){
        if (!this.stage.isShowing()){
            try {
                Scene scene = new Scene(new FXMLLoader(App.class.getResource( fxml + ".fxml")).load());
                ThemeManager.applyTheme(scene);
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                ex.printStackTrace();
        }
        }
    }
}
