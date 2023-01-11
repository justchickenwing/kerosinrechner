package gui;

import actions.ClickButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {

    public static JFrame frame;
    JButton goButton;
    JLabel flugzeugtypLabel;
    JLabel flugdistanzLabel;
    JLabel kerosinqualitaetLabel;
    JLabel anzahlPassagiereLabel;
    JLabel zuladungLabel;
    public static JTextField distanzField;
    public static JTextField passagierField;
    public static JTextField zuladungField;
    public static JRadioButton flugzeugtypRadio28;
    public static JRadioButton flugzeugtypRadio36;
    public static JRadioButton flugzeugtypRadio40;
    public static ButtonGroup flugzeugtypGruppe;
    public static JRadioButton kerosinRadioA;
    public static JRadioButton kerosinRadioB;
    public static JRadioButton kerosinRadioC;
    ButtonGroup kerosinGruppe;


    Font myFont = new Font("Helvetica", Font.PLAIN,14);
    public void create() {

        frame = new JFrame("Berechne den Kerosinverbauch...");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(330, 364);
        frame.setLayout(null);

        // Label Flugzeugtyp
        flugzeugtypLabel = new JLabel("Flugzeugtyp");
        flugzeugtypLabel.setBounds(20, 40, 150, 24);
        flugzeugtypLabel.setFont(myFont);

        // Label Flugdistanz
        flugdistanzLabel = new JLabel("Flugdistanz in km");
        flugdistanzLabel.setBounds(20, 100, 150, 24);
        flugdistanzLabel.setFont(myFont);

        // Label Kerosinqualität
        kerosinqualitaetLabel = new JLabel("Kerosinqualität");
        kerosinqualitaetLabel.setBounds(20, 160, 150, 24);
        kerosinqualitaetLabel.setFont(myFont);

        // Label Anzahl Passagiere
        anzahlPassagiereLabel = new JLabel("Anzahl Passagiere");
        anzahlPassagiereLabel.setBounds(20, 220, 150, 24);
        anzahlPassagiereLabel.setFont(myFont);

        // Label Zuladung
        zuladungLabel = new JLabel("Zuladung in Tonnen");
        zuladungLabel.setBounds(20, 255, 150, 24);
        zuladungLabel.setFont(myFont);


        // Radio Flugzeugtyp A380-800 = 28L / 100km Verbrauch bei 275 Tonnen
        flugzeugtypRadio28 = new JRadioButton("A380-800");
        flugzeugtypRadio28.setBounds(170, 20, 130, 24);
        flugzeugtypRadio28.setFont(myFont);
        // Radio Flugzeugtyp A380F = 36L / 100km Verbrauch bei 286 Tonnen
        flugzeugtypRadio36 = new JRadioButton("A380F");
        flugzeugtypRadio36.setBounds(170, 40, 130, 24);
        flugzeugtypRadio36.setFont(myFont);
        // Radio Flugzeugtyp A380-900 = 40L / 100km Verbrauch bei 275 Tonnen
        flugzeugtypRadio40 = new JRadioButton("A380-900");
        flugzeugtypRadio40.setBounds(170, 60, 130, 24);
        flugzeugtypRadio40.setFont(myFont);
        // Gruppe: Radio Flugzeugtyp Alle
        flugzeugtypGruppe = new ButtonGroup();
        flugzeugtypGruppe.add(flugzeugtypRadio28);
        flugzeugtypGruppe.add(flugzeugtypRadio36);
        flugzeugtypGruppe.add(flugzeugtypRadio40);

        // Textfield Flugdistanz
        distanzField = new JTextField();
        distanzField.setBounds(170, 100, 130, 24);
        distanzField.setFont(myFont);


        // Radio Kerosinqualität A = +0% Verbrauch
        kerosinRadioA = new JRadioButton("A");
        kerosinRadioA.setBounds(170, 140, 130, 24);
        kerosinRadioA.setFont(myFont);
        // Radio Kerosinqualität B = +2% Verbrauch
        kerosinRadioB = new JRadioButton("B");
        kerosinRadioB.setBounds(170, 160, 130, 24);
        kerosinRadioB.setFont(myFont);
        // Radio Kerosinqualität C = +8% Verbrauch
        kerosinRadioC = new JRadioButton("C");
        kerosinRadioC.setBounds(170, 180, 130, 24);
        kerosinRadioC.setFont(myFont);
        // Gruppe: Radio Kerosinqualität Alle
        kerosinGruppe = new ButtonGroup();
        kerosinGruppe.add(kerosinRadioA);
        kerosinGruppe.add(kerosinRadioB);
        kerosinGruppe.add(kerosinRadioC);


        // Textfield Anzahl Passagiere
        passagierField = new JTextField();
        passagierField.setBounds(170, 220, 130, 24);
        passagierField.setFont(myFont);

        // Textfield Zuladung Tonnen
        zuladungField = new JTextField();
        zuladungField.setBounds(170, 255, 130, 24);
        zuladungField.setFont(myFont);


        // Button Go
        goButton = new JButton("Go!");
        goButton.setBounds(240, 290, 60, 24);
        goButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ClickButton.clicker();
            }
        });

        // Add Label
        frame.add(flugzeugtypLabel);
        frame.add(flugdistanzLabel);
        frame.add(kerosinqualitaetLabel);
        frame.add(anzahlPassagiereLabel);
        frame.add(zuladungLabel);

        // Add Textfield
        frame.add(distanzField);
        frame.add(passagierField);
        frame.add(zuladungField);

        // Add Flugzeugtyp Radio
        frame.add(flugzeugtypRadio28);
        frame.add(flugzeugtypRadio36);
        frame.add(flugzeugtypRadio40);

        // Add Kerosin Radio
        frame.add(kerosinRadioA);
        frame.add(kerosinRadioB);
        frame.add(kerosinRadioC);

        // Add Button
        frame.add(goButton);



        frame.setVisible(true);
    }
}
