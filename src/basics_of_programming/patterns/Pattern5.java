package basics_of_programming.patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for(int i=0 ; i<n ; i++) {
            for(int j= i<n/2 ? n/2-i : i-n/2 ; j>0 ; j--) {
                System.out.print("\t");
            }
            for(int j=0 ; j<count ; j++) {
                System.out.print("*\t");
            }
            count = i<n/2 ? count+2 : count-2;
            System.out.println("");   
        }
        sc.close();
    }
}
