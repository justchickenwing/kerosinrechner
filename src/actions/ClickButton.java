package actions;

import javax.swing.JOptionPane;

import gui.Gui;

public class ClickButton {
    static double distanz;
    static double kerosin;
    static double passagierGewicht;
    static double zuladung;
    static double gewicht;
    static double verbrauch;
    static double gew;                  // Formel für den Verbrauch: gesamtgewicht/(gewichtFlugzeug/100)/100*verbrauch  -> zB (275+zusatzgewicht)/2.75/100*28
    static  double verbrauch100km;


    public static void clicker() {


        if (Gui.flugzeugtypRadio28.isSelected()){
            gewicht = 275;
            gew = 2.75;
            verbrauch = 28;
        } else if (Gui.flugzeugtypRadio36.isSelected()){
            gewicht = 286;
            gew = 2.86;
            verbrauch = 36;
        } else if (Gui.flugzeugtypRadio40.isSelected()){
            gewicht = 275;
            gew = 2.75;
            verbrauch = 40;
        }

        if (Gui.distanzField.getText().isEmpty()){
            distanz = 0;
        } else {
            distanz = Double.parseDouble(Gui.distanzField.getText());
        }


        if (Gui.zuladungField.getText().isEmpty()){
            zuladung = 0;
        } else {
            zuladung = Double.parseDouble(Gui.zuladungField.getText());
        }

        if (Gui.passagierField.getText().isEmpty()){
            passagierGewicht = 0;
        } else {
            passagierGewicht = Double.parseDouble(Gui.passagierField.getText())*0.075;
        }


        gewicht = gewicht + zuladung + passagierGewicht;
        verbrauch100km = gewicht/gew/100*verbrauch;


        // Kerosinverbrauch Qualität Steigung
        if (Gui.kerosinRadioB.isSelected()){
            verbrauch100km = verbrauch100km*102/100;
        } else if (Gui.kerosinRadioC.isSelected()){
            verbrauch100km = verbrauch100km*108/100;
        }





        JOptionPane.showMessageDialog(null, "Gesamtverbrauch bei " + distanz + " km: " + verbrauch100km*distanz/100 + "L Kerosin");

    }

}
