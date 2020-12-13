package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("NHập vào kích thước mảng:");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("To quá bạn êi");
            }
        } while (size > 20);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào vị trí thứ " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }

        int max = array[0];
        int index=1;
        for (int i = 0; i<array.length;i++){

            if (array[i]>max){
                array[i]=max;
                index = i + 1;
            }
        }System.out.println("giá trị lớn nhất là: "+ max + ", vị trí thứ " + index);


    }

}
