package ngoai.le;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {

    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.printf("danh sach phan tu");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.printf(arr[i] + "");
        }
        return  arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner sc = new Scanner(System.in);
        System.out.println("vui long nhap chi so cua mang");
        int x = sc.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }

    }
}
