package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket s = new Socket("127.0.0.1", 3000);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il primo numero:");
        String num1 = scanner.nextLine();
        out.println(num1);
        System.out.println("Inserisci il secondo numero:");
        String num2 = scanner.nextLine();
        out.println(num2);
        System.out.println("Inserisci l'operatore:");
        String op= scanner.nextLine();
        out.println(op);
        out.flush();
    }
}