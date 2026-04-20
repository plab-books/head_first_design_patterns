package org.example.week4;

import org.example.week4.adapter.AdapterPattern;
import org.example.week4.command.CommandPattern;
import org.example.week4.facade.FacadePattern;

import java.io.BufferedReader;
import java.io.IOException;

public class Week4 {
    public static void main(String[] args) throws IOException {
        System.out.println("""
                이번주는 4주차다. 애송이들아.
                ----------------------------------
                1. command pattern
                2. adaptor pattern
                3. facade pattern
                -----------------------------------
                1, 2, 3 중 하나를 입력하면 해당 패턴에 대한 설명이 나온다.
                종료하려면 0을 입력해라.
                """);
        CommandPattern commandPattern = new CommandPattern();
        AdapterPattern adapterPattern = new AdapterPattern();
        FacadePattern facadePattern = new FacadePattern();

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        while (true) {
            System.out.print("입력: ");
            int input = Integer.parseInt(br.readLine());

            if (input == 0) {
                System.out.println("종료한다.");
                break;
            }

            switch (input) {
                case 1 -> commandPattern.play();
                case 2 -> adapterPattern.play();
                case 3 -> facadePattern.play();
                default -> System.out.println("잘못된 입력이다. 1, 2, 3 중 하나를 입력해라.");
            }
        }
    }
}