package ru.netology.sqr;

public class SQRService {

    public int calculate(int min, int max) {
        int count = +1;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= 43) {
                if (i * i <= 5) {
                    count++;

                }
            }
        }
        return count;
    }
}
