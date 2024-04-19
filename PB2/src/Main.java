import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        for(int i = 0; i < casos; i++){
            String nums = sc.next();
            if(nums.length() < 4){
                System.out.println("ERROR");
            }else{
                if(nums.charAt(0) == nums.charAt(nums.length()-2) &&
                        nums.charAt(nums.length()-1) == nums.charAt(1)){
                    System.out.println("EQUILIBRADA");
                }
                else{
                    System.out.println("ERROR");
                }
            }
        }
    }
}