package com.company;

public class Main {

    public static void main(String[] args) {

        LengthString();
        LengthMassive();

        // Кастомный Length

    }
    public static void LengthString() {

        // Строка
        String str = "abcdefg"; // 7 символов

        int count = 0;

        for (int i : str.toCharArray()) count++;
        System.out.println(count);


    }
    public static void LengthMassive() {

        //Массив
        int[] abc = new int[10]; // 10 ячеек

        int count2 = 0;

        for (int j : abc) {
            count2++;
        }
        System.out.println(count2);



    }
}
