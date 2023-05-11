package day1;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int v1 = volume();
        int v2 = volume();

        if (v1 > v2) {
            System.out.println("1つめの直方体のほうが大きいです");
        } else if (v1 < v2) {
            System.out.println("2つめの直方体のほうが大きいです");
        } else {
            System.out.println("どちらも同じ体積です");
        }
    }

    static int volume() {
        int a = getInt("a: ");
        int b = getInt("b: ");
        int c = getInt("c: ");

        int v = a * b * c;
        System.out.println("体積は" + v);
        return v;
    }

    static int getInt(String s) {
        Scanner sc = new Scanner(System.in);

        System.out.print(s);
        int x = sc.nextInt();
        return x;

    }
}