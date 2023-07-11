/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desktopjava;

import javax.swing.JFrame;

/**
 *
 * @author SafidyH
 */
public class etudiants extends JFrame {
    public etudiants() throws ClassNotFoundException {
        setTitle("ETUDIANT");
        setSize(900, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Etudiant etudiant = new Etudiant();
        add(etudiant);
    }
    
}
