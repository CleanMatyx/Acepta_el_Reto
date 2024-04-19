import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        int numUsuarios;
        int meGsutaServA;
        int noMeGsutaServA;
        int meGsutaServB;
        int noMeGsutaServB;
        char bueno;
        for (int i = 0; i < casos; i++) {
            numUsuarios = sc.nextInt();
            meGsutaServA = sc.nextInt();
            noMeGsutaServA= sc.nextInt();
            meGsutaServB = sc.nextInt();
            noMeGsutaServB= sc.nextInt();

            for (int j = 0; j < numUsuarios; j++) {
                int u = sc.nextInt();

                if((meGsutaServA - noMeGsutaServB) > (meGsutaServB - noMeGsutaServB)){
                    bueno = 'a';
                }else{
                    bueno = 'b';
                }
                if(u == 1){
                    if(bueno == 'a'){
                        meGsutaServB++;
                    } else {
                        meGsutaServA++;
                    }
                }else if(u == 2){
                    if(bueno == 'a'){
                        noMeGsutaServA++;
                    } else {
                        noMeGsutaServB++;
                    }
                }else if(u == 3){
                    if (bueno == 'a') {
                        if(meGsutaServA > noMeGsutaServA){
                            noMeGsutaServA++;
                        }else{
                            meGsutaServA++;
                        }
                    }else{
                        if(meGsutaServB > noMeGsutaServB){
                            noMeGsutaServB++;
                        }else{
                            meGsutaServB++;
                        }
                    }
                }
            }
            System.out.println(meGsutaServA + meGsutaServB);
        }
    }
}