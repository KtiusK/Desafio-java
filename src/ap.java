import javax.swing.*;
import java.text.DecimalFormat;


public class ap {

    public static void main(String[] args) {

        Object[] options = { " Convertir Divisas", "Convertir Temperatura", " Salir"};
        int elige = JOptionPane.showOptionDialog(null, "Que quieres hacer", "Conversor", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null,options,options[0]);

        if(elige ==2){
            JOptionPane.showMessageDialog(null, "Programa Cerrado");
            System.exit(0);
        }
        if (elige ==0) {
            DecimalFormat formatearDivisa = new DecimalFormat("#.##");
            boolean continuarPrograma = true;
            while (continuarPrograma){
                String [] opciones = { "Pesos a Dolar","Pesos a Euros","Pesos a Yen","Pesos a Won"};
                String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opción: ","Conversor de Monedas",
                        JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
                

                String input = JOptionPane.showInputDialog(null,"Ingrese cantidad de pesos: ");
                double pesos = 0.00;
                try {
                    pesos = Double.parseDouble(input);
                }catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"Valor no válido");
                }

                switch (cambio) {
                    case "Pesos a Dolar" -> {
                        double dolar = pesos / 4.800;
                        JOptionPane.showMessageDialog(null, pesos + "Pesos son: " + formatearDivisa.format(dolar) + "Dolares");
                    }
                    case "Pesos a Euros" -> {
                        double euros = pesos / 5.000;
                        JOptionPane.showMessageDialog(null, pesos + "Pesos a Euros son: " + formatearDivisa.format(euros) + "Euros");
                    }
                    case "Pesos a Yen" -> {
                        double yen = pesos / 7.000;
                        JOptionPane.showMessageDialog(null, pesos + "Pesos a Yen son: " + formatearDivisa.format(yen) + "Euros");
                    }
                    case "Pesos a Won" -> {
                        double won = pesos / 8.000;
                        JOptionPane.showMessageDialog(null, pesos + "Pesos a Won son: " + formatearDivisa.format(won) + "Euros");
                    }
                }
                int confirmar = JOptionPane.showConfirmDialog(null,"¿Desea continuar en el programa?","Confirmar", JOptionPane.YES_NO_CANCEL_OPTION);

                    if (confirmar == JOptionPane.NO_OPTION || confirmar == JOptionPane.CANCEL_OPTION){
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null,"Programa Finalizado");
                }
            }


            }

        if (elige==1){
            boolean seguirPrograma = true;
            while (seguirPrograma){

                    String[] opciones = {"Celsius a Fahrenheit", "Fahrenheit a Celsius"};

                int opcion = JOptionPane.showOptionDialog(null, "Elija una opción: ","Conversor de Temperatura",
                        JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opciones,opciones[0]);

                String valorNominal = JOptionPane.showInputDialog(null,"Ingrese el valor a convertir");
                double valor = 0.0;

                try{
                    valor = Double.parseDouble(valorNominal);
                }catch (NumberFormatException e ){
                    JOptionPane.showMessageDialog(null,"Valor no válido");
                    System.exit(0);
                }
                double resultado = 0;
                if(opcion == 0){
                    resultado = (valor * 9 / 5) +32;
                    JOptionPane.showMessageDialog(null,valor + "Grados Celsius son: " + resultado +  " Grados Fahrenheit");

                }else if(opcion ==1){
                    resultado = (valor - 32) * 5 / 9;
                    JOptionPane.showMessageDialog(null,valor + "Grados Fahrenheit son: " + resultado +  " Grados Celsius");

                }
                int continuar = JOptionPane.showConfirmDialog(null,"¿Desea seguir usando el programa?", "",JOptionPane.YES_NO_OPTION);

                if (continuar == JOptionPane.NO_OPTION){
                    seguirPrograma = false;
                    JOptionPane.showMessageDialog(null,"Programa Finalizado");

                }
            }

        }
    }
}
