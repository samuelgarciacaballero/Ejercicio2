package segundotrimestre2;

import java.util.Scanner;

public class Segundotrimestre2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String diasemana;
        int numsemana = 0;
        double resto;
        System.out.println("Introduce el dia sin mayúsculas ni acentos: ");
        diasemana = sc.nextLine();

        //FECHA
        switch (diasemana) {
            case "lunes":
                numsemana = 1;
                break;
            case "martes":
                numsemana = 2;
                break;
            case "miercoles":
                numsemana = 3;
                break;
            case "jueves":
                numsemana = 4;
                break;
            case "viernes":
                numsemana = 5;
                break;
            default:
                System.out.println("**ERROR**");
        }

        //HORA
        String hora;
        System.out.println("Introduce la hora (hh:mm): ");
        hora = sc.nextLine();
        String parte[] = hora.split(":");
        String horas = parte[0];
        String minutos = parte[1];
        int numhora = Integer.parseInt(horas);
        int nummins = Integer.parseInt(minutos);

        //CALCULOS
        int horaenmins=numhora*60;
        int semanamins= numsemana*24*60;
        int totalmins= semanamins+horaenmins+nummins;
        resto=8100-totalmins;
        System.out.println("Quedan "+resto+" minutos para el finde");
    }
}
