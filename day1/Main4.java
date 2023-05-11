package day1;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a1: ");
        int a1 = sc.nextInt();
        System.out.println(a1);

        System.out.print("b1: ");
        int b1 = sc.nextInt();
        System.out.println(b1);

        System.out.print("c1: ");
        int c1 = sc.nextInt();
        System.out.println(c1);

        int v1 = a1 * b1 * c1;
        System.out.println("体積は" + v1);

        System.out.print("a2: ");
        int a2 = sc.nextInt();
        System.out.println(a2);

        System.out.print("b2: ");
        int b2 = sc.nextInt();
        System.out.println(b2);

        System.out.print("c2: ");
        int c2 = sc.nextInt();
        System.out.println(c2);

        int v2 = a2 * b2 * c2;
        System.out.println("体積は" + v2);

        if (v1 > v2) {
            System.out.println("1つめの直方体のほうが大きいです");
        } else if (v1 < v2) {
            System.out.println("2つめの直方体のほうが大きいです");
        } else {
            System.out.println("どちらも同じ体積です");
        }
    }
}