import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        int numAnterior = 0;
        for(int i = 0; i < casos; i++){
            int casos2 = sc.nextInt();
            boolean correcta = true;
            for(int j = 0; j < casos2; j++) {
                int p1 = sc.nextInt();
                if(j==0){
                    numAnterior = p1;
                }
                if (Math.abs(p1) >= numAnterior) {
                    numAnterior = Math.abs(p1);
                }
                else {
                    correcta = false;
                    break;
                }
            }
            if(correcta){
                System.out.println("CORRECTA");
            }
            else{
                System.out.println("INCORRECTA");
            }
        }
    }
}