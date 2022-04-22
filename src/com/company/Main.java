package com.company;

public class Main {

    public static void main(String[] args) {

        // Строка
        String str = "abcdefg"; // 7 символов

        int count = 0;

        for (int i : str.toCharArray()) count++;
        System.out.println(count);

        //Массив
        int[] abc = new int[10];

        int count2 = 0;

        for (int j : abc) {
            count2++;
        }
        System.out.println(count2);

    }
}
