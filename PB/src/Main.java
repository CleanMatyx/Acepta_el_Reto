import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++)
        {
            String caso = sc.next();
            int ceros = 0;
            int unos = 0;
            for (int j = 0; j < caso.length(); j++) {
                if (caso.charAt(j) == '0') {
                    ceros++;
                } else {
                    unos++;
                }
            }
            String principio = caso.substring(0, 2);
            String finales = caso.substring((caso.length() - 2), caso.length());
            if (ceros == unos){
                if (principio.equals(finales)){
                    System.out.println("EQUILIBRADA");
                }
            } else {
                System.out.println("ERROR");
            }
        }
    }
}