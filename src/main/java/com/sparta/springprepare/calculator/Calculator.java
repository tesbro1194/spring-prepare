package com.sparta.springprepare.calculator;

public class Calculator {
    public Double operate(double num1, String op, double num2) {
        switch (op) {
            case "*":
                return num1 * num2;  // 나올 수 있는 반환을 하나의 엣지 라고 한다.
            case "/":
                if (num2 != 0) {
                    return num1 / num2;  // 모든 엣지를 테스트 하는 것이 단위 테스트를 모두 끝낸 것.
                } else {
                    return null; // 엣지
                }
            case "+":
                return num1 + num2;  // 엣지
            case "-":
                return num1 - num2;   // 엣지
            default:
                throw new IllegalArgumentException("잘못된 연산자입니다.");  // 엣지
        }
    }
}
