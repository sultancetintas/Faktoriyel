package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner scan = new Scanner(System.in);
    int faktoriyel = 1;

        System.out.println("Bir sayi giriniz: ");
    int sayi = scan.nextInt();

        for(int i = 1; i <= sayi; i++)
    {
        faktoriyel = faktoriyel * i;
    }
        System.out.println(sayi + "!= " + faktoriyel);
        System.out.println(sayi + "!= " + faktoriyel);

}}
