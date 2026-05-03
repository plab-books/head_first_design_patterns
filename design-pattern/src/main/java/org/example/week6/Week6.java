package org.example.week6;

import org.example.week6.composite.CompositePattern;
import org.example.week6.composite.WithoutCompositePattern;
import org.example.week6.iterator.IteratorPattern;
import org.example.week6.iterator.WithoutIteratorPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Week6 {
    public static void main(String[] args) throws IOException {
        System.out.println("""
                이번주는 6주차다. 애송이들아.
                ----------------------------------
                1. iterator pattern  (적용 전)
                2. iterator pattern  (적용 후)
                3. composite pattern (적용 전)
                4. composite pattern (적용 후)
                -----------------------------------
                1, 2, 3, 4 중 하나를 입력하면 해당 패턴에 대한 설명이 나온다.
                종료하려면 0을 입력해라.
                """);

        WithoutIteratorPattern withoutIteratorPattern = new WithoutIteratorPattern();
        IteratorPattern iteratorPattern = new IteratorPattern();
        WithoutCompositePattern withoutCompositePattern = new WithoutCompositePattern();
        CompositePattern compositePattern = new CompositePattern();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("입력: ");
            int input = Integer.parseInt(br.readLine());

            if (input == 0) {
                System.out.println("종료한다.");
                break;
            }

            switch (input) {
                case 1 -> withoutIteratorPattern.play();
                case 2 -> iteratorPattern.play();
                case 3 -> withoutCompositePattern.play();
                case 4 -> compositePattern.play();
                default -> System.out.println("잘못된 입력이다. 1 ~ 4 중 하나를 입력해라.");
            }
        }
    }
}
