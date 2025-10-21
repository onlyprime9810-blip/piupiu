import java.util.Scanner;

public class onlyprimee1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите трёхзначное число X: ");
        int X = sc.nextInt();

        int a = X / 100;
        int b = (X / 10) % 10;
        int c = X % 10;

        int Y = c * 100 + b * 10 + a;

        System.out.println("Новое число Y: " + Y);
    }
}