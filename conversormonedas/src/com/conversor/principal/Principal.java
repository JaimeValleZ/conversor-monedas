package com.conversor.principal;

import com.conversor.config.ConsultaMoneda;
import com.conversor.modelo.Moneda;

import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {

        String base_code;
        String target_code;
        Scanner teclado = new Scanner(System.in);
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();

        Moneda moneda = null;

        while(true){
            consultaMoneda.exhibirMenu();
            int opcion = teclado.nextInt();
            double amount = 0;

            switch (opcion){
                case 1:

                    System.out.println("Ingrese el valor que decia convertir");
                    amount = teclado.nextDouble();
                    moneda = consultaMoneda.ConsultaMoneda("USD", "ARS", amount);
                    break;

                case 2:
                    System.out.println("Ingrese el valor que decia convertir");
                    amount = teclado.nextDouble();
                    moneda = consultaMoneda.ConsultaMoneda("USD", "ARS", amount);
                    break;

                case 3:
                    System.out.println("Ingrese el valor que decia convertir");
                    amount = teclado.nextDouble();
                    moneda = consultaMoneda.ConsultaMoneda("USD", "BRL", amount);
                    break;

                case 4:
                    System.out.println("Ingrese el valor que decia convertir");
                    amount = teclado.nextDouble();
                    moneda = consultaMoneda.ConsultaMoneda("BRL", "USD", amount);
                    break;

                case 5:
                    System.out.println("Ingrese el valor que decia convertir");
                    amount = teclado.nextDouble();
                    moneda = consultaMoneda.ConsultaMoneda("USD", "COP", amount);
                    break;

                case 6:
                    System.out.println("Ingrese el valor que decia convertir");
                    amount = teclado.nextDouble();
                    moneda = consultaMoneda.ConsultaMoneda("COP", "USD", amount);
                    break;

                case 7:
                    System.out.println("Gracias por usar mi conversor, hasta la proxima!");
                    return;

                default:
                    System.out.println("Selecciona una opcion valida");
                    break;
            }

            System.out.println("El valor " + amount + " [" + moneda.base_code() + "]" + " corresponde al valor final de =>>> "
                    + moneda.conversion_result() + " [" + moneda.target_code() +"]");
        }

    }

}
