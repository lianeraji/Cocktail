/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package cocktail;

import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public interface Logger {
    void log(String message);
    
        static Logger textAreaLogger(JTextArea textArea) {
        return message -> {
        SwingUtilities.invokeLater(() -> textArea.append(message + "\n"));
        System.out.println(message);
    };
    }
}