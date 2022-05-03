package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n" + sum());
    }
    static int sum() {
        int count = 0;
        for (int i = 1; i <300 ; i++) {
            if(i % 3 == 0 && i % 4 == 0 && i % 5 == 0){
                count+=i;
                System.out.print(i + " ");
            }
        }
        return count;
    }
}
