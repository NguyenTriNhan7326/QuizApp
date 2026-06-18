/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntn.utils.Themes;

import quizappv1.quizappeng.App;

/**
 *
 * @author HP 15
 */
public class LightFactory extends ThemeAbstractFactory{

    @Override
    public String getStyleTheme() {
        return App.class.getResource("light.css").toExternalForm();
    }
    
}
