package zajecia;

import java.util.Scanner;

public class Zajecia3 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert value in fahrenheit: ");
//        int fahrenheit = scanner.nextInt();
//        int a = 80;
//        fahrenheitToCelsius(a);
//        fahrenheitToCelsius(fahrenheit);
//        fahrenheitToCelsius(70);
//
//        celsiusToFahrenheit(25);
//        celsiusToFahrenheit(35);
//        celsiusToFahrenheit(-7);
        minMax(1,2,3);
        System.out.println();
        minMax(1,1,2);

        int number1,number2,number3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number: ");
        number1 = scanner.nextInt();
        System.out.println("Insert second number: ");
        number2 = scanner.nextInt();
        System.out.println("Insert third number: ");
        number3 = scanner.nextInt();
        minMax(number1, number2, number3);
    }

    public static void fahrenheitToCelsius(int fahrenheit) {
        //(fahrenheit - 32) / 1.8
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.println(fahrenheit + "F = " + celsius + "C");
    }

    public static void celsiusToFahrenheit(int celsius) {
        //1.8 * celsius + 32
        double fahrenheit = 1.8 * celsius + 32;
        System.out.println(celsius + "C = " + fahrenheit + "F");
    }
    public static void minMax(int a, int b, int c) {
        // wyswietl najmniejsza, wyswietl najwieksza
        //1. max
        int min, max;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max  = b;
        } else {
            max = c;
        }

        //2. min
        if (a <= b && a <= c) {
            min = a;
        } else if (b <= a && b <= c) {
            min  = b;
        } else {
            min = c;
        }

        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);
    }
}
