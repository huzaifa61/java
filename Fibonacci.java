import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of elements to be dislplayed: ");
        int n = input.nextInt();

        if(n==1){
            System.out.println(0);
        }else if (n==2){
            System.out.println(0 + " " + 1);
        }else{
            int a = 0;
            int b = 1;
            System.out.print(a + " " + b + " ");

            int c;
            for(int i=0; i<n-2; i++){
                c = a+b;
                a = b;
                b = c;
                System.out.print(c + " ");
            }
        }
    }
}
