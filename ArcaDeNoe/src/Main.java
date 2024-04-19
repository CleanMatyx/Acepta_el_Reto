import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dias, longitud;
        long[] casosDiarios;
        boolean fin = false;
        do {
            dias = scanner.nextInt();
            longitud = scanner.nextInt();
            if(dias == 0 && longitud == 0) {
                fin = true;
            }
            else{
                casosDiarios = new long[longitud];

                for (int i = 0; i < longitud; i++) {
                    casosDiarios[i] = scanner.nextInt();
                }
                int maxIncidencia = 0;
                int sumaCasos = 0;
                for (int i = 0; i < dias; i++) {
                    sumaCasos += (int) casosDiarios[i];
                }
                maxIncidencia = sumaCasos;
                for (int i = dias; i < longitud; i++) {
                    sumaCasos = (int) (sumaCasos - casosDiarios[i - dias] + casosDiarios[i]);
                    maxIncidencia = Math.max(maxIncidencia, sumaCasos);
                }
                System.out.println(maxIncidencia);
            }
        } while (!fin);
    }
}