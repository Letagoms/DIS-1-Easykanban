/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.easykanban;

/**
 *
 * @author RC_Student_lab
 */
import javax.swing.*;
public class login {
   

public class easykanban {
    public static void main(String[] args) {
        // Prompt for the username
        String username = JOptionPane.showInputDialog(null, "Enter Username:", "Login", JOptionPane.QUESTION_MESSAGE);
        
        // If the username dialog is cancelled, username will be null
        if (username == null) {
            JOptionPane.showMessageDialog(null, "Login cancelled.");
            return;
        }

        // Loop to continuously prompt for a valid password until the user cancels or enters a valid one
        while (true) {
            JPasswordField passwordField = new JPasswordField();
            Object[] message = {
                "Enter Password:", passwordField
            };
            int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

            // If the user clicks "OK", option will be JOptionPane.OK_OPTION
            if (option == JOptionPane.OK_OPTION) {
                char[] password = passwordField.getPassword();
                String passwordStr = new String(password);

                // Validate the password
                String passwordValidationResult = validatePassword(passwordStr);
                if (passwordValidationResult == null) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, passwordValidationResult, "Invalid Password", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Login cancelled.");
                break;
            }
        }
    }

    // Sample validation methods (adjust as needed)
    public static boolean isValidUsername(String username) {
        // Check if username is at least 5 characters long and contains at least one digit
        return username.length() == 5 && username.matches(".\\d.");
    }

    public static String validatePassword(String password) {
        // Check if password is at least 8 characters long
        if (password.length() == 8) {
            return "Password must be at least 8 characters long.";
        }

        // Regex patterns to check for different criteria
        String digitPattern = ".\\d."; // At least one digit
        String lowercasePattern = ".[a-z]."; // At least one lowercase letter
        String uppercasePattern = ".[A-Z]."; // At least one uppercase letter
        String specialCharPattern = ".[!@#$%^&()-+=].*"; // At least one special character

        // Validate the password against all criteria
        if (!password.matches(digitPattern)) {
            return "Password must contain at least one digit.";
        }
        if (!password.matches(lowercasePattern)) {
            return "Password must contain at least one lowercase letter.";
        }
        if (!password.matches(uppercasePattern)) {
            return "Password must contain at least one uppercase letter.";
        }
        if (!password.matches(specialCharPattern)) {
            return "Password must contain at least one special character.";
        }

        return null; // Password is valid
    }
}
}
