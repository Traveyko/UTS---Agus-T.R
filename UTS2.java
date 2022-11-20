import java.util.Scanner;

public class UTS2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[100];

        System.out.println( "| BY Agus T.R| ");


        for (int i =0; i < nilai.length; i++) {
            System.out.print("Submit the number  " + (i+1) + " : ");
            nilai[i] = input.nextInt();

            if  (i % 2 == 0) {
                System.out.println(nilai[i] + " is an even number\n");

            } else {
                System.out.println(nilai[i] + " is an odd number\n\n");
            }
        }






    }
}