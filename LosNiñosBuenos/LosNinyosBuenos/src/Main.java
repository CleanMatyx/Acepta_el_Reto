import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Ninyos> ninyos;
        int cantidadNinos;
        do{
            cantidadNinos = scanner.nextInt();
            if(cantidadNinos != 0){
                ninyos = new ArrayList<>();

                for(int i = 0; i < cantidadNinos; i++){
                    int b = scanner.nextInt();
                    int p = scanner.nextInt();
                    ninyos.add(new Ninyos(b, p));
                }
                Collections.sort(ninyos);

                for(Ninyos ninyo : ninyos){
                    System.out.println(ninyo.getB() + " " + ninyo.getP());
                }
                System.out.println();
            }
        }while(cantidadNinos != 0);
    }
}

class Ninyos implements Comparable<Ninyos>{
    private int b;
    private int p;

    public Ninyos(int b, int p) {
        this.b = b;
        this.p = p;
    }
    public int getB() {
        return b;
    }

    public int getP() {
        return p;
    }

    public int compareTo(Ninyos n){
        int resultado = Integer.compare(n.getB(),this.getB());
        if(resultado == 0){
            resultado = Integer.compare(this.getP(),n.getP());
        }
        return resultado;
    }
}


