package org.poo.proyecto;

public class class03 {
    public static void infoAuto( String codigo ,String marca, String color, float dimension, int fuerza){
        System.out.println(
                "FICHA TECNICA SENTRA 2022 "
                        + "\n CODIGO: " + codigo
                        + "\n MARCA: " +  marca
                        + "\n COLOR: "+ color
                        + "\n DIMENSIONES " + dimension + "mm"
                        + "\n CABALLOS DE FUERZA: " + fuerza
                );
    }
    public static void configAuto(String encender, String acelerar, int velocidad, int disminuir, String apagado) {
        System.out.println(
                "El auto esta encendido " + encender
                + "\nel auto acelera: " + acelerar
                + "\nel auto va a una velocidad de " + velocidad + " kms"
                + "\nel auto disminuye su velocidad a " + disminuir + " kms"
                + "\nel auto se detuvo " + apagado );
    }
    public static void info(){
        infoAuto("MR20DD","SENTRA", "PERLA", 4480, 149);
    }
    public static void auto(){
        configAuto("si", "si",150, 120, "si");
    }

}
