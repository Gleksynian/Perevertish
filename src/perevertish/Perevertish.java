package perevertish;

import java.util.Scanner;

public class Perevertish {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку:");
        String firstString = scanner.nextLine();
        char[] charFirstString = firstString.toCharArray();
        char[] charSecondString = new char[charFirstString.length];
        for(int i = 0; i < charFirstString.length; i++){
            charSecondString[(charFirstString.length-1)-i]=charFirstString[i];
        }
        String secondString = new String(charSecondString);
        System.out.print("Введенная строка наоборот: ");
        System.out.println(secondString);
    }
    
}