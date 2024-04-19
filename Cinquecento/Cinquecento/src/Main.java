import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();
        for (int i = 0; i< casos; i++) {
            int coste = scanner.nextInt();
            int entrega = scanner.nextInt();
            int cambio = entrega - coste;
            int[] monedas = {0, 0, 0, 0, 0, 0, 0, 0};
            if (entrega < coste) {
                System.out.println("DEBE " + (coste - entrega));
            } else {
                do {
                    if (cambio >= 200) {
                        monedas[0] = cambio / 200;
                        cambio = cambio % 200;
                    } else if (cambio >= 100) {
                        monedas[1] = cambio / 100;
                        cambio = cambio % 100;
                    } else if (cambio >= 50) {
                        monedas[2] = cambio / 50;
                        cambio = cambio % 50;
                    } else if (cambio >= 20) {
                        monedas[3] = cambio / 20;
                        cambio = cambio % 20;
                    } else if (cambio >= 10) {
                        monedas[4] = cambio / 10;
                        cambio = cambio % 10;
                    } else if(cambio >= 5) {
                        monedas[5] = cambio / 5;
                        cambio = cambio % 5;
                    } else if (cambio >= 2) {
                        monedas[6] = cambio / 2;
                        cambio = cambio % 2;
                    } else if (cambio >= 1) {
                        monedas[7] = cambio / 1;
                        cambio = cambio % 1;
                    }
                } while (cambio != 0);
                System.out.println(monedas[0] + " " + monedas[1] + " " + monedas[2] + " " + monedas[3] + " "
                        + monedas[4] + " " + monedas[5] + " " + monedas[6] + " " + monedas[7]);
            }
        }
    }
}
