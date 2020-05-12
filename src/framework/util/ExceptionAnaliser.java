/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.util;

import framework.base.Constants;

/**
 *
 * @author wolfi
 */
public class ExceptionAnaliser {

    public static void errorException(Exception error) {
        error.printStackTrace();
    }

    public static void error(String message) {
        System.out.println("Exra info: " + message);        
    }
    
    public static void errorException(Exception error, String message) {
        System.out.println("Error humanized: " + message);
        error.printStackTrace();
    }

    public static void info(String i) {
        if (Constants.DEBUG_MODE_INFO) {
            System.out.println(i);
        }
    }
}
