import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        int casos = sc.nextInt();

        for(int i = 0; i < casos;i++){
            String[] l1 = sc.next().split("");
            String[] l2 = sc.next().split("");
            String[] l3 = sc.next().split("");

            String comienzo = l2[1];

            if (comienzo == "O") {
                System.out.println("CIRCULO");
            } else if (comienzo == "X") {
                System.out.println("CRUZ");
            } else {
                System.out.println("IMPOSIBLE");
            }
        }
    }
}