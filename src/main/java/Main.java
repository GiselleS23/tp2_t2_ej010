/* 10.- Elabore un algoritmo que, dado como dato una temperatura en grados Centígrados, calcule los grados Fahrenheit y determine el deporte qué es apropiado practicar a esa temperatura, teniendo en cuenta la siguiente tabla:
DEPORTE TEMPERATURA en grados Fahrenheit
Natación>85
Tenis 70<TEMP<=85
Golf 35<TEMP<=70
Esquí 32<TEMP<=35
Otros <=32 
Sacchetti Maria Giselle C2*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en grados Centígrados:");
        double tempCelsius = input.nextDouble();

        
        double tempFahrenheit = (tempCelsius * 9 / 5) + 32;

        System.out.println("La temperatura en grados Fahrenheit es: " + tempFahrenheit);

        
        String deporte = determinarDeporte(tempFahrenheit);
        System.out.println("El deporte apropiado a practicar a esta temperatura es: " + deporte);

        input.close();
    }

    public static String determinarDeporte(double tempFahrenheit) {
        if (tempFahrenheit > 85) {
            return "Natación";
        } else if (tempFahrenheit > 70) {
            return "Tenis";
        } else if (tempFahrenheit > 35) {
            return "Golf";
        } else if (tempFahrenheit > 32) {
            return "Esquí";
        } else {
            return "Otros";
        }
    }
}
