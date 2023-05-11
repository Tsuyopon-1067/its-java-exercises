package day1;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.println(a);

        System.out.print("b: ");
        int b = sc.nextInt();
        System.out.println(b);

        System.out.print("c: ");
        int c = sc.nextInt();
        System.out.println(c);

        int v = a * b * c;
        System.out.println("体積は" + v);

    }
}